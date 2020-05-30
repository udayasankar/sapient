package com.birthday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Blows {
	
	public static int findBlows(List<Integer> hei)
	{
		if(hei.size()>50) return 0;
		List<Integer> result=hei.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Blows Required :"+result);
		return result.size();
	}
	
	public static void main(String[] args)
	{
		List<Integer> hei = new ArrayList<>();
     	hei.add(8);
     	hei.add(7);
     	hei.add(7);
     	hei.add(5);
     	hei.add(3);
     	hei.add(8);
     	hei.add(8);
     	hei.add(3);
     	hei.add(5);
     	hei.add(3);
     	hei.add(7);
     	int result=findBlows(hei);
     	if(result>0)
     		System.out.println("Minimum blows Required :"+result); 
     	else
     		System.out.println("Maximum 50 candles allowed"); 	
        
	}

}

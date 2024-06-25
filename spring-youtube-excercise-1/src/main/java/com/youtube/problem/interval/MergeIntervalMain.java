package com.youtube.problem.interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalMain {

	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		
		list = MergeInterval(list);
		System.out.println("Result : "+list);
		
		list.clear();
		list.add(new Interval(1,3));
		list.add(new Interval(5,7));
		list.add(new Interval(8,10));
		list.add(new Interval(11,12));
		list.add(new Interval(4,9));
		
		list = MergeInterval(list);
		System.out.println("Result1 : "+list);
	}
	
	public static List<Interval> MergeInterval(List<Interval> list)
	{
		list.sort(Comparator.comparingInt(in -> in.start));
		
		Interval current = null;
		List<Interval> result = new ArrayList<>();
		current=list.get(0);
		
		for(int i=1;i<list.size();i++)
		{
			if(current.end > list.get(i).start)
			{
				current.end = Math.max(current.end, list.get(i).end);
			}	
			else
			{
				result.add(new Interval(current.start,current.end));
				current = list.get(i);
			}	
		}
		result.add(new Interval(current.start,current.end));
		return result;
		
	}

}

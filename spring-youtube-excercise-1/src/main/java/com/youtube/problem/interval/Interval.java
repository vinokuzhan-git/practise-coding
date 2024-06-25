package com.youtube.problem.interval;

public class Interval {
	
	public int start;
	public int end;
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

}

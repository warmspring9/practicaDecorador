package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Equipment extends Item{
	
	ArrayList<Integer> stats;
	ArrayList<String> items;
	
	public Equipment() {
		items = new ArrayList<String>();
		stats = new ArrayList<Integer>();
		stats.add(0);
		stats.add(0);
		stats.add(0);
		stats.add(0);
	}
	
	@Override
	public List<Integer> stats() {
		return stats;
	}

	@Override
	public List<String> items() {
		return items;
	}
	
	
}

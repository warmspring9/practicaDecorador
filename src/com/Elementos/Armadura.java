package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Armadura extends Item{
	Item item;
	
	public Armadura(Item pItem) {
		this.item = pItem;
	}
	@Override
	public List<Integer> stats() {
		ArrayList<Integer> stats = (ArrayList<Integer>) item.stats();
		stats.set(0, stats.get(0) + 20);
		stats.set(2, stats.get(2) + 20);
		return stats;
	}

	@Override
	public List<String> items() {
		ArrayList<String> inventory = (ArrayList<String>) item.items();
		inventory.add("armadura");
		return inventory;
	}
		
}

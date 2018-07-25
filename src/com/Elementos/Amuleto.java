package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Amuleto extends Item{
	Item item;
	
	public Amuleto(Item pItem) {
		this.item = pItem;
	}
	@Override
	public List<Integer> stats() {
		ArrayList<Integer> stats = (ArrayList<Integer>) item.stats();
		stats.set(3, stats.get(0) + 10);
		return stats;
	}

	@Override
	public List<String> items() {
		ArrayList<String> inventory = (ArrayList<String>) item.items();
		inventory.add("espada");
		return inventory;
	}
	
}

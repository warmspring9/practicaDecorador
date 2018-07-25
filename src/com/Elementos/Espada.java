package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Espada extends Item{
	Item item;
	
	public Espada(Item pItem) {
		this.item = pItem;
	}
	@Override
	public List<Integer> stats() {
		ArrayList<Integer> stats = (ArrayList<Integer>) item.stats();
		stats.set(0, stats.get(0) + 1);
		stats.set(1, stats.get(1) + 10);
		stats.set(2, stats.get(2) + 10);
		return stats;
	}

	@Override
	public List<String> items() {
		ArrayList<String> inventory = (ArrayList<String>) item.items();
		inventory.add("espada");
		return inventory;
	}
	
}

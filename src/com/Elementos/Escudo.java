package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Escudo extends Item{
	Item item;
	
	public Escudo(Item pItem) {
		this.item = pItem;
	}
	@Override
	public List<Integer> stats() {
		ArrayList<Integer> stats = (ArrayList<Integer>) item.stats();
		stats.set(0, stats.get(0) + 10);
		stats.set(2, stats.get(2) + 40);
		return stats;
	}

	@Override
	public List<String> items() {
		ArrayList<String> inventory = (ArrayList<String>) item.items();
		inventory.add("espada");
		return inventory;
	}
	
}

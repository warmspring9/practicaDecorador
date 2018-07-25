package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
	String nombre = "";
	int vida;
	int ataque;
	int defensa;
	int magia;
	Item activeItems = new Equipment();
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Integer> stats(){
		ArrayList<Integer> buffs = (ArrayList<Integer>) activeItems.stats();
		buffs.set(0, buffs.get(0)+vida);
		buffs.set(1, buffs.get(1)+ataque);
		buffs.set(2, buffs.get(2)+defensa);
		buffs.set(3, buffs.get(3)+magia);
		return buffs;
	}
	public Item openInventory() {
		return activeItems;
	}
	public void setEquipment(Item pEquipment) {
		activeItems = pEquipment;
	}
}

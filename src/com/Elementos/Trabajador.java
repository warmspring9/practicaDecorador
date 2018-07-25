package com.Elementos;

import java.util.ArrayList;
import java.util.List;

public class Trabajador extends Personaje{
	
	public Trabajador() {
		this.vida = 25;
		this.ataque = 10;
		this.defensa = 10;
		this.magia = 10;
		this.nombre = "Mano de obra barata :D";
	}
	@Override
	public List<Integer> stats(){
		ArrayList<Integer> buffs = (ArrayList<Integer>) super.stats();
		ArrayList<String> items = (ArrayList<String>) this.activeItems.items();
		if (items.contains("amuleto")){
			buffs.set(3, buffs.get(3)-10);
		}
		return buffs;
	}
}

package com.Elementos;

public class main {

	public static void main(String[] args) {
		Trabajador Jorge = new Trabajador();
		Mago Albus = new Mago();
		Guerrero Garrosh = new Guerrero();
		
		Espada escalibur = new Espada(Jorge.openInventory());
		Amuleto nose = new Amuleto(escalibur);
		Jorge.setEquipment(nose);
		
	}

}

package net.ro.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.ro.cambioBase.BaseManager;

public class MandarDatos implements ActionListener
{
	Main_base base;
	BaseManager b;
	
	MandarDatos(Main_base _b)
	{
		base = _b;
		b = new BaseManager(base);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		// 0 para calcular el resultado de los dos inputs
		// 1 para cambiar de base el numero introducido
		
		if(arg0.getSource().toString().substring(20, 21).equals("0"))
		{
			// TODO ejecutar el codigo para hacer las cuentas
			
			System.out.println("Botón 0");
		}
		else
		{
			// TODO ejecutar el codigo para cambiar el numero de base en base
			
			System.out.println("Botón 1");
			
			b.act();
		}
	}
}
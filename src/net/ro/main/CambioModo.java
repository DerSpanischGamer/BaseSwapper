package net.ro.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambioModo implements ActionListener
{
	Main_base base;
	
	CambioModo(Main_base _b) { base = _b; }
	
	public void actionPerformed(ActionEvent arg0)
	{
		String temp = arg0.getSource().toString().substring(20, 21);
		
		base.desactivar(Integer.parseInt(temp));
	}

}
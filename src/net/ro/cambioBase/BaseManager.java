package net.ro.cambioBase;

import net.ro.main.Main_base;

public class BaseManager
{
	public String[] prim;
	public String[] sec;
	
	Main_base ba;
	private Base b;
	
	public BaseManager(Main_base _b)
	{
		ba = _b;
		b = new Base();
	}
	
	// Actualiza las bases
	public void act()
	{
		prim = b.hacerBase(ba.input.getText(), b.cogerBase(ba.input.getText()));
		sec = b.hacerBase(ba.input_.getText(), b.cogerBase(ba.input_.getText()));
		
		ba.cambio_out.setText(Integer.toString(b.cambioBase(prim, sec, ba.cambio.getText())));
	}
}
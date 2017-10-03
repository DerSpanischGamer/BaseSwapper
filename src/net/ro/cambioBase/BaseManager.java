package net.ro.cambioBase;

import net.ro.main.Main_base;

public class BaseManager
{
	public String[] prim;
	public String[] sec;
	
	private String[] pred;
	String _pred = "0,1,2,3,4,5,6,7,8,9";
	
	Main_base ba;
	private Base b;
	
	public BaseManager(Main_base _b)
	{
		ba = _b;
		b = new Base();
		
		pred = b.hacerBase(_pred, b.cogerBase(_pred));
	}
	
	// Actualiza las bases
	public void act()
	{
		prim = b.hacerBase(ba.input.getText(), b.cogerBase(ba.input.getText()));
		sec = b.hacerBase(ba.input_.getText(), b.cogerBase(ba.input_.getText()));
		
		ba.cambio_out.setText(b.cambioBaseDiez(pred, sec, b.cambioBase(prim, pred, ba.cambio.getText())));
	}
}
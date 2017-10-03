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
		// TODO Mirar que todos lo que se introduzca exista :)
		
		prim = b.hacerBase(ba.input.getText(), b.cogerBase(ba.input.getText()));
		sec = b.hacerBase(ba.input_.getText(), b.cogerBase(ba.input_.getText()));
		
		if (comprobar(ba.cambio.getText(), prim)) ba.cambio_out.setText(b.cambioBaseDiez(pred, sec, b.cambioBase(prim, pred, ba.cambio.getText()))); else error("ERROR");
	}
	
	Boolean comprobar(String txt, String[] str)
	{
		Boolean temp = true;
		
		for (int i = 0; i < txt.length(); i++)
		{
			for (int a = 0; a < str.length; a++)
			{
				if (txt.substring(i, i + 1).equals(str[a])) break;
				
				if (a == str.length - 1 && !txt.substring(i, i + 1).equals(str[a])) temp = false;
			}
		}
		
		return temp;
	}
	
	void error(String _error) { ba.cambio_out.setText(_error); }
}
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
		int temp = 0;
		
		if (!nullos(ba.input.getText()))
		{
			if (b.cogerBase(ba.input.getText()) >= 2)
			{
				if (!repeticion(ba.input.getText()))
				{
					prim = b.hacerBase(ba.input.getText(), b.cogerBase(ba.input.getText())); 
					
					temp++;
				}
				else { error("ERROR, base_in repite cifras"); }
			}
			else { error("ERROR, base_in < 2"); }
		}
		else { error("ERROR, base_in cifra ~E~"); }
		
		
		
		
		
		if (!nullos(ba.input_.getText()))
		{
			if (b.cogerBase(ba.input_.getText()) >= 2)
			{
				if (!repeticion(ba.input_.getText()))
				{
					sec = b.hacerBase(ba.input_.getText(), b.cogerBase(ba.input_.getText()));
					
					temp++;
				}
				else { error("ERROR, base_out repite cifras"); }
			}
			else { error("ERROR, base_out < 2"); }
		}
		else { error("ERROR, base_out cifra ~E~"); }
		
		if (temp == 2) { if (comprobar(ba.cambio.getText(), prim)) ba.cambio_out.setText(b.cambioBaseDiez(pred, sec, b.cambioBase(prim, pred, ba.cambio.getText()))); else error("ERROR, num ~E~"); }
	}
	
	Boolean comprobar(String txt, String[] str)
	{
		// Devuelve verdadero si el número introducido no contiene ninguna cifra que no haya sido indicada por la base
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
	
	Boolean repeticion(String txt)
	{
		// Devuelve falso para indicar que no se repiten, por lo que en cuanto se repita uno se pondrá en verdadero y la función if no dejará que avance
		Boolean temp = false;
		String[] temp_ = b.hacerBase(txt, b.cogerBase(txt));
		
		for (int i = 0; i < temp_.length; i++)
		{
			for (int a = i; a < temp_.length; a++)
			{
				if (temp_[i].equals(temp_[a]) && i != a) temp = true;
			}
		}
		
		return temp;
	}
	
	Boolean nullos(String txt)
	{
		// Devuevle falso si al crear el array no habrá huecos, es decir que se pongan dos comas seguidas o una coma al final, dejando un nullo
		Boolean temp = false;
		
		// TODO mirar si hay algun lugar donde pueda aparecer algun nullo, casos conocidos: dos comas seguidas y una coma al final
		// creo que sera mejor mirar primero si hay algun nullo por la mitad del camino y por ultimo al final del texto
		// ya que al final del texto el esta funcion puede corregir ese pequeño fallo :)
		
		return temp;
	}
	
	void error(String _error) { ba.cambio_out.setText(_error); }
}
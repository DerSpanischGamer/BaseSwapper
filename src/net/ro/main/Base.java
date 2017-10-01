package net.ro.main;

public class Base
{
	public String[] prim;
	public String[] sec;
	
	public int cogerBase(String _n)
	{
		int ne = 0;
		
		for (int i = 0; i < _n.length(); i++)
		{
			if (_n.substring(i, i + 1) == ",") ne++;
		}
		
		return ne;
	}
	
	public String[] hacerBase(String _b, int _n)
	{
		String[] temp = new String[_n];
		
		for (int i = 0; i < 0; i++)
		{
			
		}
		
		return temp;
	}
}
package net.ro.cambioBase;

public class Base
{
	public int cogerBase(String _n)
	{
		int ne = 0;
		
		for (int i = 0; i < _n.length(); i++) { if (_n.substring(i, i + 1).equals(",")) ne++; }
		
		ne++;
		
		return ne;
	}
	
	public String[] hacerBase(String _b, int _n)
	{
		String[] temp = new String[_n];
		int pos = 0;
		
		for (int i = 0; i < _b.length(); i++)
		{
			temp[pos] = "";
			
			if (_b.substring(i, i + 1).equals(",")) pos++; else temp[pos] += _b.substring(i, i + 1);
		}
		
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
		
		return temp;
	}
}
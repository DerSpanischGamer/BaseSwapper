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
			if (temp[pos] == null) temp[pos] = "";
			
			if (_b.substring(i, i + 1).equals(",")) pos++; else temp[pos] += _b.substring(i, i + 1);
		}
		
		return temp;
	}
	
	public int cambioBase(String in, int out, int num)
	{
		int temp = 0;
		
		String _num = Integer.toString(num);
		int[] temp_ = new int[_num.length()];
		
		// TODO hacer el cambio del valor que tiene una cifra en una base a la base decimal, hoy me da pereza :3
		
		for (int i = temp_.length - 1; i > 0; i--)
		{
			temp_[i] = Integer.parseInt(_num.substring(temp_.length - i, temp_.length - i + 1));
		}
		
		for (int i = 0; i < temp_.length; i++)
		{
			temp += temp_[i] * in^i;
		}
		
		return temp;
	}
}
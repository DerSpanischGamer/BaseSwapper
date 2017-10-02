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
	
	public int cambioBase(String[] in, String[] out, String num)
	{
		int temp = 0;
		
		for (int i = 0; i < num.length(); i++)
		{
			for (int a = 0; a < in.length; a++)
			{
				if (num.substring(i, i + 1).equals(in[a]))
				{
					temp += a * Math.pow(in.length, num.length() - i - 1);
					break;
				}
			}
		}
		
		return temp;
	}
}
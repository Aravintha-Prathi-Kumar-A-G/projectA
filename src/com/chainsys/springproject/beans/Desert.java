package com.chainsys.springproject.beans;

public abstract class Desert
{ 
	public String name;
	}
class Icecream extends Desert 
{
	public Icecream()
	{
		name = "Chocolates";
	}
	
}
class Sweets extends Desert {
	public Sweets()
	{
		name = "Lattu";
	}
	
}
class Cakes extends Desert
{
	public Cakes()
	{
		name = "Black Forest";
	}
	
}

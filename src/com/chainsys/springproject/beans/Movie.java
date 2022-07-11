package com.chainsys.springproject.beans;

public class Movie {
	public String title;
	public String director;
	
	public Movie (String filmtitle,String filmdirector)
	{
		title = filmtitle;  
		director = filmdirector; 
		System.out.println("Movie Title :  " + title);
		System.out.println("Movie Director :  " + director);
	
	}

}

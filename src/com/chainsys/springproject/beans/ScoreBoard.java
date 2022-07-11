package com.chainsys.springproject.beans;

public class ScoreBoard {
	
	public int targetScore;
	
	private ScoreBoard ()
	{
		System.out.println("ScoreBoard Object is created");
	}
	private ScoreBoard ( int runs)
	{
		targetScore=runs;
		System.out.println("ScoreBoard Object is created");
		System.out.println("Target Score : " + targetScore);
	}
	
	// factory method
	public static ScoreBoard createObject ()
	{
		return new ScoreBoard();
	}
	public static ScoreBoard createObject (int runs)
	{
		return new ScoreBoard(runs);
	}

}

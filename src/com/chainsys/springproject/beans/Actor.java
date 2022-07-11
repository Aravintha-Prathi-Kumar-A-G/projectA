package com.chainsys.springproject.beans;

public class Actor {
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
		
		public void print()
		{
			System.out.println("Actor ID  :  " + this.id);
			System.out.println("Actor Name  :  " + this.name);
		}
		 public Actor ()
		    {
		    	System.out.println("Actor object created "+ hashCode());
		    }


	}




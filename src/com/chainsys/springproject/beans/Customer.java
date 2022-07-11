package com.chainsys.springproject.beans;

public class Customer {

    private int id;
    private String name;
    
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
    public void print() {
        System.out.println("Customer ID  : "+this.getId());
        System.out.println("Customer Name: "+this.getName());
    }
    public Customer()
    {
    	System.out.println("Customer object created "+ hashCode());
    }

}
package com.example.demo.sync.coll013;

public class Task implements Comparable<Task>{
	
	private int id ;
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
	
	@Override
	public int compareTo(Task task) {
		return this.id > task.id ? 1 : (this.id < task.id ? -1 : 0);  
	}
	
	@Override
    public String toString(){
		return this.id + "," + this.name;
	}
	
}

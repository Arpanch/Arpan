package com.arpan.merc;

public class Stations {

	private String name;

	private int ditanceFromSource;

	private int limit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDitanceFromSource() {
		return ditanceFromSource;
	}

	public void setDitanceFromSource(int ditanceFromSource) {
		this.ditanceFromSource = ditanceFromSource;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public Stations(String name, int ditanceFromSource, int limit) {
		super();
		this.name = name;
		this.ditanceFromSource = ditanceFromSource;
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Stations [name=" + name + ", ditanceFromSource=" + ditanceFromSource + ", limit=" + limit + "]";
	}

	
}

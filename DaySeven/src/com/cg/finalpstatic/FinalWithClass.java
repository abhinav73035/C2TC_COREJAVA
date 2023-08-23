package com.cg.finalpstatic;

public final class FinalWithClass {
	private int y;

	public FinalWithClass(int y) {
		super();
		this.y = y;
	}
	public void finalClass( int x) {
		y=x;
		System.out.println("y="+y);
		System.out.println("Final Class not inheritate");
	}
    
}

package com.cg.lambdademo;

public class WithoutLambdaExpression implements Darawable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Darawable d1 = new Darawable() {
			public void draw() {
				System.out.println("Draw");
			}
		};
        d1.draw();
	}

	

}

package com.cg.polymorphism;

public class OverloadingMethod {
private float x;
private float y;


public int m2(int x) {
	this.x=x;
	return x;//more priority local variable
}
public float m2(float x) {
	this.x=x;
	return this.x;// this is class level variable
}
public float m2(float x,int y) {
	this.x=x;
	this.y=y;
	return (this.x+this.y);
}
public float m2(int x,float y) {
	this.x=y;
	this.y=x;
	return this.x+this.y;
}
public float m2(int x,int y) {
	this.x=x;
	this.y=y;
	return (this.x+this.y);
}
public float m2(float y,float x) {
	this.x=x;
	this.y=y;
	return (this.x+this.y);
}
/* if change the return type they gives error duplicate method
public float m2(int x) {
 this.x=x;
 return this.x;
} */

}

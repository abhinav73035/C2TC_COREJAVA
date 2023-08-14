package com.cg.multilevelinheritance;

public class State extends Country{
private String statename;
private String statecapital;
public State() {
	super();
	System.out.println("Create State class object");
	// TODO Auto-generated constructor stub
}
public String getStatename() {
	return statename;
}
public void setStatename(String statename) {
	this.statename = statename;
}
public String getStatecapital() {
	return statecapital;
}
public void setStatecapital(String statecapital) {
	this.statecapital = statecapital;
}
public State(String statename, String statecapital) {
	super();
	this.statename = statename;
	this.statecapital = statecapital;
}
@Override
public String toString() {
	return "State [statename=" + statename + ", statecapital=" + statecapital + ", getCountryname()=" + getCountryname()
			+ ", getCapital()=" + getCapital() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}

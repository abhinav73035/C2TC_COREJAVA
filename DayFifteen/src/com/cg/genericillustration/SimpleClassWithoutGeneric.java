package com.cg.genericillustration;

public class SimpleClassWithoutGeneric {
	int values;
	float fvalue;
	public int getValues() {
		return values;
	}
	public void setValues(int values) {
		this.values = values;
	}
	public float getFvalue() {
		return fvalue;
	}
	public void setFvalue(float fvalue) {
		this.fvalue = fvalue;
	}
	@Override
	public String toString() {
		return "SimpleClassWithoutGeneric [values=" + values + ", fvalue=" + fvalue + "]";
	}
	

}

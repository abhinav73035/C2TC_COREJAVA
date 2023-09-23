package com.cg.genericillustration;

public class GenericDemo<T> {
	// Generic are basically use foe type safety its hold same type values
	T values;
	

	@Override
	public String toString() {
		return "GenericDemo [values=" + values + "]";
	}

	public T getValues() {
		return values;
	}

	public void setValues(T values) {
		this.values = values;
	}
	

}

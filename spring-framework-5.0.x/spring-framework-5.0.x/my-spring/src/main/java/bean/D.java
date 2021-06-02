package bean;

import annotation.MyAutowired;

public class D {
	private String name = "aa";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "D{" +
				"name='" + name + '\'' +
				'}';
	}

	//	@MyAutowired
//	private C c;
//
//	public C getC() {
//		return c;
//	}
//
//	public void setC(C c) {
//		this.c = c;
//	}
}

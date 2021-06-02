package bean;

import annotation.MyAutowired;
import org.springframework.stereotype.Component;

@Component
public class C {
	@MyAutowired
	private D dClass;
	private String cName;

	public String getcName() {
		return cName;
	}

	public D getdClass() {
		return dClass;
	}

	public void setdClass(D dClass) {
		this.dClass = dClass;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "C{" +
				"dClass=" + dClass +
				", cName='" + cName + '\'' +
				'}';
	}
}

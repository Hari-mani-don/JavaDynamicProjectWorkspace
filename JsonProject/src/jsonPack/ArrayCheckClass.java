package jsonPack;

import java.util.ArrayList;
import java.util.List;

public class ArrayCheckClass {
	Employee list[] = new Employee[2];

	public ArrayCheckClass() {

	}

	public ArrayCheckClass(Employee list[] ) {
		super();
		this.list = list;
	}

	public Employee[] getList() {
		return list;
	}

	public void setList(Employee list[]) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ArrayCheckClass [list=" + list + "]";
	}

}
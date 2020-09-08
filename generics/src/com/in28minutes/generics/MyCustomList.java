package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
	ArrayList<T> list = new ArrayList();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public T get(int i) {
		return list.get(i);
	}
}

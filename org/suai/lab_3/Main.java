package org.suai.lab_3;

import org.suai.lab_3.matrixes.*;

class Main {
	public static void main(String[] args) {
		SquareMatrix s = new SquareMatrix(4);
		HalfMatrix h = new HalfMatrix(2, 4);
		h.setElement(0, 0, 1);
		h.setElement(0, 1, 2);
		h.setElement(0, 2, 3);
		System.out.println(h.sum(s));
		
		HalfMatrix h1 = new HalfMatrix(1, 3);
		h1.setElement(0, 0, 1);
		h1.setElement(0, 1, 2);
		h1.setElement(0, 2, 3);
		Matrix m = new Matrix(3, 2);
		m.setElement(0, 0, 1);
		m.setElement(1, 0, 1);
		m.setElement(2, 0, 1);
		System.out.println(h1.product(m));
	}
}

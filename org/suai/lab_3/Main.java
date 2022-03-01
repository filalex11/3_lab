package org.suai.lab_3;

import org.suai.lab_3.matrixes.*;

class Main {
	public static void main(String[] args) {
		SquareMatrix s1 = new SquareMatrix(4);
		HalfMatrix h1 = new HalfMatrix(4, 4);
		h1.setElement(0, 0, 4);
		h1.setElement(0, 1, 5);
		h1.setElement(0, 2, 6);
		h1.setElement(1, 0, 1);
		h1.setElement(1, 1, 2);
		h1.setElement(1, 2, 3);
		System.out.println(h1.product(s1));
		
		HalfMatrix h2 = new HalfMatrix(2, 3);
		h2.setElement(0, 0, 1);
		h2.setElement(0, 1, 2);
		h2.setElement(0, 2, 3);
		Matrix m1 = new Matrix(2, 3);
		m1.setElement(0, 0, 4);
		m1.setElement(0, 1, 5);
		m1.setElement(0, 2, 6);
		m1.setElement(1, 0, 7);
		m1.setElement(1, 1, 8);
		m1.setElement(1, 2, 9);
		System.out.println(h2.sum(m1));
	}
}

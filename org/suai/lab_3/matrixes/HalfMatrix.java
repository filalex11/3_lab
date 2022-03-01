package org.suai.lab_3.matrixes;

final public class HalfMatrix extends Matrix {
	
	public HalfMatrix(int r, int col) {
		super((int) Math.ceil(r / 2.0), col);
		rows = r;
		columns = col;
	}
		
	final public int getElement(int row, int column) {
		return matrix[row % (int) Math.ceil(rows / 2.0)][column];
	}
	
	final public void setElement(int row, int column, int value) {
		matrix[row % (int) Math.ceil(rows / 2.0)][column] = value;
	}
}

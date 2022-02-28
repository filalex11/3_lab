package org.suai.lab_3.matrixes;

final public class HalfMatrix extends Matrix {
	
	public HalfMatrix(int r, int col) {
		super((int) Math.ceil(r / 2.0), col);
		rows = r;
		columns = col;
	}
	
	final public Matrix sum(Matrix m) {
		if ((rows != m.getRows()) || (columns != m.getColumns()))
			throw new MatrixException("Addition of matrixes with different sizes!");
		Matrix res = new Matrix(rows, columns);
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				res.setElement(i, j, this.getElement(i, j) + m.getElement(i, j));
			}
		}
		return res;
	}
	
	final public Matrix product(Matrix m) {
		if (columns != m.getRows())
			throw new MatrixException("Multiplication of matrixes with invalid sizes!");
		Matrix res = new Matrix(rows, m.getColumns());
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < m.getColumns(); ++j) {
				int mult = 0;
				for (int k = 0; k < columns; ++k) {
					mult += this.getElement(i, k) * m.getElement(k, j);
				}
				res.setElement(i, j, mult);
			}
		}
		return res;
	}
	
	final public int getElement(int row, int column) {
		return matrix[row % (int) Math.ceil(rows / 2.0)][column];
	}
	
	final public void setElement(int row, int column, int value) {
		matrix[row % (int) Math.ceil(rows / 2.0)][column] = value;
	}
}

package org.suai.lab_3.matrixes;

final public class SquareMatrix extends Matrix {
	
	public SquareMatrix(int s) {
		super(s, s);
		for (int i = 0; i < rows; ++i) {
			matrix[i][i] = 1;
		}
	}
	
	final public Matrix sum(Matrix m) {
		if (columns != m.getRows()) {
			MatrixException me = new MatrixException("Addition of matrixes with different sizes!");
			throw me;
		}
		Matrix res = new Matrix(rows, columns);
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				res.setElement(i, j, matrix[i][j] + m.getElement(i, j));
			}
		}
		return res;
	}
}

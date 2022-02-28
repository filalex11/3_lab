package org.suai.lab_3.matrixes;

final public class HalfMatrix extends Matrix {
	
	public HalfMatrix(int r, int col) {
		super(r, col);
	}
	
	final public Matrix sum(Matrix m) {
		if ((rows * 2 != m.getRows()) || (columns != m.getColumns()))
			throw new MatrixException("Addition of matrixes with different sizes!");
		Matrix res = new Matrix(rows * 2, columns);
		for (int i = 0; i < rows * 2; ++i) {
			for (int j = 0; j < columns; ++j) {
				if (i >= rows)
					res.setElement(i, j, matrix[i - rows][j] + m.getElement(i, j));
				else
					res.setElement(i, j, matrix[i][j] + m.getElement(i, j));
			}
		}
		return res;
	}
	
	final public Matrix product(Matrix m) {
		if (columns != m.getRows())
			throw new MatrixException("Multiplication of matrixes with different sizes!");
		Matrix res = new Matrix(rows * 2, m.getColumns());
		for (int i = 0; i < rows * 2; ++i) {
			for (int j = 0; j < m.getColumns(); ++j) {
				int mult = 0;
				for (int k = 0; k < columns; ++k) {
					if (i >= rows)
						mult += matrix[i - rows][k] * m.getElement(k, j);
					else
						mult += matrix[i][k] * m.getElement(k, j);
				}
				res.setElement(i, j, mult);
			}
		}
		return res;
	}
}

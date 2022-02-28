package org.suai.lab_3.matrixes;

public class Matrix {
	
	final protected int[][] matrix;
	
	protected int rows;

	protected int columns;
	
	public Matrix(int r, int col) {
		if ((r <= 0) || (col <= 0)) {
			throw new MatrixException("Invalid size of matrix!");
		}
		rows = r;
		columns = col;
		matrix = new int[rows][columns];
	}
	
	public Matrix sum(Matrix m) {
		if ((rows != m.getRows()) || (columns != m.getColumns()))
			throw new MatrixException("Addition of matrixes with different sizes!");
		Matrix res = new Matrix(rows, columns);
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				res.setElement(i, j, matrix[i][j] + m.getElement(i, j));
			}
		}
		return res;
	}
	
	public Matrix product(Matrix m) {
		if (columns != m.getRows())
			throw new MatrixException("Multiplication of matrixes with different sizes!");
		Matrix res = new Matrix(rows, m.getColumns());
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < m.getColumns(); ++j) {
				int mult = 0;
				for (int k = 0; k < columns; ++k) {
					mult += matrix[i][k] * m.getElement(k, j);
				}
				res.setElement(i, j, mult);
			}
		}
		return res;
	}
	
	public void setElement(int row, int column, int value) {
		if ((row < 0) || (column < 0))
			throw new MatrixException("Invalid index!");
		matrix[row][column] = value;
	}
	
	public int getElement(int row, int column) {
		if ((row < 0) || (column < 0))
			throw new MatrixException("Invalid index!");
		return matrix[row][column];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	final public String toString() {
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				out.append(matrix[i][j]);
				out.append(' ');
			}
			out.append('\n');
		}
		String str = out.toString();
		return str;
	}
	
	final public boolean equals(Matrix m) {
		if ((rows != m.getRows()) || (columns != m.getColumns())) {
			return false;
		}
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				if (matrix[i][j] != m.getElement(i, j)) {
					return false;
				}
			}
		}
		return true;
	}
}

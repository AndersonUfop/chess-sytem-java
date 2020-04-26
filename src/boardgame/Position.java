package boardgame;

public class Position {
	
	private int rows;
	private int column;
	
	public Position(int rows, int column) {
		this.rows = rows;
		this.column = column;
	}

	public int getRows() {
		return rows;
	}

	public void setRow(int rows) {
		this.rows = rows;
	}

	public int getColum() {
		return column;
	}

	public void setColum(int colum) {
		this.column = colum;
	}
	
	@Override
	public String toString() {
		return rows + ", " + column;
	}
	
	

}

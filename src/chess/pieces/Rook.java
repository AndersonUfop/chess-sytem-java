package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRows() - 1, position.getColum());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
			p.setRow(p.getRows() - 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
		}

		// left
		p.setValues(position.getRows(), position.getColum() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
			p.setColum(p.getColum() - 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
		}

		// right
		p.setValues(position.getRows(), position.getColum() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
			p.setColum(p.getColum() + 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
		}

		// below
		p.setValues(position.getRows() + 1, position.getColum());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
			p.setRow(p.getRows() + 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRows()][p.getColum()] = true;
		}

		return mat;
	}

}

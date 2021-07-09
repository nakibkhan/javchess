package com.nakgames.javchess.model.pieces;

import com.nakgames.javchess.status.BoardPosition;
import com.nakgames.javchess.status.Color;

import java.util.List;

public class Board {
    PieceInt[][] positions = new PieceInt[8][8];
    List<PieceInt> pieceList;

    public Board()   {
        initializePiecePositions();
    }

    private void initializePiecePositions() {
        positions[BoardPosition.A.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.B.getPosition()][BoardPosition.ONE.getPosition()] = new Knight(Color.WHITE);
        positions[BoardPosition.C.getPosition()][BoardPosition.ONE.getPosition()] = new Bishop(Color.WHITE);
        positions[BoardPosition.D.getPosition()][BoardPosition.ONE.getPosition()] = new Queen(Color.WHITE);
        positions[BoardPosition.E.getPosition()][BoardPosition.ONE.getPosition()] = new King(Color.WHITE);
        positions[BoardPosition.F.getPosition()][BoardPosition.ONE.getPosition()] = new Bishop(Color.WHITE);
        positions[BoardPosition.G.getPosition()][BoardPosition.ONE.getPosition()] = new Knight(Color.WHITE);
        positions[BoardPosition.H.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);

        positions[BoardPosition.A.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.B.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.C.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.D.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.E.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.F.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.G.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);
        positions[BoardPosition.H.getPosition()][BoardPosition.TWO.getPosition()] = new Pawn(Color.WHITE);

        positions[BoardPosition.A.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.B.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.C.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.D.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.E.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.F.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.G.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);
        positions[BoardPosition.H.getPosition()][BoardPosition.SEVEN.getPosition()] = new Pawn(Color.BLACK);

        positions[BoardPosition.A.getPosition()][BoardPosition.EIGHT.getPosition()] = new Rook(Color.BLACK);
        positions[BoardPosition.B.getPosition()][BoardPosition.EIGHT.getPosition()] = new Knight(Color.BLACK);
        positions[BoardPosition.C.getPosition()][BoardPosition.EIGHT.getPosition()] = new Bishop(Color.BLACK);
        positions[BoardPosition.D.getPosition()][BoardPosition.EIGHT.getPosition()] = new Queen(Color.BLACK);
        positions[BoardPosition.E.getPosition()][BoardPosition.EIGHT.getPosition()] = new King(Color.BLACK);
        positions[BoardPosition.F.getPosition()][BoardPosition.EIGHT.getPosition()] = new Bishop(Color.BLACK);
        positions[BoardPosition.G.getPosition()][BoardPosition.EIGHT.getPosition()] = new Knight(Color.BLACK);
        positions[BoardPosition.H.getPosition()][BoardPosition.EIGHT.getPosition()] = new Rook(Color.BLACK);
    }


}

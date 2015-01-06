package com.drewhannay.chesscrafter.piece;

import com.drewhannay.chesscrafter.board.Board;
import com.drewhannay.chesscrafter.board.BoardCoordinate;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {

    public Queen() {
        this(Board.FIRST_TEAM_ID);
    }

    public Queen(int teamId) {
        super(teamId);
    }

    @Override
    public List<BoardCoordinate> getMovesFrom(BoardCoordinate startingLocation, int boardSize) {
        List<BoardCoordinate> moves = new ArrayList<>();

        List<BoardCoordinate> movesWithinBoardSize = getAllRadialMovesFrom(startingLocation, boardSize);
        for (BoardCoordinate move : movesWithinBoardSize) {
            if (move.isCoordinateValidForBoardSize(boardSize)) {
                moves.add(move);
            }
        }

        return moves;
    }
}

package application;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class Program {
    public static void main(String[] args) {
        // Teste da classe de Position
        Position pos = new Position(3, 10);
        System.out.println(pos);

        // Teste da classe de Board
        Board board = new Board(8,8);

        // Teste da classe de Piece
        Piece piece = new Piece(board);
    }
}

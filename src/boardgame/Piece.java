package boardgame;

public class Piece {


    //We will need to use position on the Board class, so use the protected encapsulation
    protected Position position;
    private Board board;

    public Piece(Board board){

        this.board = board;

    }

    protected Board getBoard() {
        return board;
    }

}

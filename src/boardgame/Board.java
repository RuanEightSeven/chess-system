package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    //Generate getter and setters for rows and columns

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

}
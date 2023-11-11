package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces){
        for(int i=0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");
            for(int j=0; j < pieces.length; j++){
                //Percorrendo a matriz de posições para printar o tabuleiro

                printPiece(pieces[i][j]);
                //Imprimindo o restante da linha

            }
            System.out.println();
            //após imprimir uma linha completa, pulamos para a proxima linha
        }
    }

    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        }
        else{
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}

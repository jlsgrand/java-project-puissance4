package co.simplon.game.puissance4;

import java.util.Scanner;

public class Main {

    private final static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        BoardGame boardGame = new BoardGame(7, 6);

        boolean win = false;
        Token currentToken = (Math.random() > 0.5) ? Token.RED : Token.YELLOW;
        String player = "";

        while (!win) {
            player = (currentToken == Token.RED) ? "Rouge" : "Jaune";
            System.out.println("Joueur " + player + " a vous de jouer !");
            System.out.print("Quelle colonne pour ce nouveau coup : ");

            int columnChoice = inputScanner.nextInt();

            // Let's try to play
            try {
                win = boardGame.play(currentToken, columnChoice);
            } catch (OutOfBoardColumnException oobce) {
                System.out.println("La colonne choisie est hors du plateau de jeu ( ͡ಠ ʖ̯ ͡ಠ) !");
            } catch (ColumnFullException cfe) {
                System.out.println("Cette colonne est déjà pleine ¯\\_(ツ)_/¯ !");
            }

            // Next player
            if (currentToken == Token.RED) {
                currentToken = Token.YELLOW;
            } else {
                currentToken = Token.RED;
            }
        }

        System.out.println("Bravo joueur " + player + " vous avez gagné");
    }

}

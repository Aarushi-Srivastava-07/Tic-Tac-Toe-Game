import java.util.Scanner;
public class TicTacToe {
    public static void printBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(j == board[0].length - 1){
                    System.out.print(board[i][j]);
                }
                else{
                    System.out.print(board[i][j] + " | ");
                }    
            }
            if(i != board.length - 1){
                System.out.print("\n--+---+--\n");
            }
        } 
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        printBoard(board);
        char player1 = 'x', player2 = 'o';
        int row1, col1, row2, col2;
        System.out.println("\nWelcome to the tic tac toe game :) ");
        System.out.println("Are you ready .........");
        System.out.println("Get............. \nSet................ \nGo.................");
        mainLoop : while(true){
            System.out.println("\nIts player1's turn ! (x): ");
            System.out.println("Enter the row number(0,1,2) : ");
            row1 = input.nextInt();
            while(row1 < 0 || row1 > 2){
                System.out.println("Invalid input! enter a valid response(0,1,2) : ");
                row1 = input.nextInt();
            }
            System.out.println("Enter the column number (0,1,2): ");
            col1 = input.nextInt();
            while(col1 < 0 || col1 > 2){
                System.out.println("Invalid input! enter a valid response(0,1,2) : ");
                col1 = input.nextInt();
            }
            while(board[row1][col1] != ' '){
                System.out.println("Invalid response! the square is already occupied");
                System.out.println("Enter the row number(0,1,2) : ");
                row1 = input.nextInt();
                System.out.println("Enter the column number (0,1,2): ");
                col1 = input.nextInt();
            }
            board[row1][col1] = player1;
            printBoard(board);
            //to check if the player1 has won
            //checking if any diagonal is filled with 'x'
            int countPrimaryDiagonalPlayer1 = 0;
            int countSecondaryDiagonalPlayer1 = 0;
            for(int i = 0; i < board.length; i++){
                int j = board.length - 1 - i;
                if(board[i][i] == player1){
                    countPrimaryDiagonalPlayer1++;
                }
                if(board[i][j] == player1){
                    countSecondaryDiagonalPlayer1++;
                }
            }
            if(countPrimaryDiagonalPlayer1 == 3 || countSecondaryDiagonalPlayer1 == 3){
                System.out.println("\nPlayer1 wins!! :) ");
                break mainLoop;
            }
            //checking if any row is filled with 'x'
            for(int i = 0; i < board.length; i++){
                int count = 0;
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == player1){
                        count++;
                    }
                }
                if(count == 3){
                    System.out.println("\nPlayer1 wins!! :) ");
                    break mainLoop;
                }
            } 
            //checking if any column is filled with 'x'
            for(int i = 0; i < board.length; i++){
                int count = 0;
                for(int j = 0; j < board[0].length; j++){
                    if(board[j][i] == player1){
                        count++;
                    }
                }
                if(count == 3){
                    System.out.println("\nPlayer1 wins!! :) ");
                    break mainLoop;
                }
            } 
            //to check if the match is a tie
            int countEmptySpaces = 0;
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == ' '){
                        countEmptySpaces++;
                    }
                }
            }
            if(countEmptySpaces == 0){
                System.out.println("\nThe match is a tie!");
                break;
            }
            System.out.println("\nIts player2's turn ! (o): ");
            System.out.println("Enter the row number(0,1,2) : ");
            row2 = input.nextInt();
            while(row2 < 0 || row2 > 2){
                System.out.println("Invalid input! enter a valid response(0,1,2) : ");
                row2 = input.nextInt();
            }
            System.out.println("Enter the column number (0,1,2): ");
            col2 = input.nextInt();
            while(col2 < 0 || col2 > 2){
                System.out.println("Invalid input! enter a valid response(0,1,2) : ");
                col2 = input.nextInt();
            }
            while(board[row2][col2] != ' '){
                System.out.println("Invalid response! the square is already occupied");
                System.out.println("Enter the row number(0,1,2) : ");
                row2 = input.nextInt();
                System.out.println("Enter the column number (0,1,2): ");
                col2 = input.nextInt();
            }
            board[row2][col2] = player2;
            printBoard(board);
            //to check if the player2 has won
            //checking if any diagonal is filled with 'o'
            int countPrimaryDiagonalPlayer2 = 0;
            int countSecondaryDiagonalPlayer2 = 0;
            for(int i = 0; i < board.length; i++){
                int j = board.length - 1 - i;
                if(board[i][i] == player2){
                    countPrimaryDiagonalPlayer2++;
                }
                if(board[i][j] == player2){
                    countSecondaryDiagonalPlayer2++;
                }
            }
            if(countPrimaryDiagonalPlayer2 == 3 || countSecondaryDiagonalPlayer2 == 3){
                System.out.println("\nPlayer2 wins!! :) ");
                break mainLoop;
            }
            //checking if any row is filled with 'o'
            for(int i = 0; i < board.length; i++){
                int count = 0;
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == player2){
                        count++;
                    }
                }
                if(count == 3){
                    System.out.println("\nPlayer2 wins!! :) ");
                    break mainLoop;
                }
            } 
            //checking if any column is filled with 'o'
            for(int i = 0; i < board.length; i++){
                int count = 0;
                for(int j = 0; j < board[0].length; j++){
                    if(board[j][i] == player2){
                        count++;
                    }
                }
                if(count == 3){
                    System.out.println("\nPlayer2 wins!! :) ");
                    break mainLoop;
                }
            } 
            //to check if the match is a tie
            countEmptySpaces = 0;
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == ' '){
                        countEmptySpaces++;
                    }
                }
            }
            if(countEmptySpaces == 0){
                System.out.println("\nThe match is a tie!");
                break;
            }
        }
    }
}

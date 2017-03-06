import java.util.Scanner;

public class Tictactoe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("-------------\n");
		System.out.print("|   |   |   |\n");
		System.out.print("-------------\n");
		System.out.print("|   |   |   |\n");
		System.out.print("-------------\n");
		System.out.print("|   |   |   |\n");
		System.out.print("-------------\n");

        char[][] checkerBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		checkerBoard[i][j] = ' ';
        	}
        }

        int row;
        int column;
        int step = 0;
		while(true) {
			System.out.print("Enter a row (1, 2, or 3) for player X: ");
            row = input.nextInt();
            System.out.print("Enter a column (1, 2, or 3) for player X: ");
            column = input.nextInt();
            checkerBoard[row - 1][column - 1] = 'X';
            step++;
            printBoard(checkerBoard);
            if (isWin(checkerBoard, 'X')) {
                System.out.print("X player won");
            	break;
            }
            if (step == 9) {
            	System.out.print("The match ended in a draw");
            	break;
            }

            System.out.print("Enter a row (1, 2, or 3) for player O: ");
            row = input.nextInt();
            System.out.print("Enter a column (1, 2, or 3) for player O: ");
            column = input.nextInt();
            checkerBoard[row - 1][column - 1] = 'O';
            step++;
            printBoard(checkerBoard);
            if (isWin(checkerBoard, 'O')) {
            	System.out.print("O player won");
            	break;
            }
		}
	}

	public static void printBoard(char[][] board) {
		System.out.print("-------------\n");
		System.out.print("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |\n");
		System.out.print("-------------\n");
		System.out.print("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |\n");
		System.out.print("-------------\n");
		System.out.print("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |\n");
		System.out.print("-------------\n");
	}

	public static boolean isWin(char[][] board, char chess) {
        for (int i = 0; i < 3; i++) {
        	if (board[i][0] == chess &&
        		board[i][1] == chess &&
        		board[i][2] == chess)
        		return true;
        }
        for (int i = 0; i < 3; i++) {
        	if (board[0][i] == chess &&
        		board[1][i] == chess &&
        		board[2][i] == chess)
        		return true;
        }
        if (board[0][0] == chess &&
            board[1][1] == chess &&
        	board[2][2] == chess) 
                return true;
        if (board[0][2] == chess &&
            board[1][1] == chess &&
        	board[2][0] == chess) 
                return true;

        return false;
	}
} 
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rowNumber;
    private int colNumber;
    private String[][] board;
    private String[][] map;
    private int mineCount;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.board = new String[rowNumber][colNumber];
        this.map = new String[rowNumber][colNumber];
        this.mineCount = (rowNumber * colNumber) / 4;
    }

    public void makeBoard() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                board[i][j] = " - ";
                map[i][j] = " - ";
            }
        }
    }

    public void run() {
        boolean flag = true;
        makeBoard();
        plantMines();
        drawMap();

        while (flag) {
            drawBoard();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Satır giriniz: ");
            int r = scanner.nextInt();
            System.out.println("Sütun giriniz: ");
            int c = scanner.nextInt();
            if (!(r < rowNumber && r > -1) || !(c < colNumber && c > -1)) {
                System.out.println("Geçersiz kordinat !");
            } else {
                System.out.println("=======================================");
                flag = updateBoard(r, c);
            }

        }
    }


    public boolean updateBoard(int row, int col) {

        if (map[row][col].equals(" * ")) {
            System.out.println("Game Over!");
            return false;
        } else {
            int minesAroundPoint = 0;
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (map[row - 1][col - 1].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (row - 1 >= 0) {
                if (map[row - 1][col].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (row - 1 >= 0 && col + 1 < colNumber) {
                if (map[row - 1][col + 1].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (col - 1 >= 0) {
                if (map[row][col - 1].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (col - 1 >= 0 && row + 1 < rowNumber) {
                if (map[row + 1][col - 1].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (row + 1 < rowNumber) {
                if (map[row + 1][col].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (row + 1 < rowNumber && col + 1 < colNumber) {
                if (map[row + 1][col + 1].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            if (col + 1 < colNumber) {
                if (map[row][col + 1].equals(" * ")) {
                    minesAroundPoint++;
                }
            }
            board[row][col] = " " + String.valueOf(minesAroundPoint) + " ";
            if (checkWin()) {
                System.out.println("Oyunu kazandınız!!!");
                return false;
            }
            return true;
        }
    }

    public boolean checkWin() {
        int count = 0;
        int control = rowNumber * colNumber - mineCount;
        for (String[] rows : board) {
            for (String col : rows) {
                if (!col.equals(" - ")) {
                    count++;
                }
            }
        }
        if (count == control) {
            return true;
        }
        return false;
    }


    public void drawBoard() {
        for (String[] rows : board) {
            for (String col : rows) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void drawMap() {
        System.out.println("Mayınların Konumu");
        for (String[] rows : map) {
            for (String col : rows) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("=======================================");
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz");
    }


    private void plantMines() {
        Random random = new Random();
        int i = 0;
        while (i < mineCount) {
            int row = random.nextInt(rowNumber);
            int col = random.nextInt(colNumber);
            if (!map[row][col].equals(" * ")) {
                map[row][col] = " * ";
            } else {
                i--;
            }
            i++;
        }
    }
}

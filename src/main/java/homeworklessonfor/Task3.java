package homeworklessonfor;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    private static char [][] map;

    private static final int SIZE = 5;

    private static final char EMPTY_DOT = '•';

    private static final char X_DOT = 'X';

    private static final char O_DOT = 'O';

    private static Scanner sc;





    public static void main(String[] args) {



        initMap();

        printMap();

        while (true) {

            humanTurn();

            printMap();

            System.out.println();

            if (checkWin(X_DOT)) {

                System.out.println("You win");

                break;

            }

            if (checkDraw()) {

                System.out.println("Draw");

                break;

            }

            computerTurn();

            printMap();

            System.out.println();

            if (checkWin(O_DOT)) {

                System.out.println("You lose");

                break;

            }

            if (checkDraw()) {

                System.out.println("Draw");

                break;

            }

            try {

                Thread.sleep(500);

            } catch (InterruptedException ignored) {

            }

        }

    }



    private static boolean checkDraw() {

        for (char[] chars : map) {

            for (char aChar : chars) {

                if (aChar == EMPTY_DOT) {

                    return false;

                }

            }

        }

        return true;

    }



    private static boolean checkWin(char c) {

        for (int i = 0; i < map.length; i++) {

            if ((map[i][1] == c && map[i][2] == c && map[i][3] == c) && (map[i][0] == c || map[i][4] == c)) {

                return true;

            }

            if ((map[1][i] == c && map[2][i] == c && map[3][i] == c) && (map[0][i] == c || map[4][i] == c)) {

                return true;

            }

        }

        if((map[1][1] == c && map[2][2] == c && map[3][3] == c) && (map[0][0] == c ||map[4][4] == c)) {

            return true;

        }
        if((map[3][1] == c && map[2][2] == c && map[1][3] == c) && (map[4][0] == c ||map[0][4] == c)) {

            return true;

        }
        if(map[1][0] == c && map[2][1] == c && map[3][2] == c && map[4][3] == c){

            return true;
        }

        if(map[3][0] == c && map[2][1] == c && map[1][2] == c && map[0][3] == c){

            return true;

        }
        if(map[0][1] == c && map[1][2] == c && map[2][3] == c && map[3][4] == c){

            return true;

        }
        if(map[0][3] == c && map[1][2] == c && map[2][1] == c && map[3][0] == c){

            return true;

        }

        return false;

    }



    private static void computerTurn() {

        int xCoordinate = 0;

        int yCoordinate = 0;
        int X_DOTCount = 0;

        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++)
            if (map [i][j] == X_DOT){
                X_DOTCount++;
            } else if(map [i][j] == EMPTY_DOT && xCoordinate == -1){
                xCoordinate = j;
                yCoordinate = i;
            }
            if(X_DOTCount > 2 && xCoordinate > -1){
                break;
            } else {
                xCoordinate = -1;
                X_DOTCount = 0;
            }

        }
        if(xCoordinate == -1){
            for(int i = 0; i < SIZE; i++){
                yCoordinate = -1;
                for (int j = 0; j < SIZE; j++)
                    if (map [j][i] == X_DOT){
                        X_DOTCount++;
                    } else if(map [j][i] == EMPTY_DOT && yCoordinate == -1){
                        xCoordinate = i;
                        yCoordinate = j;
                    }
                if(X_DOTCount > 2 && yCoordinate > -1){
                    break;
                } else {
                    X_DOTCount = 0;
                }

            }
        }
        if (X_DOTCount < 3){
            do {

                Random random = new Random();

                xCoordinate = random.nextInt(SIZE);

                yCoordinate = random.nextInt(SIZE);

            } while (!isValidCell(xCoordinate, yCoordinate));
        }

        map[yCoordinate][xCoordinate] = O_DOT;

    }



    private static void humanTurn() {

        int xCoordinate = -1;

        int yCoordinate = -1;

        do {

            System.out.println("Введите координаты в формате x y");

            if (sc.hasNextInt()) {

                xCoordinate = sc.nextInt() - 1;

            }

            if (sc.hasNextInt()) {

                yCoordinate = sc.nextInt() - 1;

            }

            sc.nextLine();

        } while (!isValidCell(xCoordinate, yCoordinate));

        map[yCoordinate][xCoordinate] = X_DOT;

    }



    private static boolean isValidCell(int x, int y) {

        if (x < 0 || y < 0 || x > map.length - 1 || y > map.length - 1) {

            return false;

        }

        return map[y][x] == EMPTY_DOT;

    }



    private static void printMap() {

        for (char[] chars : map) {

            for (char aChar : chars) {

                System.out.print(aChar + " ");

            }

            System.out.println();

        }

    }



    private static void initMap() {

        sc = new Scanner(System.in);

        map = new char[SIZE][SIZE];

        for (char[] chars : map) {

            Arrays.fill(chars, EMPTY_DOT);

        }

    }
}

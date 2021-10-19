import java.util.Scanner;

public class OctoberProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean play = true;
        while(play){

            int treasureX = (int)Math.floor(Math.random() * 5);
            int treasureY = (int)Math.floor(Math.random() * 5);
            
            while (treasureX == 2 && treasureY == 2) {
                treasureX = (int)Math.floor(Math.random() * 5);
                treasureY = (int)Math.floor(Math.random() * 5);
            }
           
            int playerX = 2, playerY = 2;
            printBoard(playerX, playerY);
            while(true) {
                while (!(playerX == treasureX && playerY == treasureY)) {
                    String choice = input.nextLine();
                    if (choice.equals("w") && playerY > 0) {
                        playerY--;
                    } else if (choice.equals("s") && playerY < 4) {
                        playerY++;
                    } else if (choice.equals("a") && playerX > 0) {
                        playerX--;
                    } else if (choice.equals("d") && playerX < 4) {
                        playerX++;
                    }
                    printBoard(playerX, playerY);
                } 

                printBoard(playerX, playerY, '$');
                String choice = input.nextLine();
                if(choice.equals("y")) {
                    break;
                } else if (choice.equals("w") && playerY > 0) {
                    playerY--;
                } else if (choice.equals("s") && playerY < 4) {
                    playerY++;
                } else if (choice.equals("a") && playerX > 0) {
                    playerX--;
                } else if (choice.equals("d") && playerX < 4) {
                    playerX++;
                }
                printBoard(playerX, playerY);
            }

            System.out.println("Do you want to play again? y or n");         
            play = input.nextLine().equals("y");
        }
    }



    public static void printBoard(int col, int row) {
        printBoard(col, row, 'x');
    }

    public static void printBoard(int col, int row, char sym) {
        for(int y = 0; y < 5; y++) {
            String line = "";
            for(int x = 0; x < 5; x++) {
                if(x == col && y == row) {
                    line = line + sym + " ";
                } else {            
                    line = line + '*' + " ";
                }
            }
            System.out.println(line);
        }  
    }

    

}
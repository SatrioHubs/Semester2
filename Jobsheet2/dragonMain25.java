package Jobsheet2;
import java.util.Scanner;

public class dragonMain25 {
    public static void main(String[] args) {
        dragon25 dragon = new dragon25();
        Scanner sc = new Scanner(System.in);

        dragon.x = 0;
        dragon.y = 0;
        dragon.width = 10;
        dragon.height = 10;

        String input = sc.nextLine();

    while (true) {
        if (input.equalsIgnoreCase("w")) {
            dragon.moveUp();
         }else if (input.equalsIgnoreCase("d")) {
            dragon.moveRight();
        } else if (input.equalsIgnoreCase("s")) {
            dragon.moveDown();
        } else if (input.equalsIgnoreCase("a")) {
            dragon.moveLeft();
        }
         dragon.printPosition();
}
       

      
       
    }
    
}

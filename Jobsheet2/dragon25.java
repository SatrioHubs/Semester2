package Jobsheet2;

public class dragon25 {
    int x, y, width, height;

    void moveLeft(){
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    void moveRight(){
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    void moveUp(){
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }
    void moveDown(){
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }
    void printPosition(){
        System.out.println("x: " + x + "y: " + y);
    }

    void detectCollision(){
        System.out.println("Game Over!");
        System.exit(0);
    }
}

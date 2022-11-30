package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for(int x = 0;x<height;x++){
            for (int y = 0; y<length;y++){
                if ((x == 0) || (x == height - 1)){
                    System.out.print(8);
                } else if ((x < height - 1) && ((y == 0) || (y == length - 1))){
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

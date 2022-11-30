package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height %2 != 0){
            for (int y = 1; y <= height; y++){
                for (int x = 1; x <= height; x++){
                  if (y == 1 || y == height){
                      System.out.print(8);
                  } else if (y == (height+1)/2){
                      if (x == (height+1)/2){
                          System.out.print(8);
                      } else {
                          System.out.print(" ");
                      }
                  } else {
                      if (x == 1 || x == height){
                          System.out.print(" ");
                      } else {
                          System.out.print(8);
                      }
                  }
                }
                System.out.println();
            }
        } else{

        }
    }
}

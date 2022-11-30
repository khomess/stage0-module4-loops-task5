package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int x = 1; x <= cathetusLength; x++){
            for (int y = 1; y <= x;y++){
                while(y<=x){
                    System.out.print(8);
                    y++;
                }
            }
            System.out.println();
        }
    }
}

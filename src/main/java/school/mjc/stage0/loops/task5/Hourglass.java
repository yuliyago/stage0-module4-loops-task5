package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle=height/2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j<i || j>=height-i)&&(i<middle)) System.out.print(" ");
                else if ((i>=middle)&&(j>i || j<height-i-1)) {
                    System.out.print(" ");
                } else
                    System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height=5;
        int middle=height/2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j<i || j>=height-i)&&(i<middle)) System.out.print(" ");
                else if ((i>=middle)&&(j>i || j<height-i-1)) {
                    System.out.print(" ");
                } else
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

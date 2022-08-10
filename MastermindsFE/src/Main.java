import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[] colors = {"yellow", "red", "white", "blue", "pink", "orange"};
        Random r = new Random();
        int randomColor1 = r.nextInt(colors.length);
        int randomColor2 = r.nextInt(colors.length);
        int randomColor3 = r.nextInt(colors.length);
        int randomColor4 = r.nextInt(colors.length);

        String[] colorcode = {(colors[randomColor1]), (colors[randomColor2]), (colors[randomColor3]), (colors[randomColor4])};

        System.out.print(colors[randomColor1] + " ");
        System.out.print(colors[randomColor2] + " ");
        System.out.print(colors[randomColor3] + " ");
        System.out.println(colors[randomColor4]);

        for (int i = 0; i <= 11; i++) {
            int rightPosition = 0;
            int rightColor = 0;

            Scanner color = new Scanner(System.in);
            String first = color.nextLine();
            String second = color.nextLine();
            String third = color.nextLine();
            String fourth = color.nextLine();

            System.out.println(first + " " + second + " " + third + " " + fourth);

            if (first.equals(colors[randomColor1])) {
                rightPosition++;
            } else {
                for (int j = 0; j < colorcode.length ; j++) {
                   if (first.equals(colorcode[j])){
                       rightColor++;
                   }
                }
            }
            if (second.equals(colors[randomColor2])) {
                rightPosition++;
            } else {
                for (int k = 0; k < colorcode.length ; k++) {
                    if (second.equals(colorcode[k])){
                        rightColor++;
                    }
                }
            }
            if (third.equals(colors[randomColor3])) {
                rightPosition++;
            } else {
                for (int l = 0; l < colorcode.length ; l++) {
                    if (third.equals(colorcode[l])){
                        rightColor++;
                    }
                }
            }
            if (fourth.equals(colors[randomColor4])) {
                rightPosition++;
            } else {
                for (int m = 0; m < colorcode.length ; m++) {
                    if (fourth.equals(colorcode[m])){
                        rightColor++;
                    }
                }
            }

            System.out.println("Colors in the right position:" + rightPosition);
            System.out.println("Right colors, wrong position:" + rightColor);

            int triesLeft = 11-i;

            if (rightPosition == 4) {
                System.out.println("you win");
            } else {
                System.out.println("Wrong! You have " + triesLeft + " tries left");
            }
        }
    }
}

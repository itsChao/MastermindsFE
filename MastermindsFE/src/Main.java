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

        System.out.print(colors[randomColor1] + " ");
        System.out.print(colors[randomColor2] + " ");
        System.out.print(colors[randomColor3] + " ");
        System.out.println(colors[randomColor4]);

        for (int i = 0; i <= 12; i++) {
            int rightPosition = 0;
            Scanner inputColor = new Scanner(System.in);
            String firstColorInput = inputColor.nextLine();
            String secondColorInput = inputColor.nextLine();
            String thirdColorInput = inputColor.nextLine();
            String forthColorInput = inputColor.nextLine();

            String[] colorCode = {(colors[randomColor1]), (colors[randomColor2]), (colors[randomColor3]), (colors[randomColor4])};


            System.out.println(firstColorInput + " " + secondColorInput + " " + thirdColorInput + " " + forthColorInput);

            if (firstColorInput.equals(colors[randomColor1])) {
                System.out.println("cool");
                rightPosition++;
            } else {
                System.out.println("not cool");
            }

            if (secondColorInput.equals(colors[randomColor2])) {
                System.out.println("cool");
                rightPosition++;
            } else {
                System.out.println("not cool");
            }

            if (thirdColorInput.equals(colors[randomColor3])) {
                System.out.println("cool");
                rightPosition++;
            } else {
                System.out.println("not cool");
            }

            if (forthColorInput.equals(colors[randomColor4])) {
                System.out.println("cool");
                rightPosition++;
            } else {
                System.out.println("not cool");
            }
            System.out.println(rightPosition);
            if (rightPosition == 4) {
                System.out.println("you win");
            } else {
                System.out.println("noe");
            }
        }
    }
}

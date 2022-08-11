import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" +
                "  __  __           _                      _           _     \n" +
                " |  \\/  |         | |                    (_)         | |    \n" +
                " | \\  / | __ _ ___| |_ ___ _ __ _ __ ___  _ _ __   __| |___ \n" +
                " | |\\/| |/ _` / __| __/ _ | '__| '_ ` _ \\| | '_ \\ / _` / __|\n" +
                " | |  | | (_| \\__ | ||  __| |  | | | | | | | | | | (_| \\__ \\\n" +
                " |_|  |_|\\__,_|___/\\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|___/\n" +
                "                                                            \n");

        System.out.println("Type in 4 colors you have 12 tries to guess the right combination");
        System.out.println("The colors are: yellow, red, white, blue, pink and orange");

        String[] colors = {"yellow", "red", "white", "blue", "pink", "orange"};
        Random r = new Random();
        int randomColor1 = r.nextInt(colors.length);
        int randomColor2 = r.nextInt(colors.length);
        int randomColor3 = r.nextInt(colors.length);
        int randomColor4 = r.nextInt(colors.length);

        String[] colorCode = {(colors[randomColor1]), (colors[randomColor2]), (colors[randomColor3]), (colors[randomColor4])};
        String[] colorCodeCopy = colorCode.clone();

        System.out.print(colors[randomColor1] + " ");
        System.out.print(colors[randomColor2] + " ");
        System.out.print(colors[randomColor3] + " ");
        System.out.println(colors[randomColor4]);

        for (int i = 0; i <= 11; i++) {
            int correctPosition = 0;
            int correctColor = 0;

            Scanner color = new Scanner(System.in);
            String firstInput = color.nextLine();
            String secondInput = color.nextLine();
            String thirdInput = color.nextLine();
            String fourthInput = color.nextLine();

            System.out.println(firstInput + " " + secondInput + " " + thirdInput + " " + fourthInput);

            if (firstInput.equals(colorCodeCopy[0])) {
                correctPosition++;
                colorCodeCopy[0] = "";
            }
            if (secondInput.equals(colorCodeCopy[1])) {
                correctPosition++;
                colorCodeCopy[1] = "";
            }
            if (thirdInput.equals(colorCodeCopy[2])) {
                correctPosition++;
                colorCodeCopy[2] = "";
            }
            if (fourthInput.equals(colorCodeCopy[3])) {
                correctPosition++;
                colorCodeCopy[3] = "";
            }
            for (int j = 0; j < colorCodeCopy.length; j++) {
                if (firstInput.equals(colorCodeCopy[j]) && j != 0) {
                    correctColor++;
                    break;
                }
            }

            for (int k = 0; k < colorCodeCopy.length; k++) {
                if (secondInput.equals(colorCodeCopy[k]) && k != 1) {
                    correctColor++;
                    break;
                }
            }

            for (int l = 0; l < colorCodeCopy.length; l++) {
                if (thirdInput.equals(colorCodeCopy[l]) && l != 2) {
                    correctColor++;
                    break;
                }
            }


            for (int m = 0; m < colorCodeCopy.length; m++) {
                if (fourthInput.equals(colorCodeCopy[m]) && m != 3) {
                    correctColor++;
                    break;
                }
            }

            colorCodeCopy = colorCode.clone();

            System.out.println("Colors in the right position:" + correctPosition);
            System.out.println("Right colors, wrong position:" + correctColor);
            System.out.println("The colors are: yellow, red, white, blue, pink and orange");

            int triesLeft = 11 - i;
            if (triesLeft == 0) {
                System.out.println("\n" +
                        "                 *             )            (     \n" +
                        " (       (     (  `         ( /(            )\\ )  \n" +
                        " )\\ )    )\\    )\\))(  (     )\\())(   (  (  (()/(  \n" +
                        "(()/( ((((_)( ((_)()\\ )\\   ((_)\\ )\\  )\\ )\\  /(_)) \n" +
                        " /(_))_)\\ _ )\\(_()((_|(_)    ((_|(_)((_|(_)(_))   \n" +
                        "(_)) __(_)_\\(_)  \\/  | __|  / _ \\ \\ / /| __| _ \\  \n" +
                        "  | (_ |/ _ \\ | |\\/| | _|  | (_) \\ V / | _||   /  \n" +
                        "   \\___/_/ \\_\\|_|  |_|___|  \\___/ \\_/  |___|_|_\\  \n" +
                        "                                                  \n");
                System.exit(0);
            } else {

                if (correctPosition == 4) {
                    System.out.println("\n" +
                            " __   _____  _   _  __      _____ _  _ \n" +
                            " \\ \\ / / _ \\| | | | \\ \\    / /_ _| \\| |\n" +
                            "  \\ V / (_) | |_| |  \\ \\/\\/ / | || .` |\n" +
                            "   |_| \\___/ \\___/    \\_/\\_/ |___|_|\\_|\n" +
                            "                                       \n");
                    System.exit(0);

                } else {
                    System.out.println("Wrong! You have " + triesLeft + " tries left");
                }
            }
        }
    }
}

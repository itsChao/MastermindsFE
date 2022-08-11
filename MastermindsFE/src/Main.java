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

        String[] colorcode = {(colors[randomColor1]), (colors[randomColor2]), (colors[randomColor3]), (colors[randomColor4])};

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

            if (firstInput.equals(colors[randomColor1])) {
                correctPosition++;
            } else {
                for (int j = 0; j <= colorcode.length; j++) {
                    if (firstInput.equals(colorcode[j]) && j != 0) {
                        correctColor++;
                        break;
                    }
                }
            }
            if (secondInput.equals(colors[randomColor2])) {
                correctPosition++;
            } else {
                for (int k = 0; k < colorcode.length; k++) {
                    if (secondInput.equals(colorcode[k]) && k != 0) {
                        correctColor++;
                        break;
                    }
                }
            }
            if (thirdInput.equals(colors[randomColor3])) {
                correctPosition++;
            } else {
                for (int l = 0; l < colorcode.length; l++) {
                    if (thirdInput.equals(colorcode[l]) && l != 0) {
                        correctColor++;
                        break;
                    }
                }
            }
            if (fourthInput.equals(colors[randomColor4])) {
                correctPosition++;
            } else {
                for (int m = 0; m < colorcode.length; m++) {
                    if (fourthInput.equals(colorcode[m]) && m != 0) {
                        correctColor++;
                        break;
                    }
                }
            }

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

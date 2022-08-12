import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n" +
                "  __  __           _                      _           _ \n" +
                " |  \\/  |         | |                    (_)         | |\n" +
                " | \\  / | __ _ ___| |_ ___ _ __ _ __ ___  _ _ __   __| |\n" +
                " | |\\/| |/ _` / __| __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |\n" +
                " | |  | | (_| \\__ \\ ||  __/ |  | | | | | | | | | | (_| |\n" +
                " |_|  |_|\\__,_|___/\\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\n" +
                "                                                        \n");

        System.out.println("Type in 4 colors you have 12 tries to guess the right combination");
        System.out.println("The colors are: yellow, red, white, blue, pink and orange");
        boolean playAgain = true;
        while (playAgain) {
            String[] colors = {"yellow", "red", "white", "blue", "pink", "orange"};
            Random r = new Random();
            int randomColor1 = r.nextInt(colors.length);
            int randomColor2 = r.nextInt(colors.length);
            int randomColor3 = r.nextInt(colors.length);
            int randomColor4 = r.nextInt(colors.length);

            String[] colorCode = {(colors[randomColor1]), (colors[randomColor2]), (colors[randomColor3]), (colors[randomColor4])};
            String[] colorCodeCopy = colorCode.clone();

            /*System.out.print(colors[randomColor1] + " ");
            System.out.print(colors[randomColor2] + " ");
            System.out.print(colors[randomColor3] + " ");
            System.out.println(colors[randomColor4]);*/


            for (int i = 0; i <= 11; i++) {
                int correctPosition = 0;
                int correctColor = 0;

                Scanner guessedColors = new Scanner(System.in);
                String firstInput = guessedColors.nextLine();
                String secondInput = guessedColors.nextLine();
                String thirdInput = guessedColors.nextLine();
                String fourthInput = guessedColors.nextLine();

                String[] colorInput = {firstInput, secondInput, thirdInput, fourthInput};
                String[] colorInputCopy = colorInput.clone();

                System.out.println(firstInput + " " + secondInput + " " + thirdInput + " " + fourthInput);

                if (colorCode[0].equals(colorInputCopy[0])) {
                    correctPosition++;
                    colorCodeCopy[0] = "";
                }
                if (colorCode[1].equals(colorInputCopy[1])) {
                    correctPosition++;
                    colorCodeCopy[1] = "";
                }
                if (colorCode[2].equals(colorInputCopy[2])) {
                    correctPosition++;
                    colorCodeCopy[2] = "";
                }
                if (colorCode[3].equals(colorInputCopy[3])) {
                    correctPosition++;
                    colorCodeCopy[3] = "";
                }
                for (int j = 0; j < colorInputCopy.length; j++) {
                    if (colorCodeCopy[0].equals(colorInputCopy[j]) && j != 0) {
                        correctColor++;
                        colorCodeCopy[0] = "";
                        break;
                    }
                }

                for (int k = 0; k < colorInputCopy.length; k++) {
                    if (colorCodeCopy[1].equals(colorInputCopy[k]) && k != 1) {
                        correctColor++;
                        colorCodeCopy[1] = "";
                        break;
                    }
                }

                for (int l = 0; l < colorInputCopy.length; l++) {
                    if (colorCodeCopy[2].equals(colorInputCopy[l]) && l != 2) {
                        correctColor++;
                        colorCodeCopy[2] = "";
                        break;
                    }
                }


                for (int m = 0; m < colorInputCopy.length; m++) {
                    if (colorCodeCopy[3].equals(colorInputCopy[m]) && m != 3) {
                        correctColor++;
                        colorCodeCopy[3] = "";
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


                    Scanner myScanner = new Scanner(System.in);
                    String yesNo = myScanner.nextLine();

                    if (yesNo.equals("no")) {
                        playAgain = false;
                        break;
                    } else if (yesNo.equals("yes")){
                        playAgain = true;
                        break;
                    }

                } else {

                    if (correctPosition == 4) {
                        System.out.println("\n" +
                                " __     __                    _       \n" +
                                " \\ \\   / /                   (_)      \n" +
                                "  \\ \\_/ /__  _   _  __      ___ _ __  \n" +
                                "   \\   / _ \\| | | | \\ \\ /\\ / / | '_ \\ \n" +
                                "    | | (_) | |_| |  \\ V  V /| | | | |\n" +
                                "    |_|\\___/ \\__,_|   \\_/\\_/ |_|_| |_|\n" +
                                "                                      \n");
                        System.out.println("Play agian?");

                        Scanner myScanner = new Scanner(System.in);
                        String yesNo = myScanner.nextLine();

                        if (yesNo.equals("no")) {
                            playAgain = false;
                            break;

                        } else if (yesNo.equals("yes")){
                            playAgain = true;
                            break;
                        }


                    } else {
                        System.out.println("Wrong! You have " + triesLeft + " tries left");
                    }
                }
            }
        }
    }
}


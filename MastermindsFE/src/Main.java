import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] colors={"yellow", "red", "white", "blue", "pink", "orange"};
        Random r=new Random();
        int randomColor1=r.nextInt(colors.length);
        int randomColor2=r.nextInt(colors.length);
        int randomColor3=r.nextInt(colors.length);
        int randomColor4=r.nextInt(colors.length);

        System.out.print(colors[randomColor1] + " ");
        System.out.print(colors[randomColor2] + " ");
        System.out.print(colors[randomColor3] + " ");
        System.out.println(colors[randomColor4]);


        Scanner color = new Scanner(System.in);
        String first = color.nextLine();
        String second = color.nextLine();
        String third = color.nextLine();
        String fourth = color.nextLine();

        System.out.println(first + " " + second + " " + third + " " + fourth);
    }
}

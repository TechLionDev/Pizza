import java.util.Scanner;

public class Input {
    static Scanner UserInput = new Scanner(System.in);

    public static String getString() {
        return UserInput.nextLine();
    }

    public static int getInt() {
        return UserInput.nextInt();
    }

    public static double getDouble() {
        return UserInput.nextDouble();
    }

    public static boolean getBoolean() {
        return UserInput.nextBoolean();
    }

    public static boolean hasNext() {
        return UserInput.hasNext();
    }
}

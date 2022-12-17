import java.util.Scanner;

public class InsertingSymbols {
    public static Scanner scan = new Scanner(System.in);
    public static String str;
    public static char[] c;

    public static void main(String[] args) {
        str = scan.nextLine();
        c = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++)
            System.out.print(c[i] + "#");

        System.out.print(c[str.length()- 1]);
    }
}

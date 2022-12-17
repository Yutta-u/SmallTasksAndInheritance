import java.util.Scanner;

public class Kruglyashi {
    public static Scanner scan = new Scanner(System.in);
    public static String str;
    public static char[] c;
    public static int k = 0;

    public static void main(String[] args) {
        str = scan.nextLine();
        c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (c[i] == '6' || c[i] == '9' || c[i] == '0')
                k++;
            if (c[i] == '8')
                k += 2;
        }
        System.out.println(k);
    }
}

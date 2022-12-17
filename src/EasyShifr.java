import java.util.Scanner;

public class EasyShifr {
    public static Scanner scan = new Scanner(System.in);
    public static char[] c;
    public static String str;

    public static void main(String[] args) {
        str = scan.nextLine();
        c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (c[i] == 'z')
                c[i] = 'a';
            else
                c[i]++;
        }
        System.out.println(c);
    }
}
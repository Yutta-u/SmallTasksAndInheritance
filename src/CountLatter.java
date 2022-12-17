import java.util.Scanner;

public class CountLatter {
    private static final Scanner scan = new Scanner(System.in);
    private static String str;

    public static void main(String[] args) {
        str = scan.nextLine();
        int count = isLatter(str.charAt(0)) + isLatter(str.charAt(2)) + isLatter(str.charAt(4));
        System.out.println(count);
    }
    public static int isLatter(char c) {
        return c >= 65 && c <= 90 || c >= 97 && c <= 121 ? 1 : 0;
    }
}
import java.util.Scanner;

public class Password {
    public static Scanner scan = new Scanner(System.in);
    public static String str;
    public static char[] c;
    public static boolean haveBigLatter = false, haveSmallLatter = false, haveDigit = false, isValid = false;

    public static void main(String[] args) {

        str = scan.nextLine();
        c = str.toCharArray();
        if (str.length() >= 12) {
            for (int i = 0; i < str.length(); i++) {
                if (c[i] >= 65 && c[i] <= 90)
                    haveBigLatter = true;
                else if (c[i] >= 48 && c[i] <= 57)
                    haveDigit = true;
                else if (c[i] >= 97 && c[i] <= 121)
                    haveSmallLatter = true;
            }
            isValid = haveBigLatter && haveDigit && haveSmallLatter;
        }
        if (isValid)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

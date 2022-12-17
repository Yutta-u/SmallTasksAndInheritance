public class Main {
    public static void main(String[] args) {
        DefHuman defHuman = new DefHuman("Papa Het", 20, "brown");

        DefHuman defHuman1 = new DefHuman("Yutta", 18);

        RichHuman richHuman = new RichHuman("Bill", 29, "blue", 123456);

        System.out.println("First human have: ");
        System.out.println("Name is: " + defHuman.name);
        System.out.println("Age: " + defHuman.age);
        System.out.println("Color eye: " + defHuman.colorEyes);
        System.out.println();

        System.out.println("Second human have: ");
        System.out.println("Name is: " + defHuman1.name);
        System.out.println("Age: " + defHuman1.age);
        System.out.println("Color eye: " + defHuman1.colorEyes);
        System.out.println();

        System.out.println("How to find the cube of a number?");
        System.out.println("Your number " + 7);
        System.out.println("Cube Number = " + DefHuman.cubeNumber(7));
        System.out.println();

        System.out.println("This human have: ");
        System.out.println("Name is: " + richHuman.name);
        System.out.println("Age: " + richHuman.age);
        System.out.println("Color eye: " + richHuman.colorEyes);
        System.out.println("Money" + richHuman.getMoney());
    }
}
public class DefHuman {
    public int age;
    public String name;
    public String colorEyes;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 80) {
            System.out.println("Uncorrect age");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        if (colorEyes.equals("white")) {
            System.out.println("It's inpossible");
            return;
        }
        this.colorEyes = colorEyes;
    }

    public DefHuman(String name, int age, String colorEyes) {
        this.name = name;
        this.age = age;
        this.colorEyes = "brown";
    }

    public DefHuman(String name, int age) {
        this.name = name;
        this.age = age;
        this.colorEyes = null;
    }

        public static int cubeNumber(int x) {
        return x * x * x;
    }
}

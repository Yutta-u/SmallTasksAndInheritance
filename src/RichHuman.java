public class RichHuman extends DefHuman {
    private long money;

    public RichHuman(String name, int age, String colorEyes, long money) {
        super(name, age, colorEyes); // так предложила идея
        this.money = money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    long getMoney() {
        return money;
    }
}

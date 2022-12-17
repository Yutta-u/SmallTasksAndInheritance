public class Author {
    private int time;
    private int money;

    public void howLongDoesItTakeToWrite () {
        System.out.println("He wrote it " + time + " days.");
    }

    public void howMuchMoneyWasSpent () {
        System.out.println(money + "$" + " Money was spent.");
    }

    public Author(int time, int money) {
        this.time = time;
        this.money = money;
    }
}

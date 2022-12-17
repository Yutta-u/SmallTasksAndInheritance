public class Comics extends Book {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Comics(String name, int pages, int chapter, String color) {
        super(name, pages, chapter);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", chapter=" + chapter +
                '}';
    }
    @Override
    public void setPages(int pages) {
        super.setPages(pages * 10);
    }

    @Override
    public int getChapter() {
        return super.getChapter();
    }
}

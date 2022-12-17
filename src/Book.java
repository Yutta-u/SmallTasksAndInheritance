import java.util.Objects;

public class Book {
    protected String name;
    protected int pages;
    protected int chapter;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }


    public Book(String name, int pages, int chapter) {
        this.name = name;
        this.pages = pages;
        this.chapter = chapter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (this.hashCode() != o.hashCode())
            return false;
        Book book = (Book) o;
        return pages == book.pages && chapter == book.chapter && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, chapter);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", chapter=" + chapter +
                '}';
    }
}

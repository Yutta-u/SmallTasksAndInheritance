public class BookMain {
    static Book[] libruary = new Book[5];
    public static void main(String[] args) {
        Book book = new Book("Dark in the sky.", 231, 13);
        Book book1 = new Book("Little Prince.", 128, 7);
        Book book2 = new Book();
        libruary[0] = book;
        libruary[1] = book2;
        Author author = new Author(431, 1943);
        Comics comics = new Comics("Akame Kill", 12, 212, "Green");

        book2 = new Book();
        book2.setName("War and Pieces");
        book2.setPages(10000);
        book2.setChapter(27);
        System.out.println(libruary[1]);

        System.out.println("Title of this book: " + book.getName());
        System.out.println("Number of pages and chapters: " + "Pages " + book.getPages() + " Chapter: " + book.getChapter());
        System.out.println();
        System.out.println("Title of this book: " + book1.getName());
        System.out.println("Number of pages and chapters: " + "Pages " + book1.getPages() + " Chapter: " + book1.getChapter());
        System.out.println();
        System.out.println("Are books equal in number of pages?: " + book.equals(book1));
        System.out.println();
        System.out.println(book);
        System.out.println();

        author.howLongDoesItTakeToWrite();
        author.howMuchMoneyWasSpent();
        System.out.println();

        System.out.println(comics);
        System.out.println("Title of this book: " + comics.getName());
        System.out.println("Number of pages and chapters: " + "Pages " + comics.getPages() + " Chapter: " + comics.getChapter());
        System.out.println("Color of this comics are " + comics.getColor());
    }
}

package model;

public class Book {

    private String name;
    private int pageCount;
    private String author;
    private int year;

    public Book(String name, int pageCount, String author, int year) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

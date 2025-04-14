package labtuan2;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {

    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }
    
    @Override
    public String toString() {
        return "Book Code: " + boCode + ", Title: " + boTitle + ", Author: " + boAuthor;
    }
}


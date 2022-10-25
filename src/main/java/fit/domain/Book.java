package fit.domain;

public class Book {
    private String title;
    private int edition;
    
    public Book(String title, int edition) {
        this.title = title;
        this.edition = edition;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}

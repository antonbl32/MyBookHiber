package by.anton.model;




import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="mybook")
public class MyBook {
    public  MyBook(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Gentle gentle;
    @Column
    private String bookName;
    @Column
    private String description;
    @Column(name = "databook")
    private String dateBook;
    @Column
    private int price;

    public MyBook(Gentle gentle, String bookName, String description, String dateBook, int price) {
        this.gentle = gentle;
        this.bookName = bookName;
        this.description = description;
        this.dateBook = dateBook;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public Gentle getGentle() {
        return gentle;
    }

    public void setGentle(Gentle gentle) {
        this.gentle = gentle;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateBook() {
        return dateBook;
    }

    public void setDateBook(String dateBook) {
        this.dateBook = dateBook;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "id=" + id +
                ", gentle=" + gentle +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                ", dateBook=" + dateBook +
                ", price=" + price +
                '}';
    }
}

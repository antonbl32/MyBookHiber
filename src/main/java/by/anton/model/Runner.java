package by.anton.model;

import java.sql.SQLException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws SQLException {
        DaoBook daoBook=new DaoBook();
        MyBook myBook=new MyBook(Gentle.Classical,"mysecond","no desc2","2015-10-1",10);
        daoBook.save(myBook);
        List<MyBook> mybooks=daoBook.getAll();
        for (MyBook my :mybooks
                ) {
            System.out.println(my);
        }
    }
}

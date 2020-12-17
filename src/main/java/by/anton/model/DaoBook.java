package by.anton.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DaoBook {
    public MyBook findById(int id){
     return myBookRunner.getSessionFactory().openSession().get(MyBook.class,id);
    }
    public void save(MyBook myBook){
        Session session=myBookRunner.getSessionFactory().openSession();
        Transaction tx1= session.beginTransaction();
        session.save(myBook);
        tx1.commit();
        session.close();
    }
    public List<MyBook> getAll(){
        List<MyBook> myBooks=(List<MyBook>) myBookRunner.getSessionFactory().openSession()
                .createQuery("FROM MyBook").list();

        return myBooks;
    }


}

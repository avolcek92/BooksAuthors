import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Dao {



    public void createBook(Books book) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void createAuthor(Authors author) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void updateAuthor(Authors authors) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(authors);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }

    }

    public void updateBook(Books books) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(books);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }

    }

    public List<Books> getAllBooks() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Books> books = session.createQuery("from book", Books.class).list();
            session.close();
            return books;
        } catch (Exception ex){
            ex.printStackTrace();
            return  null;
        }
    }

    public List<Authors> getAllAuthors() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Authors> authors = session.createQuery("from Author", Authors.class).list();
            session.close();
            return authors;
        } catch (Exception ex){
            ex.printStackTrace();
            return  null;
        }
    }

    public void deleteBook(Books books) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(books);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }

    }
    public void deleteAuthor(Authors authors) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(authors);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }

    }




}
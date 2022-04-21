package Warehouse;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    
    private String shopName;
    private List<Book> books = new ArrayList<>();

    
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        //Insert from Data Base
        for(int i=0; i<10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("book #"+i);
            getBooks().add(b);
        }
    }
    
    @Override
    public String toString() {
        return "BookShop [books=" + books + ", shopName=" + shopName + "]";
    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        this.getBooks().forEach(b -> bs.getBooks().add(b));
        return bs;
    }


}

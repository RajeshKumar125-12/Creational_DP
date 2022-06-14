package Prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
    private String shopName;
    List<Book> books=new ArrayList<>();

    public String getShopName()
    {
        return shopName;
    }
    public List<Book> getBooks()
    {
        return books;
    }
    public void setShopName(String shopName)
    {
        this.shopName=shopName;
    }
    public void setBooks(List<Book> books)
    {
        this.books=books;

    }
    public String toString()
    {
        return  "BookShop [shopname = "+shopName+" ,books= "+books+" ]";
    }
    public void loadData()
    {
        for(int i=1;i<=10;i++)
        {
            Book b=new Book();
            b.setBid(i);
            b.setBname("B "+i);
            getBooks().add(b);
        }
    }
    protected BookShop clone() throws  CloneNotSupportedException
    {
        BookShop  shop=new BookShop();
        for(Book b:getBooks())
        {
            shop.getBooks().add(b);

        }
        return shop;

    }

}

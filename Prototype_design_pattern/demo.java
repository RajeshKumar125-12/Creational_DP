package Prototype_design_pattern;

public class demo 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        BookShop bs=new BookShop();
        bs.setShopName("A1 Store");
        bs.loadData();
        //System.out.println(bs);
        //BookShop bs1=new BookShop();

        //BookShop bs1=(BookShop)bs.clone(); //fetch shallow copy data from bs
        
        BookShop bs1=bs.clone();   //fetch deep copy

        bs.getBooks().remove(2);

        bs1.setShopName("A2 Store");

        //bs1.loadData();    // from database, connecting and fetching data
        
        System.out.println(bs);
        System.out.println(bs1);

        
    }
    
}

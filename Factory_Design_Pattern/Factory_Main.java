package Factory_Design_Pattern;

public class Factory_Main 
{
    public static void main(String args[])
    {
       Factory ob1=new Factory();
       OS ob2=ob1.getInstance("Android");
       ob2.show();
    }

    
}

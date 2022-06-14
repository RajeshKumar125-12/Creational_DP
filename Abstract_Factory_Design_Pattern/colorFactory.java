package Abstract_Factory_Design_Pattern;

public class colorFactory extends AbstractFactory
 {
     
    public shape getShape(String shapeType)
    {
            return null;

    }
    public color getColor(String color)
    {
       if(color==null)
        return null;
        if(color.equals("red"))
            return new red();
        else if(color.equals("blue"))
            return new blue();
        else 
            return null;
    }
    
}

package Abstract_Factory_Design_Pattern;

//import javax.lang.model.util.ElementScanner14;

public class shapeFactory extends AbstractFactory
 {

    public shape getShape(String shapeType)
    {
        if(shapeType==null)
            return null;
        if(shapeType.equals("circle"))
            return new circle();
        else if(shapeType.equals("rectangle"))
            return new rectangle();
        else 
            return null;

    }
    public color getColor(String color)
    {
        return null;
    }
    
}

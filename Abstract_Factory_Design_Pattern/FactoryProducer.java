package Abstract_Factory_Design_Pattern;

public class FactoryProducer 
{
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equals("shape"))
            return new shapeFactory();
        else if(choice.equals("color"))
            return new colorFactory();
        else 
            return null;
    }
    
}

package Abstract_Factory_Design_Pattern;

public class AFDemo 
{
    public static void main(String[] args) 
    {
        AbstractFactory ob1=FactoryProducer.getFactory("shape");
        shape ob2=ob1.getShape("circle");
        ob2.draw();


        AbstractFactory ob_1=FactoryProducer.getFactory("color");
        color ob_2=ob_1.getColor("red");
        ob_2.fill();
        
    }
    
}

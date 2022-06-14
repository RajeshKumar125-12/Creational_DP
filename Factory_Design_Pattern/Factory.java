package Factory_Design_Pattern;

public class Factory 
{
    public OS getInstance(String str)
    {
        if(str.equals("Android"))
            return new Android();
        else 
            return new Windows();

    }
    
}

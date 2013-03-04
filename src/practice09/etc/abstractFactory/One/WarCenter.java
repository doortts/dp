package practice09.etc.abstractFactory.One;

public class WarCenter extends Center
{
    public WarCenter()
    {
        setSize( "101" );
        System.out.println( "[WarCenter] : Center Created!!" );
    }

    public String getCenterInfo()
    {
        return "WarCraft Center Info : " + getSize();
    }
}

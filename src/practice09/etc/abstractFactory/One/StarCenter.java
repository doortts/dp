package practice09.etc.abstractFactory.One;

public class StarCenter extends Center
{
    public StarCenter()
    {
        setSize( "11" );
        System.out.println( "[StarCenter] : Center Created!!" );
    }

    public String getCenterInfo()
    {
        return "StarCraft Center Info : " + getSize();
    }
}

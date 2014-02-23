package practice99.etc.abstractFactory.One;

public class WarMap extends Map
{
    public WarMap()
    {
        setSize( "100" );
        System.out.println( "[WarMap] : Map Created!!" );
    }

    public String getMapInfo()
    {
        return "WarCraft Map Info : " + getSize();
    }
}

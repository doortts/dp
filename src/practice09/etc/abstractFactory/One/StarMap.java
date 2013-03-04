package practice09.etc.abstractFactory.One;

public class StarMap extends Map
{
    public StarMap()
    {
        setSize( "10" );
        System.out.println( "[StarMap] : Map Created!!" );
    }

    public String getMapInfo()
    {
        return "StarCraft Map Info : " + getSize();
    }
}

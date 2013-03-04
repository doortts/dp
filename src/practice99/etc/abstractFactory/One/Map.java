package practice99.etc.abstractFactory.One;

public abstract class Map
{
    public String size;

    public String getSize()
    {
        return size;
    }

    public void setSize( String size )
    {
        this.size = size;
    }

    public abstract String getMapInfo();
}

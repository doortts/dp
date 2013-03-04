package practice09.etc.abstractFactory.One;

public class WarCraft implements AbstractCraft
{
    public WarCraft()
    {
        System.out.println( "[WarCraft] : WarCraft Created!!" );
    }

    public Map createMap()
    {
        return new WarMap();
    }

    public Center createCenter()
    {
        return new WarCenter();
    }

    public Worker createWorker()
    {
        return new WarWorker();
    }

}

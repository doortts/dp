package practice99.etc.abstractFactory.One;

public class StarCraft implements AbstractCraft
{
    public StarCraft()
    {
        System.out.println( "[StarCraft] : StarCraft Created!!" );
    }

    public Map createMap()
    {
        return new StarMap();
    }

    public Center createCenter()
    {
        return new StarCenter();
    }

    public Worker createWorker()
    {
        return new StarWorker();
    }

}

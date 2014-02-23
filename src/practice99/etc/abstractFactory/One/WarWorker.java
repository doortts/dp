package practice99.etc.abstractFactory.One;

public class WarWorker extends Worker
{
    public WarWorker()
    {
        setSize( "102" );
        System.out.println( "[WarWorker] : Worker Created!!" );
    }

    public String getWorkerInfo()
    {
        return "WarCraft Worker Info : " + getSize();
    }
}

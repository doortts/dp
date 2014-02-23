package practice99.etc.abstractFactory.One;

public class StarWorker extends Worker
{
    public StarWorker()
    {
        size = "12";
        System.out.println( "[StarWorker] : Worker Created!!" );
    }

    public String getWorkerInfo()
    {
        return "StarCraft Worker Info : " + getSize();
    }
}

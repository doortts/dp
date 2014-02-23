package practice99.etc.abstractFactory.One;

public class CraftDriver
{
    public static void main( String [] args )
    {
        AbstractCraft aCraft = null;

            aCraft = new StarCraft();
            displayCraftInfo( aCraft );
            
            aCraft = new WarCraft();
            displayCraftInfo( aCraft );
    }

    private static void displayCraftInfo( AbstractCraft inCraft )
    {
        Map map = inCraft.createMap();
        Center center = inCraft.createCenter();
        Worker worker = inCraft.createWorker();

        System.out.println( "[CraftDriver] : MapInfo    = " + map.getMapInfo() );
        System.out.println( "[CraftDriver] : CenterInfo = " + center.getCenterInfo() );
        System.out.println( "[CraftDriver] : WorkerInfo = " + worker.getWorkerInfo() );
    }
}

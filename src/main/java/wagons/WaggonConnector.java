package wagons;

public class WaggonConnector implements Wagon {

    String wagonType;

    public WaggonConnector(){
        wagonType = ":";
    }

    @Override
    public String getWagon() {
        return "::";
    }
}

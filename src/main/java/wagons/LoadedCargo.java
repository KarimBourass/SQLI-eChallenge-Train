package wagons;

public class LoadedCargo implements Wagon {
    String wagonType;

    public LoadedCargo(){

        wagonType = "|^^^^|";
    }

    @Override
    public String getWagon() {
        return wagonType;
    }
}

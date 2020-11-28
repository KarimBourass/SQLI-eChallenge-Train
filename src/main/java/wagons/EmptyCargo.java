package wagons;

public class EmptyCargo implements Wagon {
    String wagonType;

    public EmptyCargo(){
        wagonType = "|____|";
    }

    @Override
    public String getWagon() {
        return wagonType;
    }
}

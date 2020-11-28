package wagons;

public class Passenger implements Wagon {
    String wagonType;

    public Passenger(){
        wagonType = "|OOOO|";
    }

    @Override
    public String getWagon() {
        return wagonType;
    }
}

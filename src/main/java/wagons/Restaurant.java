package wagons;

public class Restaurant implements Wagon {
    String wagonType;

    public Restaurant(){
        wagonType = "|hThT|";
    }

    @Override
    public String getWagon() {
        return wagonType;
    }
}

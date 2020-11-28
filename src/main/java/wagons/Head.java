package wagons;

public class Head implements Wagon {

    String wagonType;

    public Head(boolean isReversed){
        if(isReversed){
            wagonType = "<HHHH";
        }
        else wagonType = "HHHH>";

    }

    @Override
    public String getWagon() {
        return wagonType;
    }
}

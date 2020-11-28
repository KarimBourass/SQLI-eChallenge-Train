import trainFactory.TrainFactory;
import trainFactory.TrainFactoryImp;
import wagons.*;

import java.util.LinkedList;


public class Train {

    private LinkedList<Wagon> wagons;
    public TrainFactory trainFactory = TrainFactoryImp.getInstance();

    public Train(String trainStructure) {
        wagons =  trainFactory.craeteTrain(trainStructure);
    }

    public String print() {
        String train="";
        for(Wagon wagon : wagons) {
            train += wagon.getWagon();
        }
        return train;
    }

    public void detachEnd() {
        if(wagons.peekLast() instanceof Head) {
            wagons.pollLast();
        }
        //detach the trailing connector
        if(wagons.peekLast() instanceof WaggonConnector) {
            wagons.pollLast();
        }
    }

    public boolean fill() {
        for (Wagon wagon : wagons){
            if( wagon.getWagon() == "|____|"){
                wagons.set(wagons.indexOf(wagon),new LoadedCargo());
                break;
            }
        }
        return false;
    }

    public void detachHead() {
        if(wagons.peek() instanceof Head) {
            wagons.poll();
        }
        //detach the trailing connector
        if(wagons.peek() instanceof WaggonConnector) {
            wagons.poll();
        }
    }
}

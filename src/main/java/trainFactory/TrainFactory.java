package trainFactory;

import wagons.Wagon;

import java.util.LinkedList;

public abstract class TrainFactory {

    public abstract LinkedList<Wagon> craeteTrain(String structure);
}

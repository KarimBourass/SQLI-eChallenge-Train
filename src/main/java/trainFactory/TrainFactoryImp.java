package trainFactory;

import wagons.*;

import java.util.LinkedList;

public class TrainFactoryImp extends TrainFactory {

    public static TrainFactoryImp isntance = null;
    LinkedList<Wagon> train  = new LinkedList<>();

    private TrainFactoryImp(){ }

    public static TrainFactoryImp getInstance(){
        if(isntance == null){
            return new TrainFactoryImp();
        }
        else return isntance;
    }

    @Override
    public LinkedList<Wagon> craeteTrain(String trainStructure) {
        for (int i = 0; i < trainStructure.length(); i++){
            switch(trainStructure.charAt(i)) {
                case  'H':
                    if(i == trainStructure.length()-1){
                        train.add(new Head(false));
                    }else {
                        train.add(new Head(true));
                    }
                    break;
                case  'P':
                    train.add(new Passenger());
                    break;
                case  'R':
                    train.add(new Restaurant());
                    break;
                case  'C':
                    train.add(new EmptyCargo());
                    break;
                case  'F':
                    train.add(new LoadedCargo());
                    break;
                default:
                    System.out.println("Invalid letter");
            }
            if(i<trainStructure.length()-1)
                train.add(new WaggonConnector());
        }

        return train;
    }





}

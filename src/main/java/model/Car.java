package model;

import view.OutputView;

public class Car {
    private static final int CAR_MOVE_STANDARD_NUMBER = 4;

    private final CarName name;
    private final Position position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
    }
    public String getName () {
        return name.getName();
    }

    public void carMove(int moveFlagNumber){
        if(moveFlagNumber >= CAR_MOVE_STANDARD_NUMBER){
            position.goOneStep();
        }
    }

    public int getCarPosition(){
        return position.getPosition();
    }
}

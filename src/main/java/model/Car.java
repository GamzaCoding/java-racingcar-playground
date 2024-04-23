package model;

import view.OutputView;

public class Car {
    private static final int NAME_LIMIT = 5;
    private static final int CAR_MOVE_STANDARD_NUMBER = 4;
    private static final int CAR_MOVE_POINT = 1;

    private final CarName name;
    private final MoveForwardNumber moveForwardNumber;

    public Car(CarName name) {
        checkException(name);
        this.name = name;
        this.moveForwardNumber = new MoveForwardNumber();
    }

    private void checkException(CarName name) {
        if (name.getNameLength() > NAME_LIMIT) {
            OutputView.printNameLimitMessage();
            throw new IllegalArgumentException();
        }
    }
    public String getName () {
        return name.getName();
    }

    public void carMove(int moveFlagNumber){
        if(moveFlagNumber >= CAR_MOVE_STANDARD_NUMBER){
            moveForwardNumber.goOneStep();
        }
    }

    public int getCarLocation(){
        return moveForwardNumber.getMoveForwardNumber();
    }
}

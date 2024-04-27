package model;

public class Car {

    private final CarName name;
    private final Position position;
    private final MoveStrategy moveStrategy;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
        moveStrategy = new CarMoveStrategy();
    }
    public String getName () {
        return name.getName();
    }

    public void carMove(int moveFlagNumber){
        if(moveStrategy.isMovable(moveFlagNumber)){
            position.goOneStep(moveStrategy.getMovementAmount());
        }
    }

    public int getCarPosition(){
        return position.getPosition();
    }
}

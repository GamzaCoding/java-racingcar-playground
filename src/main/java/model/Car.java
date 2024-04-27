package model;

public class Car {

    private final CarName name;
    private final Position position;
    private final CarMoveStrategy carMoveStrategy;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
        carMoveStrategy = new CarMoveStrategy();
    }
    public String getName () {
        return name.getName();
    }

    public void carMove(int moveFlagNumber){
        if(carMoveStrategy.isMovable(moveFlagNumber)){
            position.goOneStep(carMoveStrategy.getMovementAmount());
        }
    }

    public int getCarPosition(){
        return position.getPosition();
    }
}

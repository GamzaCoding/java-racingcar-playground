package model;

public class CarMoveStrategy implements MoveStrategy {
    private static final int CAR_MOVE_STANDARD_NUMBER = 4;
    private static final int CAR_MOVEMENT_AMOUNT = 1;

    @Override
    public boolean isMovable(int moveFlagNumber) {
        return moveFlagNumber >= CAR_MOVE_STANDARD_NUMBER;
    }

    @Override
    public int getMovementAmount() {
        return CAR_MOVEMENT_AMOUNT;
    }

}

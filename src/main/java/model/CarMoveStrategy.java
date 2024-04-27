package model;

public class CarMoveStrategy {
    private static final int CAR_MOVE_STANDARD_NUMBER = 4;
    private static final int CAR_MOVEMENT_AMOUNT = 1;

    public boolean isMovable(int moveFlagNumber) {
        return moveFlagNumber >= CAR_MOVE_STANDARD_NUMBER;
    }

    public int getMovementAmount() {
        return CAR_MOVEMENT_AMOUNT;
    }
}

package model;

public class MoveForwardNumber { // 포장된 값(값 객체)
    private static final int SETTING_NUMBER = 0;
    private static final int ONE_STEP = 1;

    private int cumulativeMoveForwardNumber;

    public MoveForwardNumber(){
        this.cumulativeMoveForwardNumber = SETTING_NUMBER;
    }

    public void goOneStep(){
        cumulativeMoveForwardNumber += ONE_STEP;
    }

    public int getMoveForwardNumber() {
        return cumulativeMoveForwardNumber;
    }
}

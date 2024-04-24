package model;

public class Position { // 포장된 값(값 객체)
    private static final int START_POSITION = 0;
    private static final int ONE_STEP = 1;

    private int position;

    public Position(){
        this.position = START_POSITION;
    }

    public void goOneStep(){
        position += ONE_STEP;
    }

    public int getPosition() {
        return position;
    }
}

package racingcar.model;

public class Car {

    private final String name;
    private int position;
    private final Move moveStrategy;

    public Car(String name, Move moveStrategy) {
        this.name = name;
        this.position = 0;
        this.moveStrategy = moveStrategy;
    }

    public void move(){
        if(moveStrategy.MoveOrNot()) {
            this.position ++;
        }
    }

    public boolean isAtPosition(int position) {
        return this.position == position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }



}

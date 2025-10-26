package racingcar.model;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cars {
    private static final String DELIMITER = ",";
    private final List<Car> cars;



    //car 리스트 생성
    public Cars(String carNamesInput, Move moveStrategy) {

        String[] names = carNamesInput.split(DELIMITER);

        this.cars = new ArrayList<>();
        for (String name : names) {
            this.cars.add(new Car(name.trim(), moveStrategy));
        }
    }


    //자동차 위치 이동
    public void moveAll() {
        for (Car car : cars) {
            car.move();
        }
    }


    //우승자 찾고 리스트 삽입
    public List<String> findWinners() {

        int maxPosition = findMaxPosition();

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAtPosition(maxPosition)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    // 최대 이동 거리 확인
    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }


    //출력용
    public List<Car> getCars() {
        return this.cars;
    }
}

package racingcar;

import racingcar.model.Car;
import racingcar.model.Cars;
import java.util.List;


public class Output {


    //실행결과 출력
    public void printHeader() {
        System.out.println("\n실행 결과");
    }


    //라운드 별 실행결과 출력
    public void printResult(Cars cars) {
        for (Car car : cars.getCars()) {
            printPosition(car);
        }

        System.out.println();
    }



    //자동차 이름 출력, 위치는 "-"를 이용해 출력
    private void printPosition(Car car) {
        String bars = "-".repeat(car.getPosition());
        System.out.printf("%s : %s\n", car.getName(), bars);
    }



    //우승자 출력
    public void printWinners(List<String> winners) {
        String winnerNames = String.join(", ", winners);
        System.out.println("최종 우승자 : " + winnerNames);
    }


}

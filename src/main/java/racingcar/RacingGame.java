package racingcar;

import racingcar.model.Cars;
import racingcar.model.RandomMove;
import java.util.List;

public class RacingGame {

        private final Input input;
        private final Output output;




        public RacingGame() {
            this.input = new Input();
            this.output = new Output();
        }




        //게임 실행
        public void run() {
            Cars cars = setupCars();
            int tryCount = setupTryCount();

            playRounds(cars, tryCount);
            Winners(cars);
        }

        //자동차 이름 입력 유효성 검사, 리스트 생성
        private Cars setupCars() {
            String carNamesInput = input.readCarNames();
            Validator.validateCarNames(carNamesInput);
            return new Cars(carNamesInput, new RandomMove());
        }



        //횟수 입력 및 유효성 검사
        private int setupTryCount() {
            String tryCountInput = input.readTryCount();
            return Validator.validateTryCount(tryCountInput);
        }




        //라운드 별 결과 출력
        private void playRounds(Cars cars, int tryCount) {
            output.printHeader();
            for (int i = 0; i < tryCount; i++) {
                cars.moveAll();
                output.printResult(cars);
            }
        }



        //우승자 출력
        private void Winners(Cars cars) {
            List<String> winners = cars.findWinners(); // Model에게 위임
            output.printWinners(winners);
        }

    }


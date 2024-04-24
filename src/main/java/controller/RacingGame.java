package controller;
import model.Car;
import model.CarName;
import model.Cars;
import model.RandomNumber;
import view.InputView;
import view.OutputView;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private Cars racingCars;
    public void play(){
        OutputView.racingStartMessage();

        racingCars = new Cars(carsSetting());

        OutputView.attemptNumberMessage();

        rePlay(InputView.inputPlayCount());
        OutputView.printGameResultMessage();

        OutputView.printGameWinnerMessage(findWinner());

    }

    private String findWinner() {
        Car highestPositioncar = racingCars.getCars().stream()
                .max(Comparator.comparing(Car::getCarPosition))
                .get();

        List<Car> winners = racingCars.getCars().stream()
                .filter(car -> car.getCarPosition() == highestPositioncar.getCarPosition())
                .collect(Collectors.toList());

        return winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
    }

    private void rePlay(int playCount) {
        for(int i = 0; i < playCount; i++){
            gameResult();
            System.out.println();
        }
    }

    private void gameResult() { // GameResultView 클래스를 따로 만들어서 분리 하자
        for(int i = 0; i < racingCars.size(); i++){
            racingCars.getCar(i).carMove(RandomNumber.createRandomNumberZeroToNine());
        }


        for(int i = 0; i < racingCars.size(); i++){
            System.out.println(racingCars.getCarName(i) + ":" + repeatedSign(racingCars.getCar(i).getCarPosition()));
        }
    }

    private String repeatedSign(int carLocation) {
        StringBuilder sign = new StringBuilder("-");
        for (int i = 0; i<carLocation; i++){
            sign.append("-");
        }
        return sign.toString();
    }

    private List<Car> carsSetting() {
        return mapToCarList(InputView.inputCarName());
    }


    private static List<Car> mapToCarList(List<String> carNamesString) {
         return carNamesString.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return racingCars.getCarsName();
    }
}

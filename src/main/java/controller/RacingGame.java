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

        racingCars = new Cars(mapToCarNameList(InputView.inputCarName()));

        OutputView.attemptNumberMessage();

        rePlay(InputView.inputPlayCount());
        OutputView.printGameResultMessage();

        OutputView.printGameWinnerMessage(findWinner());

    }

    private String findWinner() {
        Car winnercar = racingCars.getCars().stream()
                .max(Comparator.comparing(Car::getCarLocation))
                .get();

        List<Car> winners = racingCars.getCars().stream()
                .filter(car -> car.getCarLocation() == winnercar.getCarLocation())
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

    private void gameResult() {
        for(int i = 0; i<racingCars.size(); i++){
            racingCars.getCar(i).carMove(RandomNumber.createRandomNumberZeroToNine());
        }


        for(int i = 0; i < racingCars.size(); i++){
            System.out.println(racingCars.getCarName(i) + ":" + repeatedSign(racingCars.getCar(i).getCarLocation()));
        }
    }

    private String repeatedSign(int carLocation) {
        StringBuilder sign = new StringBuilder("-");
        for (int i = 0; i<carLocation; i++){
            sign.append("-");
        }
        return sign.toString();
    }


    private static List<Car> mapToCarNameList(List<String> carNamesString) {
         return carNamesString.stream()
                .map(CarName::new)
                .map(Car::new)
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return racingCars.getCarsName();
    }
}

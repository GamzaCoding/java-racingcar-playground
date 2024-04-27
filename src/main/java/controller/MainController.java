package controller;

import model.Cars;
import view.OutputView;

public class MainController {

    private final InputController inputController;
    private Cars racingCars;

    public MainController(){
        this.inputController = new InputController();
    }
    public void play(){
        OutputView.racingStartMessage();
        racingCars = new Cars(inputController.getCarsName());

        OutputView.attemptNumberMessage();

        rePlay(inputController.getPlayCount());

        OutputView.printGameResultMessage();
        OutputView.printGameWinnerMessage(racingCars.findWinner());
    }

    private void rePlay(int playCount) {
        for(int i = 0; i < playCount; i++){
            racingCars.carsMove();
            OutputView.printGameResult(racingCars);
        }
    }
}

package racingcar.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.CarStorage;

public class User {
    public User() {}
    public void inputCarNames() throws IllegalArgumentException {
        String carNames = readLine();
        String[] splitCars = carNames.split(",");

        for (String car: splitCars) {
            car = car.replace(" ", "");


            CarStorage.addCar(new Car(car));
        }
    }
    public Integer inputTryCount() {
        Integer tryCount = Integer.parseInt(readLine());
        return tryCount;
    }
    public Integer pickRandomInt() {
        Integer random = Randoms.pickNumberInRange(0,9);
        return random;
    }
}

package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import com.epam.jwd.task1.entity.train.PassengerTrain;

/**
 * The class contains methods for counting the number of passengers and luggage.
 */
public class PassengerBaggageCounter {

    private Integer totalPassengerNumber = 0;
    private Integer totalPassengerBaggage = 0;
    private PassengerTrain passengerTrain;

    /**
     *  Default class constructor.
     */
    public PassengerBaggageCounter() {
    }

    /**
     * Class constructor that accepts an object of the passenger train class.
     * Calls a method that calculates the number of passengers
     * and baggage on the train.
     *
     * @param passengerTrain object of a passenger train
     */
    public PassengerBaggageCounter(PassengerTrain passengerTrain) {
        this.passengerTrain = passengerTrain;
        countTotalPersonBaggageNumber();
    }

    /**
     * The method that calculates the number of passengers
     * and baggage on the train passed in the constructor.
     * The result of the calculation is placed in
     * the corresponding class variables.
     */
    private void countTotalPersonBaggageNumber() {
        for (PassengerCarriage carriage
                : passengerTrain.getPassengerCarriages()) {
            totalPassengerNumber += carriage.getPassengerNumber();
            totalPassengerBaggage += carriage.getPassengerLuggage();
        }
    }

    /**
     * The method that calculates
     * the number of passengers
     * and luggage on a train.
     * The result of the calculation
     * is placed in the corresponding class variables.
     * @param passengerTrain calculated train
     */
    public void countTotalPassengerBaggageNumber(PassengerTrain passengerTrain) {
        for (PassengerCarriage carriage
                : passengerTrain.getPassengerCarriages()) {
            totalPassengerNumber += carriage.getPassengerNumber();
            totalPassengerBaggage += carriage.getPassengerLuggage();
        }
    }

    public Integer getTotalPassengerNumber() {
        return totalPassengerNumber;
    }

    public Integer getTotalLuggageNumber() {
        return totalPassengerBaggage;
    }

    public PassengerTrain getPassengerTrain() {
        return passengerTrain;
    }
}

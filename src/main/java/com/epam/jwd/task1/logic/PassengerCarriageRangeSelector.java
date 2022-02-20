
package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import com.epam.jwd.task1.entity.train.PassengerTrain;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to search for carriages
 * in a train that correspond to a given range
 * of parameters for the number of passengers.
 * @author Eugeny Zaitsev
 */
public class PassengerCarriageRangeSelector {

    private List<PassengerCarriage> selectedPassengerCarriages;
    PassengerTrain passengerTrain;

    /**
     * This is constructor for this class.
     *
     * @param passengerTrain this is passenger train object in which this method searches value
     */
    public PassengerCarriageRangeSelector(PassengerTrain passengerTrain) {
        this.passengerTrain = passengerTrain;
        selectedPassengerCarriages = new ArrayList<>();
    }

    /**
     * Selects the train cars corresponding
     * to the specified range of passengers.
     *
     * @param minimumPassengers the minimum value of passengers in the range
     *
     * @param maximumPassengers the maximum value of passengers in the range
     */
    public void selectPassengerCarriageRange(int minimumPassengers, int maximumPassengers) {
        for (PassengerCarriage passengerCarriage : passengerTrain.getPassengerCarriages()) {
            if ((passengerCarriage.getPassengerNumber() >= minimumPassengers)
                    && (passengerCarriage.getPassengerNumber() <= maximumPassengers)) {
                selectedPassengerCarriages.add(passengerCarriage);
            }
        }
    }

    /**
     * This method outputs the result of executing the method.
     */
    public void printSelectedPassengerCarriageRange() {
        for (PassengerCarriage passengerCarriage : selectedPassengerCarriages) {
            System.out.println(passengerCarriage.toString() + "\n");
        }
    }

    @Override
    public String toString() {
        return "Selector{"
                + "selectedPassengerCarriages="
                + selectedPassengerCarriages
                + '}';
    }
}

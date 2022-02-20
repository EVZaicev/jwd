/**
 * This is first task for epam course. task name
 */

package com.epam.jwd.task1.main;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import com.epam.jwd.task1.entity.carriage.PassengerTrainCompiler;
import com.epam.jwd.task1.logic.ComparatorCarriage;
import com.epam.jwd.task1.logic.PassengerBaggageCounter;
import com.epam.jwd.task1.logic.PassengerCarriageRangeSelector;
import java.util.Collections;

/**
 * This is main application class.
 * @author Eugeny Zaitsev
 */
public class Run {

    /**
     * Entry point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PassengerTrainCompiler passengerTrainCompiler =
                new PassengerTrainCompiler();

        PassengerCarriageRangeSelector selector =
                new PassengerCarriageRangeSelector(
                        passengerTrainCompiler.getInternalСombustionPassengerTrain());
        final Integer MINIMUM = 20;
        final int MAXIMUM = 50;
        selector.selectPassengerCarriageRange(MINIMUM, MAXIMUM);
        selector.printSelectedPassengerCarriageRange();

        PassengerBaggageCounter passengerBaggageCounter =
                new PassengerBaggageCounter(
                        passengerTrainCompiler.getInternalСombustionPassengerTrain());
        System.out.println("Total number of luggage  is "
                + passengerBaggageCounter.getTotalLuggageNumber());
        System.out.println("Total number of passengers  is "
                + passengerBaggageCounter.getTotalPassengerNumber());

        PassengerBaggageCounter personLuggageCounter1 = new PassengerBaggageCounter();
        personLuggageCounter1.countTotalPassengerBaggageNumber(
                passengerTrainCompiler.getElectricPassengerTrain());

        ComparatorCarriage comparator = new ComparatorCarriage();
        Collections.sort(passengerTrainCompiler.getPassengerCarriageList1(), comparator);
        for (PassengerCarriage passengerCarriage
                : passengerTrainCompiler.getPassengerCarriageList1()) {
            System.out.println(passengerCarriage);
        }

    }

}

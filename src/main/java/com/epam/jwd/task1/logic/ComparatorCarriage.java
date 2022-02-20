package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import java.util.Comparator;

/**
 * The class is used to sort train carriages by comfort level
 * using interface comparator.
 */
public class ComparatorCarriage implements Comparator<PassengerCarriage> {

    /**
     * The method implements interface comparator.
     * Sorting by comfort level field.
     *
     * @param o1 first carriage for compare
     *
     * @param o2 second carriage for compare
     *
     * @return negative integer, zero or positive integer after compare
     */
    @Override
    public int compare(PassengerCarriage o1, PassengerCarriage o2) {
        return o1.getComfortLevel().compareTo(o2.getComfortLevel());
    }
}

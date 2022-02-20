package com.epam.jwd.task1.entity.carriage;

import java.util.Objects;

/**
 * @author Eugeny Zaitsev
 */
public class PassengerCarriage {
    private Integer passengerNumber;
    private String comfortLevel;
    private Integer passengerLuggage;

    @Override
    public String toString() {
        return "PassengerCarriage{" +
                "passengerNumber=" + passengerNumber +
                ", comfortLevel='" + comfortLevel + '\'' +
                ", passengerLuggage=" + passengerLuggage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerCarriage that = (PassengerCarriage) o;
        return Objects.equals(passengerNumber, that.passengerNumber) && Objects.equals(comfortLevel, that.comfortLevel) && Objects.equals(passengerLuggage, that.passengerLuggage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerNumber, comfortLevel, passengerLuggage);
    }

    public Integer getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(Integer passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public String getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(String comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public Integer getPassengerLuggage() {
        return passengerLuggage;
    }

    public void setPassengerLuggage(Integer passengerLuggage) {
        this.passengerLuggage = passengerLuggage;
    }

    public PassengerCarriage(Integer passengerNumber, String comfortLevel, Integer passengerLuggage) {
        this.passengerNumber = passengerNumber;
        this.comfortLevel = comfortLevel;
        this.passengerLuggage = passengerLuggage;
    }
}

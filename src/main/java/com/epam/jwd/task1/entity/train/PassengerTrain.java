package com.epam.jwd.task1.entity.train;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import java.util.List;
import java.util.Objects;

/**
 * @author Eugeny Zaitsev
 */
public class PassengerTrain extends Train {
    List<PassengerCarriage> passengerCarriages;

    public PassengerTrain(Integer trainNumber,
                          Integer maxSpeed,
                          String locomotiveSeries,
                          EnergySourceType energySourceType,
                          List<PassengerCarriage> passengerCarriages) {
        super(trainNumber, maxSpeed, locomotiveSeries, energySourceType);
        this.passengerCarriages = passengerCarriages;
    }

    public List<PassengerCarriage> getPassengerCarriages() {
        return passengerCarriages;
    }

    @Override
    public String toString() {
        return "PassengerTrain{" +
                "passengerCarriages=" + passengerCarriages +
                ", trainNumber=" + trainNumber +
                ", maxSpeed=" + maxSpeed +
                ", locomotiveSeries='" + locomotiveSeries + '\'' +
                ", energySourceType=" + energySourceType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PassengerTrain that = (PassengerTrain) o;
        return Objects.equals(passengerCarriages, that.passengerCarriages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCarriages);
    }

    public void setPassengerCarriages(List<PassengerCarriage> passengerCarriages) {
        this.passengerCarriages = passengerCarriages;
    }

}

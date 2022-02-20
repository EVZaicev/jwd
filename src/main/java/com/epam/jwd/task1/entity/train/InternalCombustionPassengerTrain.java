package com.epam.jwd.task1.entity.train;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import java.util.List;

/**
 * @author Eugeny Zaitsev
 */
public class InternalCombustionPassengerTrain extends PassengerTrain {
    FuelType fuelType;

    public InternalCombustionPassengerTrain(
            Integer trainNumber,
            Integer maxSpeed,
            String locomotiveSeries,
            EnergySourceType energySourceType,
            List<PassengerCarriage> passengerCarriages,
            FuelType fuelType) {
        super(trainNumber, maxSpeed, locomotiveSeries, energySourceType, passengerCarriages);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "InternalСombustionPassengerTrain{" +
                "fuelType=" + fuelType +
                ", passengerCarriages=" + passengerCarriages +
                ", trainNumber=" + trainNumber +
                ", maxSpeed=" + maxSpeed +
                ", locomotiveSeries='" + locomotiveSeries + '\'' +
                ", energySourceType=" + energySourceType +
                '}';
    }
}

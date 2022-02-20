package com.epam.jwd.task1.entity.train;

import com.epam.jwd.task1.entity.carriage.PassengerCarriage;
import java.util.List;
import java.util.Objects;

/**
 * @author Eugeny Zaitsev
 */
public class ElectricPassengerTrain extends PassengerTrain {
    ElectricalPowerType electricalPowerType;

    public ElectricPassengerTrain(Integer trainNumber, Integer maxSpeed, String locomotiveSeries, EnergySourceType energySourceType, List<PassengerCarriage> passengerCarriages, ElectricalPowerType electricalPowerType) {
        super(trainNumber, maxSpeed, locomotiveSeries, energySourceType, passengerCarriages);
        this.electricalPowerType = electricalPowerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricPassengerTrain that = (ElectricPassengerTrain) o;
        return electricalPowerType == that.electricalPowerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electricalPowerType);
    }

    public ElectricalPowerType getElectricalPowerType() {
        return electricalPowerType;
    }

    public void setElectricalPowerType(ElectricalPowerType electricalPowerType) {
        this.electricalPowerType = electricalPowerType;
    }
}

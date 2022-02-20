package com.epam.jwd.task1.entity.carriage;

import com.epam.jwd.task1.entity.train.ElectricPassengerTrain;
import com.epam.jwd.task1.entity.train.ElectricalPowerType;
import com.epam.jwd.task1.entity.train.EnergySourceType;
import com.epam.jwd.task1.entity.train.FuelType;
import com.epam.jwd.task1.entity.train.InternalCombustionPassengerTrain;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Eugeny Zaitsev
 */
public class PassengerTrainCompiler {
    private List<PassengerCarriage> passengerCarriageList1;
    private List<PassengerCarriage> passengerCarriageList2;
    private ElectricPassengerTrain electricPassengerTrain;
    private InternalCombustionPassengerTrain internalСombustionPassengerTrain;

    public PassengerTrainCompiler() {
        passengerCarriageList1 = Arrays.asList(
                new PassengerCarriage(41, "2A", 30),
                new PassengerCarriage(36, "2A", 32),
                new PassengerCarriage(150, "3Э", 61),
                new PassengerCarriage(12, "1Б", 22),
                new PassengerCarriage(32, "2К", 51),
                new PassengerCarriage(18, "2Ж", 40),
                new PassengerCarriage(2, "1Л", 8),
                new PassengerCarriage(4, "1Д", 6),
                new PassengerCarriage(15, "2A", 32),
                new PassengerCarriage(3, "1Ф", 8));
        passengerCarriageList2 = Arrays.asList(
                new PassengerCarriage(32, "1C", 60),
                new PassengerCarriage(55, "2C", 55),
                new PassengerCarriage(85, "2Ж", 32),
                new PassengerCarriage(65, "2В", 57),
                new PassengerCarriage(42, "2М", 51),
                new PassengerCarriage(78, "3Ж", 42),
                new PassengerCarriage(42, "3С", 11),
                new PassengerCarriage(93, "2С", 3),
                new PassengerCarriage(31, "2В", 89),
                new PassengerCarriage(45, "1С", 87));
        electricPassengerTrain = new ElectricPassengerTrain(615,
                120,
                "VL80",
                EnergySourceType.ELECTRIC, passengerCarriageList2,
                ElectricalPowerType.ALTERNATING_CURRENT);
        internalСombustionPassengerTrain = new InternalCombustionPassengerTrain(120,
                95,
                "TEP70BS",
                EnergySourceType.INTERNAL_COMBUSTION,
                passengerCarriageList1,
                FuelType.DIESEL);
    }

    @Override
    public String toString() {
        return "PassengerTrainCompiler{" +
                "passengerCarriageList1=" + passengerCarriageList1 +
                ", passengerCarriageList2=" + passengerCarriageList2 +
                ", electricPassengerTrain=" + electricPassengerTrain +
                ", internalСombustionPassengerTrain=" + internalСombustionPassengerTrain +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerTrainCompiler that = (PassengerTrainCompiler) o;
        return Objects.equals(passengerCarriageList1, that.passengerCarriageList1) && Objects.equals(passengerCarriageList2, that.passengerCarriageList2) && Objects.equals(electricPassengerTrain, that.electricPassengerTrain) && Objects.equals(internalСombustionPassengerTrain, that.internalСombustionPassengerTrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCarriageList1, passengerCarriageList2, electricPassengerTrain, internalСombustionPassengerTrain);
    }

    public ElectricPassengerTrain getElectricPassengerTrain() {
        return electricPassengerTrain;
    }

    public void setElectricPassengerTrain(ElectricPassengerTrain electricPassengerTrain) {
        this.electricPassengerTrain = electricPassengerTrain;
    }

    public InternalCombustionPassengerTrain getInternalСombustionPassengerTrain() {
        return internalСombustionPassengerTrain;
    }

    public void setInternalСombustionPassengerTrain(InternalCombustionPassengerTrain internalСombustionPassengerTrain) {
        this.internalСombustionPassengerTrain = internalСombustionPassengerTrain;
    }

    public List<PassengerCarriage> getPassengerCarriageList1() {
        return passengerCarriageList1;
    }

    public void setPassengerCarriageList1(List<PassengerCarriage> passengerCarriageList1) {
        this.passengerCarriageList1 = passengerCarriageList1;
    }

    public List<PassengerCarriage> getPassengerCarriageList2() {
        return passengerCarriageList2;
    }

    public void setPassengerCarriageList2(List<PassengerCarriage> passengerCarriageList2) {
        this.passengerCarriageList2 = passengerCarriageList2;
    }
}

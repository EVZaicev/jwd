package com.epam.jwd.task1.entity.train;

import java.util.Objects;

/**
 * @author Eugeny Zaitsev
 */
public abstract class Train {
    Integer trainNumber;
    Integer maxSpeed;
    String locomotiveSeries;
    EnergySourceType energySourceType;

    public Train(Integer trainNumber,
                 Integer maxSpeed,
                 String locomotiveSeries,
                 EnergySourceType energySourceType) {
        this.trainNumber = trainNumber;
        this.maxSpeed = maxSpeed;
        this.locomotiveSeries = locomotiveSeries;
        this.energySourceType = energySourceType;
    }

    @Override
    public String toString() {
        return "Train{"
                + "trainNumber=" + trainNumber
                + ", maxSpeed=" + maxSpeed
                + ", locomotiveSeries='" + locomotiveSeries + '\''
                + ", energySourceType=" + energySourceType
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Train train = (Train) o;
        return Objects.equals(trainNumber, train.trainNumber)
                && Objects.equals(maxSpeed, train.maxSpeed)
                && Objects.equals(locomotiveSeries, train.locomotiveSeries)
                && energySourceType == train.energySourceType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainNumber,
                maxSpeed,
                locomotiveSeries,
                energySourceType);
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getLocomotiveSeries() {
        return locomotiveSeries;
    }

    public void setLocomotiveSeries(String locomotiveSeries) {
        this.locomotiveSeries = locomotiveSeries;
    }

    public EnergySourceType getEnergySourceType() {
        return energySourceType;
    }

    public void setEnergySourceType(EnergySourceType energySourceType) {
        this.energySourceType = energySourceType;
    }
}

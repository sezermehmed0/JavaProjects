package com.company;

public class HeatManager extends Engine{
    int hours;
    double MaxTemperatureOfTheMachine = 109.12;

    public void setMaxWorkingHours(int hours) {
        this.hours = hours;
    }
    public int getMaxWorkingHours() {
        return  hours;
    }
    public double getMaxTemperatureOfTheMachine() {
        return MaxTemperatureOfTheMachine;
    }

    public void setMaxTemperatureOfTheMachine(double MaxTemperatureOfTheMachine) {
        this.MaxTemperatureOfTheMachine = MaxTemperatureOfTheMachine;
    }
}


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Machine ProductionMachine = new Machine();
        Machine WrapperMachine = new Machine();
        HeatManager FirstShiftWorker = new HeatManager();
        HeatManager SecondShiftWorker = new HeatManager();
        Machine[] machines = {ProductionMachine, WrapperMachine,};

        for (int i = 0; i < machines.length; i++) {
            System.out.println((i + 1) + "- Production Machine - ");
            System.out.println("Machine Power: " + machines[i].getEnginePower());
        }

        HeatManager[] heatManagers = {FirstShiftWorker, SecondShiftWorker};

        for (int i = 0; i < heatManagers.length; i++) {
            System.out.println((i + 1) + "- Temperature of the Wrapper machine - ");
            System.out.println("Maximum temperator of the machine : " + heatManagers[i].getMaxTemperatureOfTheMachine());
        }
    }
}




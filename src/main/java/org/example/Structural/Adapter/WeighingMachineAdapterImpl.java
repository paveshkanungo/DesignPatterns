package org.example.Structural.Adapter;

// Concrete Adapter converts pounds → kg
public class WeighingMachineAdapterImpl implements WeighingMachineAdapter {

    // Adaptee Reference
    ImperialWeighingMachine imperialWeighingMachine;

    public WeighingMachineAdapterImpl(ImperialWeighingMachine weightMachineInPounds){
        this.imperialWeighingMachine = weightMachineInPounds;
    }

    @Override
    public double getWeightInKg() {
        // Conversion formula: 1 pound = 0.453592 kg
        return imperialWeighingMachine.getWeightInPounds() * 0.45;
    }
}

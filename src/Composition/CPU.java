package Composition;

public class CPU {
    private String cpuModel;
    private int cpuFrequency;

    public CPU(String cpuModel, int cpuFrequency)
    {
        this.cpuModel = cpuModel;
        this.cpuFrequency = cpuFrequency;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public int getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(int cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }
}

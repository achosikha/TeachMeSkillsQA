package Composition;

public class HardDrive {
    private String hardDriveModel;
    private int hardDriveSize;

    public HardDrive(String hardDriveModel, int hardDriveSize)
    {
        this.hardDriveModel = hardDriveModel;
        this.hardDriveSize = hardDriveSize;
    }

    public String getHardDriveModel() {
        return hardDriveModel;
    }

    public void setHardDriveModel(String hardDriveModel) {
        this.hardDriveModel = hardDriveModel;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }
}

public class AirCondition {
    static private double Width;
    static private double Height;
    static private double Depth;
    static private String ModelName;
    static private String DeviceName;

    public static double getWidth() {
        return Width;
    }

    public static void setWidth(double width) {
        Width = width;
    }

    public static double getHeight() {
        return Height;
    }

    public static void setHeight(double height) {
        Height = height;
    }

    public static double getDepth() {
        return Depth;
    }

    public static void setDepth(double depth) {
        Depth = depth;
    }

    public static String getModelName() {
        return ModelName;
    }

    public static void setModelName(String modelName) {
        ModelName = modelName;
    }

    public static String getDeviceName() {
        return DeviceName;
    }

    public static void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public static double getSpendEnergy() {
        return SpendEnergy;
    }

    public static void setSpendEnergy(double spendEnergy) {
        SpendEnergy = spendEnergy;
    }

    static private final String DeviceType="AirCondition";
    static private double SpendEnergy;
}

public abstract class Vehicle implements Transport {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}

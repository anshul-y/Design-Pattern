package pattern.creational.builder;

public class Vehicle {

    private final String engine; //required
    private final int wheel; //required
    private final int airbags; //optional

    public String getEngine() {
        return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public int getAirbags() {
        return this.airbags;
    }

    private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    static class VehicleBuilder {   //nested static class
        private final String engine;
        private final int wheel;
        private int airbags;

        public VehicleBuilder(String engine, int wheel) {   //constructor for required params
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags) { //setters for optional params
            this.airbags = airbags;
            return this;
        }

        public Vehicle build() {    //build outer class instance with populated params
            return new Vehicle(this);
        }
    }
}

package OCP;

public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}

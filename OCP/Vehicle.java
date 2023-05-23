
// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
// Подсказка: создайте два дополнительных класса 
// Car и Bus(наследников Vehicle), напишите метод 
// calculateAllowedSpeed(). Использование этого метода 
// позволит сделать класс SpeedCalculation соответствующим OCP
package OCP;

public abstract class Vehicle {
    int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }
    public abstract double calculateAllowedSpeed();
}

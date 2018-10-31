//komentarz
public class Bicycle {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
    //zmiana
        
    // the Bicycle class has
    // one constructor
    // always look on the bride side of life
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    //druga_zmiana
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    //trzecia_zmiana   
    public void speedUp(int increment) {
        speed += increment;
    }
        
}
//wind of change
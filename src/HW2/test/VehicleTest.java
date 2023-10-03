package HW2;

import HW2.main.Car;
import HW2.main.Motorcycle;
import HW2.main.Vehicle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private final Car car = new Car("Mitsubishi", "Delica", 2023);
    private final Motorcycle bike = new Motorcycle("Harley-Davidson", "Road King", 1995);

    @Test
    public void carIsInstanceOfVehicle() {
        assertInstanceOf(car, Vehicle.class);
    }

    @Test
    public void carHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void bikeHasTwoWheels() {
        assertEquals(bike.getNumWheels(), 2);
    }

    @Test
    public void checkCarSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void checkBikeSpeed() {
        bike.testDrive();
        assertEquals(bike.getSpeed(), 75);
    }

    @Test
    public void checkCarPark() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void checkBikePark() {
        bike.testDrive();
        bike.park();
        assertEquals(bike.getSpeed(), 0);
    }
}
package test;

import main.java.Car;
import main.java.CarException;
import main.java.CarFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_create_car_success() throws CarException { Car car = carFactory.getCar("Red");assertNotNull(car);}

    @Test
    public void test_get_car_color_success() throws CarException {
        assertEquals("Red", carFactory.getCar("Red").getColor());
        assertEquals("White", carFactory.getCar("White").getColor());
        assertEquals("Blue", carFactory.getCar("Blue").getColor());
    }
    
    @Test
    public void test_get_audi_car_brand_success() throws CarException { assertEquals("Audi", carFactory.getCar("Audi").getBrand()); }

    @Test
    public void test_get_engine_success() throws CarException { assertEquals("Engine1", carFactory.getCar("Blue").getEngine()); }

}
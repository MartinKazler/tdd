package test;

import main.java.Car;
import main.java.CarException;
import main.java.CarFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_create_car_success() throws CarException {
        Car car = carFactory.getCar("Red");
        assertNotNull(car);
    }
    @Test
    public void test_get_car_color_success() throws CarException {
        assertEquals("green", carFactory.getCar("green").getColor());
    }
    @Test
    public void test_get_car_color_fail() throws CarException {
        assertEquals("purple", carFactory.getCar("pink").getColor());
    }
    @Test
    public void test_get_engine_success() throws CarException {
        assertEquals("V4", carFactory.getCar("white").getEngine());
    }
    @Test
    public void test_get_engine_fail() throws CarException {
        assertEquals("V6", carFactory.getCar("pink").getEngine());
    }
    @Test
    public void test_get_car_brand_success() throws CarException {
        assertEquals("Audi", carFactory.getCar("red").getBrand());
    }
    @Test
    public void test_get_car_brand_fail() throws CarException {
        assertEquals("Porsche", carFactory.getCar("red").getBrand());
    }
    @Test
    public void test_get_car_reg_fail() throws CarException {
        assertEquals("ABC123", carFactory.getCar("white").getRegNumber());
    }
}
package test;

import main.java.CarFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_get_Audi_car_brand_success() {
        assertEquals("Audi", carFactory.getCar("Audi").getBrand());
    }

    @Test
    public void test_get_Audi_car_color_success() { assertEquals("Black", carFactory.getCar("Audi").getColor()); }

    @Test
    public void test_get_BMW_car_brand_success() {
        assertEquals("BMW", carFactory.getCar("BMW").getBrand());
    }

    @Test
    public void test_get_BMW_car_color_success() { assertEquals("Green", carFactory.getCar("BMW").getColor()); }
}
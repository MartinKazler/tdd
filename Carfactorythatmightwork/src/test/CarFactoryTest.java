package test;

import main.java.CarException;
import main.java.CarFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_get_audi_car_brand_success() throws CarException { assertEquals("Audi", carFactory.getCar("Audi").getBrand()); }

    @Test
    public void test_get_audi_car_color_success() throws CarException { assertEquals("Black", carFactory.getCar("Audi").getColor()); }

    @Test
    public void test_get_bmw_car_brand_success() throws CarException { assertEquals("bmw", carFactory.getCar("bmw").getBrand());}

    @Test
    public void test_get_bmw_car_color_success() throws CarException { assertEquals("Green", carFactory.getCar("Bmw").getColor()); }

    @Test
    public void test_wrong_car_brand_fail() {
        CarException carException = assertThrows(CarException.class, () -> carFactory.getCar("abc")); assertEquals("Not a valid brand", carException.getMessage());
    }

}
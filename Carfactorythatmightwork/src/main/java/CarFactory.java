package main.java;

public class CarFactory {
    public Car getCar(String brand) {
        if(brand == null) {
            return null;
        }
        if(brand == "Audi") {
            Audi audi = new Audi("Black");
            System.out.println(audi.getRegistrationNumber());
            return audi;
        } else if(brand == "BMW") {
            Bmw bmw = new Bmw("Green");
            System.out.println(bmw.getRegistrationNumber());
            return bmw;
        }

        return null;
    }
}
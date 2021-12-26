package main.java;

public class CarFactory {

    public Car getCar(String brand) throws CarException {
        switch(brand) {
            case "Audi": {
                Audi audi = new Audi("Black");
                System.out.println(audi.getRegistrationNumber());
                return audi;
            }
            case "Bmw": {
                Bmw bmw = new Bmw("Green");
                System.out.println(bmw.getRegistrationNumber());
                return bmw;
            }
            default: {
                throw new CarException("Not a valid brand");
            }
}
    }}
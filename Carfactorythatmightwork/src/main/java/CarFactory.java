package main.java;

public class CarFactory {

    private String[] brands = {"Audi", "BMW"};
    private String[] engines = {"V4", "V5"};

    private String Regplates() {
        String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        StringBuilder lettergenerator = new StringBuilder(3);
        StringBuilder numbergenerator = new StringBuilder(3);

        for (int i = 0; i < 3; i++) {
            int index = (int)(Letters.length() * Math.random());
            lettergenerator.append(Letters.charAt(index));
        }
        for (int i = 0; i < 3; i++) {
            int index = (int)(numbers.length() * Math.random());
            numbergenerator.append(numbers.charAt(index));
        }
        StringBuilder regPlate = new StringBuilder(6);
        regPlate.append(lettergenerator);
        regPlate.append(numbergenerator);

        return regPlate.toString();
    }

    public Car getCar(String color) throws CarException {
        switch(brands[0]) {
            case "BMW": {
                Car bmw = new Car(color);
                bmw.setRegNumber(Regplates());
                System.out.println(bmw.getRegNumber());
                bmw.setBrand(brands[0]);
                bmw.setEngine(engines[0]);
                return bmw;
            }
            case "Audi": {
                Car audi = new Car(color);
                audi.setRegNumber(Regplates());
                System.out.println(audi.getRegNumber());
                audi.setBrand(brands[0]);
                audi.setEngine(engines[0]);
                return audi;
            }
            default: {
                throw new CarException("Not a valid brand");
            }
        }
    }
}
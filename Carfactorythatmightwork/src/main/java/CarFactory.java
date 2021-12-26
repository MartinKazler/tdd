package main.java;

public class CarFactory {

    private String[] brands = {"Audi", "Bmw"};
    private String[] engines = {"Engine1", "Engine2"};

    private String getAlphaNumericString() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder sb = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    public Car getCar(String color) throws CarException {
        switch(brands[0]) {
            case "Audi": {
                Car Audi = new Car(color);
                Audi.setRegNumber(getAlphaNumericString());
                System.out.println(Audi.getRegNumber());
                Audi.setBrand(brands[0]);
                Audi.setEngine(engines[0]);
                return Audi;
            }
            case "Bmw": {
                Car Bmw = new Car(color);
                Bmw.setRegNumber(getAlphaNumericString());
                System.out.println(Bmw.getRegNumber());
                Bmw.setBrand(brands[0]);
                Bmw.setEngine(engines[0]);
                return Bmw;
            }
            default: {
                throw new CarException("Not a valid brand");
            }
}
    }}
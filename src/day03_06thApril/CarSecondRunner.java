package day03_06thApril;

public class CarSecondRunner {
    public static void main(String[] args) {
        CarSecond car1 = new CarSecond();

        car1.setColour("Gumus");
        car1.setModel("WXHY67");
        car1.setEnginee(1.4);
        car1.setDoors(3);


        System.out.println("Arabanin reng: " + car1.getColour());
        System.out.println("Arabanin modeli: " + car1.getModel());
        System.out.println("Arabanin motoru: " + car1.getEnginee());
        System.out.println("Arabanin kapi sayisi= " + car1.getDoors());
        car1.start();  //methodu cagirdik ve calisti
        car1.stop();



       // Buraada set ile yeni deegrler atadik   >>set deger verdigimiz    get>> deger aldigimiz
        // get ile de sout icinde istedigimiz verileri getirdik


    }


}

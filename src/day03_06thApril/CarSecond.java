package day03_06thApril;

public class CarSecond {
    //Fileds ,Propertis
    private String colour;
    private String model;
    private double enginee;
    private int doors;

    //sag tus >> generate >> Getter and Setter >> istedigin variable'lari kontrol tusuyla sec
    //Boylece runner class'inda obje ismi nokta set yapip deger degistirebillirsin
    //sout icine obje ismi niokta get yazip sonuclari yazdirabilirsin

    public void setColour(String colour) {
        this.colour = colour; //java burda instance variable degerini kullanir
    }

    public String getColour() {
        return this.colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEnginee() {
        return enginee;
    }

    public void setEnginee(double enginee) {
        this.enginee = enginee;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;

        if (doors ==2|| doors==4){
            this.doors=doors;

        }
        else {
            System.out.println("Kapi sayisi sadece 2 veya 4 olabilir.");
        }


    }

    public void start() {
        System.out.println("Araba calisti...");
    }

    public void stop() {
        System.out.println("Araba durdu...");
    }
}

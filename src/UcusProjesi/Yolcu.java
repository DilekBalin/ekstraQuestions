package UcusProjesi;

public class Yolcu {

    //Sartlarimizi data tiplerine gore yazdik
    String city;
    String flType;
    int age;

    public Yolcu(String city) {
        this.city = city;
    }

    //Sag tus->> generate--> constructor yaptik ve sartlarimiz sectik
    public Yolcu(String city, String flType, int age) {
        this.city = city;
        this.flType = flType;
        this.age = age;
    }
}

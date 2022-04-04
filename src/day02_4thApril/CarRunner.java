package day02_4thApril;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();//obje olusturduk
        car1.colour="Gumus";
        car1.model="Megane";
        car1.doors=4;
        car1.enginee=1.6;
        System.out.println("Arabanin rengi ="+car1.colour+"\n"+"Arabanin teker sayisi= "+car1.doors);

    //tum variableler publicoldugu icin baska class'tan erisebildik
        //eger private olsaydi baska class'lardan cagiramazdik sadece kendi class'indan cagrilabilir.

    }
}

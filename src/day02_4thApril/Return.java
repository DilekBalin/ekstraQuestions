package day02_4thApril;

public class Return {

    public static int ucIleCarp(int a){
        return a*3;
    }

public static int ikiIleTopla(int a){
        return a+2;
}
   public static int dortCikar(int a){
        return a-4;
   }

    public static void main(String[] args) {
        System.out.println("Sonuc= "+dortCikar(ikiIleTopla(ucIleCarp(4))));//isleme en icten baslar
        //a yi alir en bastaki methodta isleme koyacak
        // 4*3=12     12+2=14   14-4=10

    }
}

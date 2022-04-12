package grupSorulari;

import java.util.ArrayList;
import java.util.List;

public class Soru29 {
    public static void main(String[] args) {
        /* TASK :
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");
        list1=aharflisil(list1);
        System.out.println(list1);
    }
    private static List<String> aharflisil(List<String> list1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).toLowerCase().contains("a")) {
                list.add(list1.get(i));
            }
        }
        return list;
    }
}



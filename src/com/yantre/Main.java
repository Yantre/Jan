package com.yantre;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Zadacha> arrayList1 = new ArrayList();

        Zadacha z0 = new Zadacha("Zaplatit za kvartiru", 3, 19, 15);

        z0.setPodZadachi(new ArrayList<>());

        Zadacha z10 = new Zadacha("Zaplatit za Vodu", 3, 19, 15);
        Zadacha z11 = new Zadacha("Zaplatit za Gaz", 3, 19, 15);
        Zadacha z12 = new Zadacha("Zaplatit za Telephone", 3, 19, 15);

        z0.getPodZadachi().add(z10);
        z0.getPodZadachi().add(z11);
        z0.getPodZadachi().add(z12);

        arrayList1.add(z0);

        arrayList1.add(new Zadacha ("Zaplatit za elektr", 3,19));
        arrayList1.add(new Zadacha ("Zaplatit za pitanie", 3,19, 20));
        arrayList1.add(new Zadacha ("Zaplatit za kruzok", 3,19, 22));


        arrayList1.sort(Comparator.comparing(Zadacha::getName));

        for (int i = 0; i < arrayList1.size(); i++)
        {
            Zadacha osnovnayaZadacha = arrayList1.get(i);

            List<Zadacha> podZadachi = osnovnayaZadacha.getPodZadachi();

            if (podZadachi !=null)
            {
                for (int i1 = 0; i1 < podZadachi.size(); i1++)
                {
                    Zadacha podZadacha = podZadachi.get(i1);
                    System.out.println(podZadacha.toString());
                }
            }
            System.out.println(arrayList1.get(i).toString());
        }



/*        for (Zadacha zadacha : arrayList1)
        {
            System.out.println(zadacha.toString());
        }*/

/*        ArrayList<Zadacha> arrayList2 = new ArrayList();

        for (int i = 0; i < arrayList1.size(); i++)
        {

            Zadacha z1 = arrayList1.get(i);

            String n1 = z1.getName();

            if ( n1 =="Zaplatit za kvartiru" ) {
                arrayList2.add(z1 );
                System.out.println("ОНО!");
            }
             else {
                System.out.println("НЕ ОНО!");
            }

        }*/


        //arrayList2.add(arrayList1.get(0));

        ArrayList<Zadacha> arrayList2 = new ArrayList();

        // TODO Создать второй список Задач. Пустой.

        /*
        1 поитерироваться по всем задачам из списка1 - for
        2 найти те у которых подзадачи не равны нулю - if
        3 добавить во второй список подзадачи текущей задачи - add
         */
        // взять все под задачи и перенести во второй список

        // вывести на экран все элементы списка 2


        for (int j = 0; j < arrayList2.size(); j++)
        {
            System.out.println(arrayList2.get(j).toString());
        }



    }
}

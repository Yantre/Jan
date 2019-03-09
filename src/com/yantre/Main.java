package com.yantre;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Zadacha> arrayList1 = new ArrayList();

        arrayList1.add(new Zadacha("Zaplatit za kvartiru", 3, 19, 15));
        arrayList1.add(new Zadacha ("Zaplatit za elektr", 3,19));
        arrayList1.add(new Zadacha ("Zaplatit za pitanie", 3,19, 20));
        arrayList1.add(new Zadacha ("Zaplatit za kruzok", 3,19, 22));


        arrayList1.sort(Comparator.comparing(Zadacha::getName));

        for (int i = 0; i < arrayList1.size(); i++)
        {
            System.out.println(arrayList1.get(i).toString());

        }

        // TODO Создать второй список Задач. Пустой.

		// взять 1-й элемент из списка1 и добавить в список 2


		// вывести на экран все элементы списка 2

/*        for (Zadacha zadacha : arrayList1)
        {
            System.out.println(zadacha.toString());
        }*/

    }
}

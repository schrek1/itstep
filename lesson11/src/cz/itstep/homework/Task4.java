package cz.itstep.homework;

public class Task4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        Task 4
        Create an abstract base class Shape and an abstract method to calculate the area.
        Create derived classes: Square, Circle, Right Triangle, Trapezoid and their implementation of the area calculation method.
        Test them by specifying the link array to the abstract class that assigns addresses of various child class objects.*/
        /*plus increment (zvýšit hrany o jeden)
        doplnit o metody z Object (hashCode, toString, equals, clone)
        vytvorit hlubokou kopii pole(napoveda kopie pole + jednotlivych prvku, prip.zda nelze pouzit knihovni funkce
        vytvořit instance(pole Shape => Shape[])
        overit zda jsou kopie validní tj.na poli kopii zavolat metodu increment
        obe pole strojove porovnat (a[0].equals(c[0]) + a[0].hashCode() = c[0] atd..) a vypsat vysledek jednotlivých porovnání
        obe pole vypsat (napoveda to String, prp. lepsi implementace pomoci vhodne knihovní funkce
         */

        Square square1 = new Square(4.25);
        Square square2 = new Square(4.25);
        Square square3 = new Square(7.65);

        System.out.println(square1.hashCode());
        System.out.println(square2.hashCode());
        System.out.println(square3.hashCode());

        Square square = square3.clone();
        Square square4 = square3.clone();

        System.out.println("s1 - " + square.hashCode());
        System.out.println("s2 - " + square4.hashCode());


        System.out.println(square.hashCode());
        System.out.println(square.equals(square3));
        System.out.println(square4.equals(square));
        System.out.println(square3);
        System.out.println(square);

    }
}

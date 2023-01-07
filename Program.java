/*Задача:
* Проделать код ревью своих работ. Продумать, какие компоненты можно и нужно переписать.
*/

package Homeworks.Seminar1;

import java.util.Scanner;
import java.util.function.Supplier;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Реализация интерфейса "Supplier"  для разных классов
        Supplier<Chield> chield = () -> {
            System.out.println("Введите имя: ");
            String name = scan.nextLine();
            System.out.println("Введите возраст: ");
            Integer age = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите пол (male, female): ");
            String gender = scan.nextLine();
            return new Chield(name, age, gender, null, null);

        };
        Supplier<Father> father = () -> {
            System.out.println("Введите имя: ");
            String name = scan.nextLine();
            System.out.println("Введите возраст: ");
            Integer age = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите пол (male, female): ");
            String gender = scan.nextLine();
            return new Father(name, age, gender, null);

        };
        Supplier<Mother> mother = () -> {
            
            System.out.println("Введите имя: ");
            String name = scan.nextLine();
            System.out.println("Введите возраст: ");
            Integer age = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите пол (male, female): ");
            String gender = scan.nextLine();
            return new Mother(name, age, gender, null);

        };
        
        Chield c1 = new Chield("Deff", 2, "male", null, null);
        Father f1 = new Father("Father", 37, "male", null);
        Mother m1 = new Mother("Mom", 25, "female", c1);
        Chield c2 = new Chield("Yulia", 5, "female", f1, m1);
        Father f3 = new Father("Jason", 32, "male", c2);
        Father f4 = new Father("John", 55, "male", null);

        Chield c10 = chield.get(); // Тут начинается добавление экземпляра класса "Chield" через интерфейс "Supplier"
        System.out.println(c10.getInfo());
        c10.setFather(f4); // Добавили папу
        c10.setMother(m1); // Добавили маму
        System.err.println(c10.getParents());

        Father f11 = father.get(); // То же самое про папу через Supplier
        System.out.println(f11.getInfo());

        Mother m12 = mother.get(); // И мама не заставила себя долго ждать)
        System.out.println(m12.getInfo());

        System.out.println(c1.getInfo());
        System.out.println(f1.getInfo());
        System.out.println(m1.getInfo());
        System.out.println(c2.getInfo());
        System.out.println(c2.getParents());
        System.out.println(f3.getChield());
        System.out.println(f1.getChield());
        c2.callTheCat();
        c1.pushTheCat();
        f3.callTheCat();
        f3.callTheDog();
        c1.pushTheDog();
        c2.callTheDog();
        System.out.println(f4.getInfo());
        scan.close();
    }
}

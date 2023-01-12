/*Задача:
* Реализовать как минимум 2 обобщения
*/

package Homeworks.Seminar1;

import java.util.ArrayList;
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
        // Добавление вручную
        // Не успел у родителей заменить поле ребенка на список детей...
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

        Family<Father, Mother, Chield> family1 = new Family<>(f1, m1, c1); // Создаем новый объект "Семья"
        family1.addBaby(c2); // Добавляем туда еще одного ребенка (Добавил ArrayList детишек)
        family1.getInfo();// Смотрим состав семьи
        f1.addNotes(3.14); // Добавление заметок 
        c1.addNotes("Шалун)"); // Добавление заметок 
        m1.addNotes(5L); // Добавление заметок 
        f3.addNotes("Никому не нужен...");
        System.out.println(f1.getInfo());
        System.out.println(c1.getInfo());
        System.out.println(m1.getInfo());
        c1.addNotes(c2); // Попытка добавить объект)))
        
        // System.out.println(m1.getInfo());
        // System.out.println(c2.getInfo());
        // System.out.println(c2.getParents());
        // System.out.println(f3.getChield());
        // System.out.println(f1.getChield());
        // c2.callTheCat();
        // c1.pushTheCat();
        // f3.callTheCat();
        // f3.callTheDog();
        // c1.pushTheDog();
        // c2.callTheDog();
        // System.out.println(f4.getInfo());
        scan.close();
    }


}
// Класс "Семья" который принимает только наследников абстрактного класса "Human"
class Family <T1, T2, T3 extends Human>{
    private T1 father;
    private T2 mother;
    private ArrayList<T3> chield; // Добавил список детишек

    public Family(T1 f, T2 m, T3 c){ // Конструктор принимает на вход 3 аргумента разного типа
        ArrayList<T3> chieldList = new ArrayList<>();
        this.father = f;
        this.mother = m;
        chieldList.add(c);
        this.chield = chieldList;
    }

    public void addBaby(T3 e){ // Метод добавления ребенка в список
        chield.add(e);
        
    }

    public void getInfo(){ // Метод получения информации по составу семьи
        System.out.println(father);
        System.out.println(mother);
        System.out.println("Chields:");
        for(T3 x: chield){
            System.out.println(x);
        }
    }
    

}

/*
Необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
*Обеспечить переход от использования явных классов в сторону использования абстрактных типов. 
Т е работаем не с конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
не с конкретным экземпляром котика, а с интерфейсом “котик”, 
лучше уйти от взаимодействия с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, 
собачкой или хомяком т е с интерфейсом “животное”
 */

package Homeworks.Seminar1;

public class Program {
    public static void main(String[] args) {
        
        Chield c1 = new Chield(0, "Deff", 2, "male", null, null);
        System.out.println(c1.getInfo());
        Father f1 = new Father(1, "Father", 37, "male", null);
        Mother m1 = new Mother(3, "Mom", 25, "female", c1);
        Chield c2 = new Chield(4, "Yulia", 5, "female", f1, m1);
        Father f3 = new Father(5, "Jason", 32, "male", c2);
        
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
    }
}

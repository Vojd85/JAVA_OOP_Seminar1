/*
Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом. 
Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей и 
отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. 
компонент для проведения исследований дополнительные компоненты, например отвечающие за вывод данных в консоль, 
загрузку и сохранения в файл, получение\построение отдельных моделей человека 
Под “проведением исследования” можно понимать получение всех детей выбранного человека. 
У задач нет единственного правильного решения*
 */

package Homeworks.Seminar1;

public class Program {
    public static void main(String[] args) {
        Human people1 = new Human(18, "male");
        Human people2 = new Human(37, "male");
        Human people3 = new Human(25, "female");
        System.out.println(people1.getInfo());
        System.out.println(people2.getInfo());
        System.out.println(people3.getInfo());
        
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
    }
}

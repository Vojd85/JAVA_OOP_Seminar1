package Homeworks.Seminar1;

public interface Cat extends Animal{
    default void pushTheCat(){
        System.out.println("Муууууууурррр)");
    }
}

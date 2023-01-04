package Homeworks.Seminar1;

public interface Dog extends Animal{
    default void pushTheDog(){
        System.out.println("Виляет хвостиком");
    }
}

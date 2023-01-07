package Homeworks.Seminar1;

public interface I__Dog extends I__Animal{ // Интерфейс Собака
    default void pushTheDog(){
        System.out.println("Виляет хвостиком");
    }
}

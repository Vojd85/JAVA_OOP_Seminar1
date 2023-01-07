package Homeworks.Seminar1;

// класс Отец

public class Father extends Human implements I__Cat, I__Dog{ 
    private Integer id; // уникальный номер человека
    private String name;
    private Chield chield;

    public Father(String name, Integer age, String gender, Chield c) { // конструктор класса
        super(age, gender); // параметры передаются в конструктор материнского абстрактного класса "Human"
        this.name = name;
        this.chield = c;
        this.id = super.getId(); // Уникальный ID присваивается в конструкторе класса "Human"
    }
    // Перегружаем метод, наследованный у класса "Human" на вывод информации
    @Override
    public String getInfo() {
        if (this.chield != null){
            return String.format( "ID: %d Name: %s %s Children: Y ", this.id, this.name, super.getInfo());
        } else {
            return String.format( "ID: %d Name: %s %s Children: N ", this.id, this.name, super.getInfo());
        }
    }

    public void addChield(Chield c){ // Добавление ребенка
        this.chield = c;
    }

    // Добавляем метод получения ребенка
    public String getChield(){ 
        if (this.chield != null){
            return this.chield.getInfo();
        } else {
            return "No chields";
        }
    }

    // Перегрузка метода абстрактного интерфейса "I__Animal"
    @Override
    public void callTheCat() { // Зовем кота
        System.out.println(this.name +": Где эта мохнатая скотинка?");
    }

    // Перегрузка метода абстрактного интерфейса "I__Animal"
    @Override
    public void callTheDog() { // Зовем собаку
        Chield c = this.chield;
        System.out.println(c.getName() + ", позови собаку!");
    }
}

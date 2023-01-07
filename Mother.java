package Homeworks.Seminar1;

// Класс Мать  ----  комментарии в классе "Father"

public class Mother extends Human implements I__Cat, I__Dog {
    private Integer id;
    private String name;
    private Chield chield;

    public Mother(String name, Integer age, String gender, Chield c) {
        super(age, gender);
        this.id = super.getId();
        this.name = name;
        this.chield = c;
    }

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

    @Override
    public void callTheCat() {
        System.out.println(this.name +": Киса, иди покушай!");
    }

    @Override
    public void callTheDog() {
        System.out.println(this.name + "зовет пса поесть");
    }



}

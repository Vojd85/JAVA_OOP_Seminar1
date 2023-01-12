package Homeworks.Seminar1;

// Класс Мать  ----  комментарии в классе "Father"

public class Mother extends Human implements I__Cat, I__Dog {
    private Integer id;
    private String name;
    private Chield chield;
    public String notes;

    public Mother(String name, Integer age, String gender, Chield c) {
        super(age, gender);
        this.id = super.getId();
        this.name = name;
        this.chield = c;
    }

    @Override
    public String getInfo() {
        if (this.chield != null){
            return String.format( "ID: %d Name: %s %s Children: Y Notes: %s", this.id, this.name, super.getInfo(), notes);
        } else {
            return String.format( "ID: %d Name: %s %s Children: N Notes: %s", this.id, this.name, super.getInfo(), notes);
        }
    }
    @Override
    public String toString() {
        return String.format( "Mother: Name: %s %s ", this.name, super.getInfo());
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

    public <T> void addNotes(T t){
        this.notes = t.toString();
    }

}

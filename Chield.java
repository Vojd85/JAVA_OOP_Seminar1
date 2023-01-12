package Homeworks.Seminar1;

// Класс ребенок ---- комментарии в классе "Father"

public class Chield extends Human implements I__Cat, I__Dog { 
    
    private Integer id;
    private String name;
    private Father f;
    private Mother m;
    public String notes;
    


    public Chield(String name, Integer age, String gender, Father father, Mother mother) {
        super(age, gender);
        this.id = super.getId();
        this.name = name;
        this.f = father;
        this.m = mother;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String getInfo() {
        return String.format( "ID: %d Name: %s %s Notes: %s", this.id, this.name, super.getInfo(), notes);
    }
    @Override
    public String toString() {
        return String.format( "Chield: Name: %s %s ", this.name, super.getInfo());
    }

    public void setFather(Father father) { // Прописываем папу
        this.f = father;
    }

    public void setMother(Mother mother) { // Прописываем маму
        this.m = mother;
    }
    
    public String getParents(){ // Метод выводит родителей
        return String.format("Mother: %s\n Father: %s", this.m.getInfo(), this.f.getInfo());
    }

    @Override
    public void callTheCat() {
        System.out.println(this.name + " зовёт котика: Кис, кис, кис!");
    }

    @Override
    public void callTheDog() {
        System.out.println(this.name + " зовёт собачку");
    }

    public <T> void addNotes(T t){
        if(t instanceof Human){
            System.out.println("Не добавляйте детей!");
        } else this.notes = t.toString();
    }



}

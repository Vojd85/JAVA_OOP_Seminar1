package Homeworks.Seminar1;

public class Chield extends Human implements Cat, Dog {
    
    private Integer id;
    private String name;
    private Father f;
    private Mother m;
    


    public Chield(Integer id, String name, Integer age, String gender, Father father, Mother mother) {
        super(age, gender);
        this.id = id;
        this.name = name;
        this.f = father;
        this.m = mother;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String getInfo() {
        return String.format( "ID: %d Name: %s %s", this.id, this.name, super.getInfo());
    }
    
    public String getParents(){
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



}

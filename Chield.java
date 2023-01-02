package Homeworks.Seminar1;

public class Chield extends Human{
    
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
    @Override
    public String getInfo() {
        return String.format( "ID: %d Name: %s %s", this.id, this.name, super.getInfo());
    }

    public String getParents(){
        return String.format("Mother: %s\n Father: %s", this.m.getInfo(), this.f.getInfo());
    }
}

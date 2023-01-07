package Homeworks.Seminar1;

public abstract class Human {
    private Integer age;
    private String gender;
    private static Integer id;

    static {
        id = 0;
    }

    public Human(Integer age, String gender){
        this.age = age;
        this.gender = gender;
        id++;
    }

    public String getInfo(){
        return String.format("Age: %d Gender: %s", this.age, this.gender);
    }

    public Integer getId(){
        return id;
    }

}

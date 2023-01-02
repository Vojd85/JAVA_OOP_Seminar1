package Homeworks.Seminar1;

public class Human {
    private Integer age;
    private String gender;

    public Human(Integer age, String gender){
        this.age = age;
        this.gender = gender;
    }

    
    
    public String getInfo(){
        return String.format("Age: %d Gender: %s", this.age, this.gender);
    }

}

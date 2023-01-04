package Homeworks.Seminar1;

public class Father extends Human implements Cat, Dog{

    private Integer id;
    private String name;
    private Chield chield;

    public Father(Integer id, String name, Integer age, String gender, Chield c) {
        super(age, gender);
        this.id = id;
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

    public String getChield(){
        if (this.chield != null){
            return this.chield.getInfo();
        } else {
            return "No chields";
        }
    }

    @Override
    public void callTheCat() {
        System.out.println(this.name +": Где эта мохнатая скотинка?");
    }

    @Override
    public void callTheDog() {
        Chield c = this.chield;
        System.out.println(c.getName() + ", позови собаку!");
    }
}

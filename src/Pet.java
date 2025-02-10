//declare class
public class Pet {
    private String name;
    private String type;
    private int age;

    //Default
    public Pet() {
        this.name = "Pet Name";
        this.type = "Cat";
        this.age = 1;
    }//end bracket

    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }//end bracket

    //Setter
    public void setName(String name) {
        this.name = name;
    }//end bracket

    public void setType(String type) {
        this.type = type;
    }//end bracket

    public void setAge(int age) {
        this.age = age;
    }//end bracket

    // Getter
    public String getName() {
        return name;
    }//end bracket

    public String getType() {
        return type;
    }//end bracket

    public int getAge() {
        return age;
    }//end bracket

    // Speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof!";
        }//end bracket
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow!";
        }//end bracket
        else {
            return "Meow!";
        }//end bracket
    }//end bracket

    // toString method
    public String toString() {
        //return info
        return "Pet information:\n" +
                "Type: " + type + "\n" +
                "Name: " + name + "\n" +
                "Sound: " + speak() + "\n" +
                "Age: " + age;
    }//end bracket
}//end bracket
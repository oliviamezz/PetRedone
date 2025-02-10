//declare class
public class Runner {
    public static void main(String[] args) {
        //Use default contructor
        Pet defaultPet = new Pet();
        System.out.println(defaultPet);

        //Use custom constructor
        Pet myPet = new Pet("Buddy", "Dog", 3);
        System.out.println(myPet);

        // Test
        System.out.println("Pet speaks: " + myPet.speak());
    }//end bracket
}//end bracket
class animal{ 
    String name;
    int age;
    void makeSound()
    {
        System.out.println("Sounds of animals");
    }
}
class dog extends animal{
    String breed;
    void makeSound(){
        System.out.println("Dog barks");
    }
    void fetch(){
        System.out.println("He is fetching");
    }
}
class cat extends dog{
    String color;
    void makeSound(){
        System.out.println("Cat meows");
    }
    void climb(){
        System.out.println("She is climbing");
    }
}

public class Exe{
    public static void main(String[] args) {
        dog d1=new dog();
        d1.name="Leo";
        d1.age=2;
        d1.breed="labrador";
        d1.makeSound();
        d1.fetch();
        cat c1=new cat();
        c1.name="kitty";
        c1.age=3;
        c1.color="white";
        c1.makeSound();
        c1.climb();


    }
}
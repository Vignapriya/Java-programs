class animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Sounds of animals");
    }
}

class dog extends animal {
    String breed;

    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("He is fetching");
    }
}

class cat extends dog {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class exer {   // CLASS NAME MUST MATCH FILE NAME
    public static void main(String[] args) {

        dog d = new dog();
        d.makeSound();
        d.fetch();

        cat c = new cat();
        c.makeSound();
    }
}

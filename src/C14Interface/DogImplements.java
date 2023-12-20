package C14Interface;

public class DogImplements implements AnimalInterface1 {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class DogMultiImplements implements AnimalInterface1, AnimalInterface2 {
    public void makeSound() {
        System.out.println("Woof from multi");
    }

    @Override
    public String play(String a, String b) {
        return "Dog plays with " + a + " and " + b;
    }
}


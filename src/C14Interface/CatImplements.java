package C14Interface;

public class CatImplements implements AnimalInterface1 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class CatMultiImplements implements AnimalInterface1, AnimalInterface2 {
    public void makeSound() {
        System.out.println("Meow from multi");
    }

    @Override
    public String play(String a, String b) {
        return "Cat plays with " + a + " and " + b;
    }
}

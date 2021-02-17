package cz.itstep.animal;

public class Main {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();

        Animal[] zoo = new Animal[]{tiger, monkey};

        for (Animal animal : zoo) {
            animal.animalSound();
        }

    }
}

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void fazerBarulho() {
        System.out.println("*Animal noises*");
    }
}

class Cat extends Animal {
    public void fazerBarulho() {
        System.out.println("meow");
    }
}

class Dog extends Animal {
    public void fazerBarulho() {
        System.out.println("wof");
    }
}

public class Polimorphism {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<Animal>();
        animais.add(new Cat());
        animais.add(new Cat());
        animais.add(new Dog());

        for (Animal animal : animais)
            // polimorfismo dinâmico
            // em tempo de execução, a JVM decide qual
            // método chamar em função do tipo do objeto
            animal.fazerBarulho();
    }

}
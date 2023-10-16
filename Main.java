import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Animal {
    public String Nome;

    public Animal(String nome) {
        this.Nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("latido");
    }
}


class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miado!");
    }
}

public class Main {
    public static void main(String[] args) {


        Animal Cachorro = new Cachorro("Spike");
        System.out.println("o nome do cachorro é" + Cachorro);
        Cachorro.emitirSom();
        Animal Gato = new Gato("cat");
        System.out.println("o nome do gato é " + Gato);
        Gato.emitirSom();


        List<Animal> animais = new ArrayList<>();
        animais.add(Cachorro);
        animais.add(Gato);

        List<Animal> cachorrosFiltrados = animais.stream()
                .filter(a -> a instanceof Cachorro)
                .collect(Collectors.toList());

        System.out.println("Cachorros:");
        cachorrosFiltrados.forEach(a -> System.out.println(a.Nome));

    }
}


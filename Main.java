
class Animal {
    protected String Nome;

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

        Animal animal = new Animal("Animal genérico");
        System.out.println("Nome do animal: " + animal);

        Animal cachorro = new Cachorro("Spike");

        Animal gato = new Gato("cat");

        cachorro.emitirSom();
        gato.emitirSom();


    }
}


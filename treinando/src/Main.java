import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 abstract class Animal {
     protected String nome;


     public Animal(String nome) {
         this.nome = nome;
     }

     public abstract void emitirSom();

     public abstract String getEspecie();

 }




     class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("latido");
    }

         @Override
         public String getEspecie() {
             return "canina";
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

    @Override
    public String getEspecie() {
        return "felino";
    }
}

public class Main {
    public static void main(String[] args) {

        Animal Cachorro = new Cachorro("Spike");
        Cachorro.getEspecie();
        System.out.println("o nome do cachorro é" + Cachorro);
        Cachorro.emitirSom();
        Animal Gato = new Gato("cat");
        Gato.getEspecie();
        System.out.println("o nome do gato é " + Gato);
        Gato.emitirSom();


        List<Animal> animais = new ArrayList<>();
        animais.add(Cachorro);
        animais.add(Gato);

        List<Animal> cachorrosFiltrados = animais.stream()
                .filter(a -> a instanceof Cachorro)
                .collect(Collectors.toList());

        System.out.println("Cachorros:");
        cachorrosFiltrados.forEach(a -> System.out.println(a.nome));

    }
}


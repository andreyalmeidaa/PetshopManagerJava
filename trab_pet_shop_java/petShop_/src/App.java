import modelo.Animal;
import modelo.Cachorro;
import modelo.Gato;
import modelo.OutroAnimal;
import servico.Banho;
import servico.ConsultaVeterinaria;
import servico.Servico;
import servico.Tosa;


// https://www.baeldung.com/java-hashcode ---- hashcode
//https://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991
//https://www.devmedia.com.br/sobrescrevendo-o-metodo-equals-em-java/26484 ---
//https://www.w3schools.com/java/ref_string_equals.asp
//https://www.dio.me/articles/o-metodo-equals-em-java-comparando-conteudo-nao-referencias
//https://www.baeldung.com/java-equals-hashcode-contracts

// Ainda prefiro python!!

public class App {

    public static void main(String[] args) {

        // criar os bichos
        Cachorro cachorro1 = new Cachorro("Osvaldo", "Golden", 5, "Victoria", "Grande");
        Cachorro cachorro2 = new Cachorro("Bento", "Chiwawa", 5, "Andrey", "Pequeno");
        Gato gato1 = new Gato("Clotilde", "Siamês", 3, "Carla", "Azul");
        OutroAnimal piriquito = new OutroAnimal("Flavinho pneu", "Passaro", 1, "Daniel", "Piriquito que voa");

        //serivcos 
        Servico banho = new Banho("Banho Padrão", 50.0);
        Servico tosa = new Tosa("Tosa Completa", 70.0);
        Servico consulta = new ConsultaVeterinaria("Consulta Geral", 100.0);
        Servico banhoEspecial = new Banho("Banho VIP", 60.0);

        System.out.println("======= Preços dos Serviços =======");
        exibirPrecoServico(banho, cachorro1);
        exibirPrecoServico(banho, cachorro2);
        exibirPrecoServico(banho, gato1);
        exibirPrecoServico(tosa, cachorro1);
        exibirPrecoServico(tosa, cachorro2);
        exibirPrecoServico(tosa, gato1);
        exibirPrecoServico(consulta, cachorro1);
        exibirPrecoServico(consulta, piriquito);

        //demonstrar equals e hascode
        System.out.println("\n======= Demonstração de equals e hashCode =======");
        Cachorro cachorro3 = new Cachorro("Osvaldo", "Golden", 5, "Victoria", "Grande");

        compararObjetos("Cachorro 1", cachorro1, "Cachorro 3", cachorro3);
        compararObjetos("Cachorro 1", cachorro1, "Cachorro 2", cachorro2);

        Servico banhoPadrao2 = new Banho("Banho Padrão", 50.0);
        compararObjetos("Banho Padrão", banho, "Banho Padrão 2", banhoPadrao2);
        compararObjetos("Banho Padrão", banho, "Banho Especial", banhoEspecial);

        // --- polimorfismo e herança ---
        System.out.println("\n======= Demonstração de Polimorfismo e Herança =======");
        Animal meuAnimal = cachorro1;
        System.out.println("Meu animal é: " + meuAnimal.getNome() + " (" + meuAnimal.getClass().getSimpleName() + ")");

        meuAnimal = gato1;
        System.out.println("Agora meu animal é: " + meuAnimal.getNome() + " (" + meuAnimal.getClass().getSimpleName() + ")");

        Servico meuServico = banho;
        System.out.println("Meu serviço é: " + meuServico.getNome() + " e o preço para " + cachorro1.getNome() + " é R$" + meuServico.calcularPreco(cachorro1));
        meuServico = tosa;
        System.out.println("Agora meu serviço é: " + meuServico.getNome() + " e o preço para " + gato1.getNome() + " é R$" + meuServico.calcularPreco(gato1));
    }


    private static void exibirPrecoServico(Servico servico, Animal animal) {
        System.out.println(servico.getNome() + " para " + animal.getNome() + ": R$" + servico.calcularPreco(animal));
    }

    private static void compararObjetos(String nome1, Object obj1, String nome2, Object obj2) {
        System.out.println(nome1 + " e " + nome2 + " são iguais? " + obj1.equals(obj2));
        System.out.println("Hash code " + nome1 + ": " + obj1.hashCode());
        System.out.println("Hash code " + nome2 + ": " + obj2.hashCode());
        System.out.println();
    }
}

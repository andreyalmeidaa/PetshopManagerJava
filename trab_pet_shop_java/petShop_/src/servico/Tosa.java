
package servico; 
import modelo.Animal; 
import modelo.Cachorro; 
import modelo.Gato;     

public class Tosa extends Servico { 
    public Tosa(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) { 
        double precoFinal = this.precoBase;
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;


            // eemplo variação por raça para tosa 


            if (cachorro.getRacaTipo().equalsIgnoreCase("Poodle")) {
                precoFinal += 15.0;
            } else if (cachorro.getRacaTipo().equalsIgnoreCase("Golden Retriever")) {
                precoFinal += 25.0;
            }
        } else if (animal instanceof Gato) {
            precoFinal += 10.0; 
        }
        return precoFinal;
    }

    @Override
    public String toString() { 
        return "Tosa{" +
               "nome='" + nome + '\'' +
               ", precoBase=" + precoBase +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tosa tosa = (Tosa) o;
        return nome.equals(tosa.nome) &&
               Double.compare(precoBase, tosa.precoBase) == 0;
    }

    @Override
    public int hashCode() { 
        int result = nome.hashCode();
        result = 31 * result + Double.hashCode(precoBase);
        return result;
    }
}
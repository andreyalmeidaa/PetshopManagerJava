// src/servico/Banho.java
package servico; 
import modelo.Animal;
import modelo.Cachorro; 

public class Banho extends Servico {

    public Banho(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        double precoFinal = this.precoBase;
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            switch (cachorro.getPorte().toLowerCase()) { 
                case "pequeno":
                    precoFinal += 10.0;
                    break;
                case "medio":
                    precoFinal += 20.0;
                    break;
                case "grande":
                    precoFinal += 30.0;
                    break;
            }
        }
        return precoFinal;
    }

    @Override
    public String toString() { 
        return "Banho{" +
               "nome='" + nome + '\'' +
               ", precoBase=" + precoBase +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banho banho = (Banho) o;
        return nome.equals(banho.nome) &&
               Double.compare(precoBase, banho.precoBase) == 0;
    }

    @Override
    public int hashCode() { 
        int result = nome.hashCode();
        result = 31 * result + Double.hashCode(precoBase);
        return result;
    }
}
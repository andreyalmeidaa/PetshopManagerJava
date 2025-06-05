
package servico; 

import modelo.Animal; 

public class ConsultaVeterinaria extends Servico { 

    public ConsultaVeterinaria(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) { 
        double precoFinal = this.precoBase;
        if (animal.getIdade() > 10) { 
            precoFinal += 20.0;
        } else if (animal.getIdade() < 1) { 
            precoFinal += 10.0;
        }
        return precoFinal;
    }

    @Override
    public String toString() { 
        return "ConsultaVeterinaria{" +
               "nome='" + nome + '\'' +
               ", precoBase=" + precoBase +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaVeterinaria consulta = (ConsultaVeterinaria) o;
        return nome.equals(consulta.nome) &&
               Double.compare(precoBase, consulta.precoBase) == 0;
    }

    @Override
    public int hashCode() { 
        int result = nome.hashCode();
        result = 31 * result + Double.hashCode(precoBase);
        return result;
    }
}
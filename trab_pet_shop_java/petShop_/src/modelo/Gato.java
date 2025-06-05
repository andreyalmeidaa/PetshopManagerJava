
package modelo; 


public class Gato extends Animal { 
    private String corOlhos; 

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    @Override
    public String toString() { 
        return "Gato{" +
               "nome='" + nome + '\'' +
               ", racaTipo='" + racaTipo + '\'' +
               ", idade=" + idade +
               ", proprietario='" + proprietario + '\'' +
               ", corOlhos='" + corOlhos + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; 
        Gato gato = (Gato) o;
        return corOlhos.equals(gato.corOlhos);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode(); 
        result = 31 * result + corOlhos.hashCode();
        return result;
    }
}

package modelo; 


public class Cachorro extends Animal { 
    private String porte;

    public Cachorro(String nome, String racaTipo, int idade, String proprietario, String porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String toString() { 
        return "Cachorro{" +
               "nome='" + nome + '\'' +
               ", racaTipo='" + racaTipo + '\'' +
               ", idade=" + idade +
               ", proprietario='" + proprietario + '\'' +
               ", porte='" + porte + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; 
        Cachorro cachorro = (Cachorro) o;
        return porte.equals(cachorro.porte);
    }

    @Override
    public int hashCode() { 
        int result = super.hashCode(); 
        result = 31 * result + porte.hashCode();
        return result;
    }
}
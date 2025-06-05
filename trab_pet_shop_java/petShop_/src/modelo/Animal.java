
package modelo; 

public abstract class Animal { 
    protected String nome;
    protected String racaTipo;
    protected int idade;
    protected String proprietario;

    public Animal(String nome, String racaTipo, int idade, String proprietario) {
        this.nome = nome;
        this.racaTipo = racaTipo;
        this.idade = idade;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public String getRacaTipo() {
        return racaTipo;
    }

    public int getIdade() {
        return idade;
    }

    public String getProprietario() {
        return proprietario;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "nome='" + nome + '\'' +
               ", racaTipo='" + racaTipo + '\'' +
               ", idade=" + idade +
               ", proprietario='" + proprietario + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return idade == animal.idade &&
               nome.equals(animal.nome) &&
               racaTipo.equals(animal.racaTipo) &&
               proprietario.equals(animal.proprietario);
    }

    @Override
    public int hashCode() { 
        int result = nome.hashCode();
        result = 31 * result + racaTipo.hashCode();
        result = 31 * result + idade;
        result = 31 * result + proprietario.hashCode();
        return result;
    }
}
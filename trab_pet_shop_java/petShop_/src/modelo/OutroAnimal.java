
package modelo;

public class OutroAnimal extends Animal { 
    private String tipoEspecifico; 

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    public String getTipoEspecifico() {
        return tipoEspecifico;
    }

    @Override
    public String toString() {
        return "OutroAnimal{" +
               "nome='" + nome + '\'' +
               ", racaTipo='" + racaTipo + '\'' +
               ", idade=" + idade +
               ", proprietario='" + proprietario + '\'' +
               ", tipoEspecifico='" + tipoEspecifico + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; 
        OutroAnimal outroAnimal = (OutroAnimal) o;
        return tipoEspecifico.equals(outroAnimal.tipoEspecifico);
    }

    @Override
    public int hashCode() { 
        int result = super.hashCode();
        result = 31 * result + tipoEspecifico.hashCode();
        return result;
    }
}
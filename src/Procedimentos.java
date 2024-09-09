/**
 * Classe que representa um procedimento com um nome associado.
 */
public class Procedimentos {
    private String nomeDoProcedimento;

    /**
     * Construtor da classe Procedimentos.
     */
    public Procedimentos(String nomeDoProcedimento) {
        this.nomeDoProcedimento = nomeDoProcedimento;
    }

    // Getters e Setters
    public String getNomeDoProcedimento() {
        return nomeDoProcedimento;
    }

    public void setNomeDoProcedimento(String nomeDoProcedimento) {
        this.nomeDoProcedimento = nomeDoProcedimento;
    }
}

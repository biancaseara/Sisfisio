/**
 * Classe que representa uma comorbidade, ou seja, uma condição médica adicional que pode coexistir com a condição principal de um paciente.
 */
public class Comorbidades {
    private String nomeComorbidade; // Nome da comorbidade

    /**
     * Construtor da classe Comorbidades.
     */
    public Comorbidades(String nomeComorbidade) {
        this.nomeComorbidade = nomeComorbidade;
    }

    // Getters e Setters
    public String getNomeComorbidade() {
        return nomeComorbidade;
    }
    
    public void setNomeComorbidade(String nomeComorbidade) {
        this.nomeComorbidade = nomeComorbidade;
    }
}

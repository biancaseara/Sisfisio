/**
 * Classe que representa um medicamento.
 */
public class Medicamentos {
    private String nomeDoMedicamento;

    /**
     * Construtor da classe Medicamentos.
     */
    public Medicamentos(String nomeDoMedicamento) {
        this.nomeDoMedicamento = nomeDoMedicamento;
    }

    // Getters e Setters
    public void setNomeDoMedicamento(String nomeDoMedicamento) {
        this.nomeDoMedicamento = nomeDoMedicamento;
    }

    public String getNomeDoMedicamento() {
        return nomeDoMedicamento;
    }
}

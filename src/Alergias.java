/**
 * Classe que representa uma alergia de um paciente.
 */
public class Alergias {
    private String nomeDaAlergia;

    /**
     * Construtor da classe Alergias.
     */
    public Alergias(String nomeDaAlergia) {
        this.nomeDaAlergia = nomeDaAlergia;
    }

    // Getters e Setters
    public String getNomeDaAlergia() {
        return nomeDaAlergia;
    }

    public void setNomeDaAlergia(String nomeDaAlergia) {
        this.nomeDaAlergia = nomeDaAlergia;
    }
}

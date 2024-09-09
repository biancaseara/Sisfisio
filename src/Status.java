/**
 * Enumeração que representa os possíveis status de um paciente em um sistema de saúde.
 */
public enum Status {
    AGENDADO("Paciente agendado"),
    ESPERANDO_PELA_CONSULTA("Na lista de espera para ser atendido"),
    EM_TRATAMENTO("Está sendo tratado por especialista"),
    TRATAMENTO_FINALIZDO("Tratamento terminou"),
    RETORNOU_AO_TRATAMENTO("Tratamento retomado");

    private String valor_armazenado;

    /**
     * Construtor do enum Status.
     */
    private Status(String valor_armazenado) {
        this.valor_armazenado = valor_armazenado;
    }

    // Getters
    public String getValor_armazenado() {
        return this.valor_armazenado;
    }
}

public enum Status {
    AGENDADO("Paciente agendado"),
    ESPERANDO_PELA_CONSULTA("Na lista de espera para ser atendido"),
    EM_TRATAMENTO("Está sendo tratado por especialista"),
    TRATAMENTO_FINALIZDO("Tratamento terminou"),
    RETORNOU_AO_TRATAMENTO("Tratamento retomado");


    private Status(String valor_armazenado){
        this.valor_armazenado = valor_armazenado;
    }

    private String  valor_armazenado;

    public String getValor_armazenado() {
        return this.valor_armazenado;
    }

}
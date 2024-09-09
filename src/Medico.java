import java.util.*;

/**
 * Classe que representa um médico, estendendo a classe Usuario e adicionando informações específicas relacionadas à profissão.
 */
public class Medico extends Usuario {
    private Especialidade especialidade;
    private String crm; // Número do CRM do médico

    public Medico(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco, String telefone, String senha, String crm) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone, senha);
        this.crm = crm;
    }

    /**
     * Construtor padrão da classe Medico.
     */
    public Medico() {
    }

    // Getters e Setters
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    /**
     * Prescreve um medicamento para o paciente. Adiciona o medicamento à lista de medicamentos do paciente.
     */
    public void prescreverMedicamentos(Paciente paciente){
        ArrayList<Medicamentos> medicamentosDoPaciente = paciente.getMedicamentos();
        Medicamentos medicamento = new Medicamentos("Diazepan");
        medicamentosDoPaciente.add(medicamento);
        paciente.setMedicamentos(medicamentosDoPaciente);
        System.out.println("Medicamento prescrevido com sucesso");
    }
}

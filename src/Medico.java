import java.util.*;

public class Medico extends Usuario {
    private Especialidade especialidade;
    private String crm;
    
    public Medico(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco,
            String telefone, String senha, Especialidade especialidade, String crm) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone, senha);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void prescreverMedicamentos(Paciente paciente){
        ArrayList<Medicamentos> medicamentosDoPaciente = paciente.getMedicamentos();
        Medicamentos diazepan = new Medicamentos("Diazepan");
        medicamentosDoPaciente.add(diazepan);
        paciente.setMedicamentos(medicamentosDoPaciente);
        System.out.println("Medicamento prescrevido com sucesso");
    
    }
}

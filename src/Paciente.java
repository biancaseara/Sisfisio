import java.util.*;

/**
 * Classe que representa um paciente, estendendo a classe Usuario e adicionando informações específicas de saúde.
 */
public class Paciente extends Usuario {
    private TipoSanguineo tipoSanguineo;
    private ArrayList<Alergias> alergias; // Lista de alergias do paciente
    private ArrayList<Comorbidades> comorbidades; // Lista de comorbidades do paciente
    private ArrayList<Medicamentos> medicamentos; // Lista de medicamentos do paciente
    private Status status_paciente;

    public Paciente(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco, String telefone, String senha) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone, senha);
    }

    /**
     * Construtor padrão da classe Paciente.
     */
    public Paciente() {
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public void setMedicamentos(ArrayList<Medicamentos> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public void setComorbidades(ArrayList<Comorbidades> comorbidades) {
        this.comorbidades = comorbidades;
    }

    public void setAlergias(ArrayList<Alergias> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<Medicamentos> getMedicamentos() {
        return medicamentos;
    }

    public ArrayList<Comorbidades> getComorbidades() {
        return comorbidades;
    }

    public ArrayList<Alergias> getAlergias() {
        return alergias;
    }

    public Status getStatus_paciente() {
        return status_paciente;
    }

    public void setStatus_paciente(Status status_paciente) {
        this.status_paciente = status_paciente;
    }

    /**
     * Retorna uma representação em String do paciente.
     */
    @Override
    public String toString() {
        return "Paciente [tipoSanguineo=" + tipoSanguineo + ", alergias=" + alergias + ", comorbidades=" + comorbidades
                + ", medicamentos=" + medicamentos + ", status_paciente=" + status_paciente + ", getNome()=" + getNome()
                + ", getDataNascimento()=" + getDataNascimento() + ", getEndereco()=" + getEndereco()
                + ", getTelefone()=" + getTelefone() + ", getCpf()=" + getCpf() + ", getRg()=" + getRg() + "]";
    }
}

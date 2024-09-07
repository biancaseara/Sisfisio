import java.util.*;;
public class Paciente extends Usuario {
    private TipoSanguineo tipoSanguineo;
    private ArrayList<Alergias>alergias;
    private ArrayList<Comorbidades> comorbidades;
    private ArrayList<Medicamentos> medicamentos;
    private Status status_paciente;

    
  
    public Paciente(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco, String telefone,
            TipoSanguineo tipoSanguineo, ArrayList<Alergias> alergias, ArrayList<Comorbidades> comorbidades,
            ArrayList<Medicamentos> medicamentos, Status status_paciente) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone);
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.comorbidades = comorbidades;
        this.medicamentos = medicamentos;
        this.status_paciente = status_paciente;
    }

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

    @Override
    public String toString() {
        return "Paciente [tipoSanguineo=" + tipoSanguineo + ", alergias=" + alergias + ", comorbidades=" + comorbidades
                + ", medicamentos=" + medicamentos + ", status_paciente=" + status_paciente + ", getNome()=" + getNome()
                + ", getDataNascimento()=" + getDataNascimento() + ", getEndereco()=" + getEndereco()
                + ", getTelefone()=" + getTelefone() + ", getCpf()=" + getCpf() + ", getRg()=" + getRg() + "]";
    }


    


    
    
    
}
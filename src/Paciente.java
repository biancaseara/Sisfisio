import java.util.Date;

public class Paciente extends Usuario {
    private TipoSanguineo tipoSanguineo;
    private String[] alergias;
    private String[] comorbidades;
    private String[] medicamentos;
    private HistoricoFamiliar historicoFamiliar;
    
    public Paciente(String nome, long cpf, long rg, Date dataNascimento, Endereco endereco,String telefone, TipoSanguineo tipoSanguineo,
                   String[] alergias, String[] comorbidades, String[] medicamentos, HistoricoFamiliar historicoFamiliar) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone);
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.comorbidades = comorbidades;
        this.medicamentos = medicamentos;
        this.historicoFamiliar = historicoFamiliar;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String[] getAlergias() {
        return alergias;
    }

    public void setAlergias(String[] alergias) {
        this.alergias = alergias;
    }

    public String[] getComorbidade() {
        return this.comorbidades;
    }

    public void setComorbidade(String[] comorbidades) {
        this.comorbidades = comorbidades;
    }

    public void setMedicamentos(String[] medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String[] getMedicamentos() {
        return medicamentos;
    }

    public void setHistoricoFamiliar(HistoricoFamiliar historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }

    public HistoricoFamiliar getHistoricoFamiliar() {
        return historicoFamiliar;
    }
    
    
    
}
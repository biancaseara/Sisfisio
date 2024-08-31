import java.util.Date;

public class Consulta {
    private int idConsulta;
    private int idPaciente;
    private int idMedico;
    private Status statusPaciente;
    private float valorConsulta;
    private Date dataConsulta;
    private String procedimentos;
    
    public Consulta(int idConsulta, int idPaciente, int idMedico, Status statusPaciente, float valorConsulta, Date dataConsulta, String procedimentos) {
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.statusPaciente = statusPaciente;
        this.valorConsulta = valorConsulta;
        this.dataConsulta = dataConsulta;
        this.procedimentos = procedimentos;
    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public Status getStatusPaciente() {
        return statusPaciente;
    }

    public void setStatusPaciente(Status statusPaciente) {
        this.statusPaciente = statusPaciente;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setProcedimentos(String procedimentos) {
        this.procedimentos = procedimentos;
    }
    
    public String getProcedimentos() {
        return procedimentos;
    }

}
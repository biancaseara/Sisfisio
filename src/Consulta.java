import java.util.Date;
import java.util.Random;

public class Consulta {
    private final int idConsulta = new Random().nextInt(1000);
    private final int idPaciente = new Random().nextInt(1000);
    private final int idMedico = new Random().nextInt(1000);
    private Status statusPaciente;
    private float valorConsulta;
    private Date dataConsulta;
    private String[] procedimentos;
    
    public Consulta(Status statusPaciente, float valorConsulta, Date dataConsulta, String[] procedimentos) {
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

    public void setProcedimentos(String[] procedimentos) {
        this.procedimentos = procedimentos;
    }
    
    public String[] getProcedimentos() {
        return procedimentos;
    }

}
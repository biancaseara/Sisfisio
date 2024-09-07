import java.util.*; // https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
import java.text.DateFormat;


public class Consulta {
    private int idConsulta = new Random().nextInt(1000);
    private int idPaciente;
    private int idMedico;
    private Status statusPaciente;
    private float valorConsulta;
    private Calendar dataConsulta;
    private ArrayList<Procedimentos> procedimentos;
    private DateFormat formataData = DateFormat.getDateInstance();
    private DateFormat hora = DateFormat.getTimeInstance();
    
    public Consulta(Status statusPaciente, float valorConsulta, Calendar dataConsulta, ArrayList<Procedimentos> procedimentos) {
        this.statusPaciente = statusPaciente;
        this.valorConsulta = valorConsulta;
        this.dataConsulta = dataConsulta;
        this.procedimentos = procedimentos;
    }

    
    public Consulta() {

    }


    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }


    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }
    
    private void setIdConsulta(int id){
        this.idConsulta = id;
    }
    

    public int getIdPaciente() {
        return idPaciente;
    }

    public int getIdMedico() {
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
        if (this.dataConsulta != null){
            return dataConsulta.getTime();
        }
        return null;
    }

    public void setDataConsulta(Calendar dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setProcedimentos(ArrayList<Procedimentos> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public ArrayList<Procedimentos> getProcedimentos() {
        return procedimentos;
    }

    public void agendarConsulta(Paciente paciente,Medico medico){
        Procedimentos procedimento1  = new Procedimentos("Sessão de quiropraxia");
        Procedimentos procedimento2 = new Procedimentos("Sessão de loucura");
        ArrayList<Procedimentos> listaProcedimentos = new ArrayList<>();
        listaProcedimentos.add(procedimento1);
        listaProcedimentos.add(procedimento2);
        Calendar horario = Calendar.getInstance();
        Consulta consulta = new Consulta(paciente.getStatus_paciente(), 50, horario,listaProcedimentos);
        consulta.setIdMedico(medico.getId());
        consulta.setIdPaciente(paciente.getId());
        
        System.out.println("Consulta agendada com paciente: " + paciente.getNome() + " Sendo atendido pela(o) Dr. "  + medico.getNome() + " No dia  " + formataData.format(horario.getTime()) +  " As " +  hora.format(horario.getTime()));
    }

    public void cancelarConsulta(Paciente paciente, Medico medico){
        System.out.println("Cancelando consulta do paciente " + paciente.getNome() + " Que seria feita pelo(a) Dr. " + medico.getNome() + " No dia: " + formataData.format(this.getDataConsulta()));
        this.setDataConsulta(null);
        this.setIdMedico(-1);
        this.setIdPaciente(-1);
        this.setIdConsulta(-1);
        this.setProcedimentos(null);
        this.setStatusPaciente(null);
        this.setValorConsulta(0);
    }
    

}
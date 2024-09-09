import java.util.*;
import java.text.DateFormat;

/**
 * Classe que representa uma consulta médica.
 */
public class Consulta {
    private int idConsulta = new Random().nextInt(1000); // Identificador único da consulta
    private int idPaciente; // Identificador do paciente
    private int idMedico; // Identificador do médico
    private Status statusPaciente;
    private float valorConsulta;
    private Calendar dataConsulta;
    private ArrayList<Procedimentos> procedimentos; // Lista de procedimentos realizados
    private DateFormat formataData = DateFormat.getDateInstance(); // Formatação da data
    private DateFormat hora = DateFormat.getTimeInstance(); // Formatação da hora

    /**
     * Construtor da classe Consulta.
     */
    public Consulta(Status statusPaciente, float valorConsulta, Calendar dataConsulta, ArrayList<Procedimentos> procedimentos) {
        this.statusPaciente = statusPaciente;
        this.valorConsulta = valorConsulta;
        this.dataConsulta = dataConsulta;
        this.procedimentos = procedimentos;
    }

    /**
     * Construtor padrão da classe Consulta.
     */
    public Consulta() {
    }

    // Getters e setters
    public int getIdConsulta() {
        return idConsulta;
    }

    private void setIdConsulta(int id) {
        this.idConsulta = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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
        if (this.dataConsulta != null) {
            return dataConsulta.getTime();
        }
        return null;
    }

    public void setDataConsulta(Calendar dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public ArrayList<Procedimentos> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(ArrayList<Procedimentos> procedimentos) {
        this.procedimentos = procedimentos;
    }

    /**
     * Agenda uma nova consulta para um paciente com um médico.
     */
    public void agendarConsulta(Paciente paciente, Medico medico) {
        Procedimentos procedimento = new Procedimentos("Sessão de quiropraxia");
        ArrayList<Procedimentos> listaProcedimentos = new ArrayList<>();
        listaProcedimentos.add(procedimento);
        Calendar horario = Calendar.getInstance();
        Consulta consulta = new Consulta(paciente.getStatus_paciente(), 50, horario, listaProcedimentos);
        consulta.setIdMedico(medico.getId());
        consulta.setIdPaciente(paciente.getId());

        System.out.println("Consulta agendada com paciente: " + paciente.getNome() + " sendo atendido pela(o) Dr. " + medico.getNome() + " no dia " + formataData.format(horario.getTime()) + " às " + hora.format(horario.getTime()));
    }

    /**
     * Cancela uma consulta existente.
     */
    public void cancelarConsulta(Paciente paciente, Medico medico) {
        System.out.println("Cancelando consulta do paciente " + paciente.getNome() + " que seria feita pelo(a) Dr. " + medico.getNome() + " no dia: " + formataData.format(this.getDataConsulta()));
        this.setDataConsulta(null);
        this.setIdMedico(-1);
        this.setIdPaciente(-1);
        this.setIdConsulta(-1);
        this.setProcedimentos(null);
        this.setStatusPaciente(null);
        this.setValorConsulta(0);
    }
}

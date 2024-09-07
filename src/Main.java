import java.util.*;

public class Main {
    public static void main(String[] args) {
 
        Calendar data = Calendar.getInstance();
        Endereco endereco = new Endereco("12345-678", "Rua 1", "Bairro 1", "Compl.1", 123);
        Admin admin = new Admin("Admin", "12345678901", "12345678", data, endereco, "12345678901");
        ArrayList<Comorbidades> comorbidades = new ArrayList<>();
        ArrayList<Alergias> alergias = new ArrayList<>();
        ArrayList<Medicamentos> medicamentos = new ArrayList<>();
        ArrayList<Procedimentos> procedimentos = new ArrayList<>();
        Paciente paciente = new Paciente("Paciente 1", "11111111111", "11111111", data, endereco, "10100001111", TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos,Status.AGENDADO);
        Paciente paciente2 = new Paciente("Paciente 2", "22222222222", "22222222", data, endereco, "10100002222", TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos,Status.EM_TRATAMENTO);
        Consulta consulta = new Consulta(paciente.getStatus_paciente(), 0, data,procedimentos);
        Medico medica = new Medico("Leonardo","09411790526", "1632029526", data, endereco, "75-982615462", Especialidade.FISIOTERAPIA_AQUATICA,"1254" );
        // admin.listarUsuarios();

        // admin.criarUsuario(paciente);
        // admin.criarUsuario(paciente2);

        // admin.listarUsuarios();

        // Usuario usuarioId = admin.buscarUsuario(paciente.getId());
        // System.out.println("Usuário encontrado: " + usuarioId.getNome());

        // admin.deletarUsuario(paciente.getId());
        // admin.listarUsuarios();
        // consulta.agendarConsulta(paciente2, medica);
        // System.out.println(consulta.getDataConsulta());
        // consulta.cancelarConsulta(paciente2, medica);
        // System.out.println(consulta.getDataConsulta());
        System.out.println(paciente.getDataNascimento());
    }
}

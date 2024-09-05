import java.util.*;

public class Main {
    public static void main(String[] args) {
 
        Calendar data = Calendar.getInstance();
        Endereco endereco = new Endereco("12345-678", "Rua 1", "Bairro 1", "Compl.1", 123);
        Admin admin = new Admin("Admin", 12345678901L, 12345678L, data, endereco, "12345678901");
        ArrayList<Comorbidades> comorbidades = new ArrayList<>();
        ArrayList<Alergias> alergias = new ArrayList<>();
        ArrayList<Medicamentos> medicamentos = new ArrayList<>();
        ArrayList<Procedimentos> procedimentos = new ArrayList<>();
        Paciente paciente = new Paciente("Paciente 1", 11111111111L, 11111111L, data, endereco, "10100001111", TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos,Status.AGENDADO);
        Paciente paciente2 = new Paciente("Paciente 2", 22222222222L, 22222222L, data, endereco, "10100002222", TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos,Status.EM_TRATAMENTO);
        Consulta consulta = new Consulta(paciente.getStatus_paciente(), 0, data,procedimentos);
        admin.listarUsuarios();

        admin.criarUsuario(paciente);
        admin.criarUsuario(paciente2);

        admin.listarUsuarios();

        Usuario usuarioId = admin.buscarUsuario(paciente.getId());
        System.out.println("Usuário encontrado: " + usuarioId.getNome());

        admin.deletarUsuario(paciente.getId());
        admin.listarUsuarios();
    }
}

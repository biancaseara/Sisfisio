import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String[] sla = {"sa", "num", "nunca nem vi"};
        int[] idadeDosAfetados = {10, 60, 49 ,60, 100};
        int[] sexoDosFamliaresAcometados = {1,2};
        HistoricoFamiliar historicoFamiliar = new HistoricoFamiliar(sla, idadeDosAfetados, sexoDosFamliaresAcometados);
        historicoFamiliar.porcentagemEmRelacaoAoSexo();
        historicoFamiliar.tabelaDasIdadesAfetadas();
        historicoFamiliar.tabelaDasComorbidadesFamiliares();

        Date date = new Date();
        Endereco endereco = new Endereco("12345-678", "Rua 1", "Bairro 1", "Compl.1", 123);
        Admin admin = new Admin("Admin", 12345678901L, 12345678L, date, endereco, "12345678901");
        String[] alergias = {"Pólen", "Amendoim"};
        String[] comorbidades = {"Hipertensão"};
        String[] medicamentos = {"Aspirina"};
        Paciente paciente = new Paciente("Paciente 1", 11111111111L, 11111111L, date, endereco, "10100001111", TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos, historicoFamiliar);
        Paciente paciente2 = new Paciente("Paciente 2", 22222222222L, 22222222L, date, endereco, "10100002222", TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos, historicoFamiliar);
        
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

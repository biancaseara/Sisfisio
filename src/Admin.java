import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * A classe Admin herda de Usuario e adiciona funcionalidades específicas de administração, 
 * como criar, buscar, deletar e listar usuários.
 */
public class Admin extends Usuario {  
    /**
     * Lista estática de usuários do sistema.
     */
    private static List<Usuario> usuarios = new ArrayList<>();

    /**
     * Construtor da classe Admin com parâmetros.
     */
    public Admin(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco, String telefone, String senha) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone, senha);
        this.tornaModerador();
    }   
    
    /**
     * Construtor padrão da classe Admin.
     */
    public Admin() {
    }

    /**
     * Cria um novo paciente com os dados fornecidos e adiciona à lista de usuários.
     */
    public static void criarPaciente(String nome, String cpf, String rg, int numeroCasa, String rua, String complemento, int cep, String bairro, String dataNascimento, String telefone) {
        Endereco endereco = new Endereco(cep, rua, bairro, complemento, numeroCasa);
        String senha = "senha123";
        
        // Método que converte a string dataNascimento para um objeto Calendar
        Calendar dataNascimentoCalendar = converterStringParaCalendar(dataNascimento);
    
        // Cria um novo paciente com os dados fornecidos
        Paciente paciente = new Paciente(nome, cpf, rg, dataNascimentoCalendar, endereco, telefone, senha);
        usuarios.add(paciente); // Adiciona o paciente à lista de usuários
    }

    /*
     * Criar um novo especialista com os dados fornecidos e adiciona à lista de usuários.
    */
    public static void criarEspecialista(String nome, String cpf, String rg, int numeroCasa, String rua, String complemento, int cep, String bairro, String dataNascimento, String telefone, String crm) {
        Endereco endereco = new Endereco(cep, rua, bairro, complemento, numeroCasa);
        String senha = "senha123";
        
        // Método que converta a string dataNascimento para um objeto Calendar
        Calendar dataNascimentoCalendar = converterStringParaCalendar(dataNascimento);
    
        // Cria um novo paciente com os dados fornecidos
        Medico medico = new Medico(nome, cpf, rg, dataNascimentoCalendar, endereco, telefone, senha, crm);
        usuarios.add(medico); // Adiciona o paciente à lista de usuários
    }

    /**
     * Verifica se um usuário já está cadastrado na lista de usuários.
     */
    public boolean usuarioExistente(Usuario usuario) {
        return usuarios.contains(usuario) ? true : false;
    }

    /**
     * Deleta um usuário com base no ID fornecido, após confirmação.
     */
    public void deletarUsuario(long id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                // Confirmar remoção do usuário
                Scanner inpt = new Scanner(System.in);
                System.out.println("Deseja mesmo remover o usuário: " + usuarios.get(i).getNome() + " ?(S/N)");
                String resp = inpt.next();
                if (resp.equalsIgnoreCase("S")) {                   
                    // Remove o usuário da lista
                    usuarios.remove(i);
                    System.out.println("Usuário deletado com sucesso");
                } else {
                    System.out.println("O usuário não foi deletado");
                }
                inpt.close();
                return;
            }
        }
        System.out.println("Usuário com id " + id + " não encontrado.");
    }

    /**
     * Busca um usuário com base no ID fornecido.
     */
    public Usuario buscarUsuario(long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        System.out.println("Usuário com id " + id + " não encontrado.");
        return null;
    }

    /**
     * Lista todos os usuários cadastrados no sistema.
     */
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getId() + " - " + usuario.getNome());
            }
        }
    }

   /**
    * Retorna a lista de usuários.
    */
   public static List<Usuario> getUsuarios() {
        return usuarios;
   }

   /*
   * Converta a string dataNascimento para um objeto Calendar
   */
  private static Calendar converterStringParaCalendar(String dataNascimento) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = null;
        try {
            dataFormatada = formato.parse(dataNascimento);
        } catch (ParseException e) {
            e.printStackTrace(); // Trata a exceção de parsing
        }
        
        Calendar dataNascimentoCalendar = Calendar.getInstance();
        if (dataFormatada != null) {
            dataNascimentoCalendar.setTime(dataFormatada);
        }
        return dataNascimentoCalendar;
    }
}

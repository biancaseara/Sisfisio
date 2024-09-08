import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Admin extends Usuario {
    private static List<Usuario> usuarios = new ArrayList<>();

    public Admin(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco,
            String telefone, String senha) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone, senha);
        this.tornaModerador();
    }   
    
    public Admin() {
        
    }


    public void criarUsuario(Usuario usuario) {
        Scanner inpt = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = inpt.next(); 
        
        System.out.print("CPF: ");
        String cpf = inpt.next();

        System.out.print("RG: ");
        String rg = inpt.next();
        System.out.println("Data nascimento(dd/mm/aaaa): ");
        String dataNascimento = inpt.next();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dataFormatada = null;
        try {
            dataFormatada = formato.parse(dataNascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar dataPraPassarNoConstructor = Calendar.getInstance();
        dataPraPassarNoConstructor.setTimeInMillis(dataFormatada.getTime());

        System.out.print("CEP: ");
        String cep = inpt.next();

        System.out.print("Rua: ");
        String rua = inpt.next();

        System.out.print("Bairro: ");
        String bairro = inpt.next();

        System.out.print("Complemento: ");
        String complemento = inpt.next();

        System.out.print("Número da casa: ");
        int numeroCasa = inpt.nextInt();

        Endereco endereco = new Endereco(cep, rua, bairro, complemento, numeroCasa);
        
        System.out.print("Telefone: ");
        String telefone = inpt.next();
        
        System.out.print("Senha: ");
        String senha = inpt.next();

        try {
            if (usuario instanceof Medico) {
                System.out.print("CRM: ");
                String crm = inpt.next();
    
                Medico medico = new Medico(nome, cpf, rg, dataPraPassarNoConstructor, endereco, telefone, senha, Especialidade.FISIOTERAPIA_RESPIRATORIA, crm);
                usuarios.add(medico);
            } else { // if (usuario instanceof Paciente)
                ArrayList<Alergias> alergias = new ArrayList<>();
                ArrayList<Comorbidades> comorbidades = new ArrayList<>();
                ArrayList<Medicamentos> medicamentos = new ArrayList<>();
    
                Paciente paciente = new Paciente(nome, cpf, rg, dataPraPassarNoConstructor, endereco, telefone, senha, TipoSanguineo.O_POSITIVO, alergias, comorbidades, medicamentos, Status.EM_TRATAMENTO);
                usuarios.add(paciente);
                System.out.println("Usuário criado com sucesso!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public void deletarUsuario(long id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                // vamo ter que deixar isso "agradavel" na interface grafica
                Scanner inpt = new Scanner(System.in);
                System.out.println("Deseja mesmo remover o usuário: " + usuarios.get(i).getNome() + " ?(S/N)");
                String resp = inpt.next();
                if (resp.equalsIgnoreCase("S")) {
                    Usuario usuario = usuarios.get(i);
                    usuario = null;
                    usuarios.remove(i);
                    System.out.println("Usuário deletado com sucesso");
                }
                else{
                    System.out.println("O usuário não foi deletado");
                }
                System.out.println();
                inpt.close();
                return;
            }
        }
        System.out.println("Usuário com id " + id + " não encontrado.");
    }

    public Usuario buscarUsuario(long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        System.out.println("Usuário com id " + id + " não encontrado.");
        return null;
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome());
            }
        }
    }

   public static List<Usuario> getUsuarios() {
        return usuarios;
   }

}
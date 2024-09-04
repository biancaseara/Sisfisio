import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Admin extends Usuario {
    private List<Usuario> usuarios;

    public Admin(String nome, long cpf, long rg, Date dataNascimento, Endereco endereco,
            String telefone) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone);
        this.usuarios = new ArrayList<>();
        this.tornaModerador();
    }
    
    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário criado com sucesso!");
    }

    public void deletarUsuario(long id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                // vamo ter que deixar isso "agradavel" na interface grafica
                Scanner inpt = new Scanner(System.in);
                System.out.println("Deseja mesmo remover o usuário: " + usuarios.get(i).getNome() + " ?(S/N)");
                String resp = inpt.next();
                if (resp.equalsIgnoreCase("S")) {
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

}
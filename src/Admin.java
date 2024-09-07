import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Admin extends Usuario {
    private List<Usuario> usuarios;

    public Admin(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco,
            String telefone) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone);
        this.usuarios = new ArrayList<>();
        this.tornaModerador();
    }

    
    
    public Admin() {
        
    }


    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário criado com sucesso!");
        // https://www.alura.com.br/artigos/como-converter-string-para-date-em-java#:~:text=Para%20converter%20essa%20dataRecebida%20para,contenha%20dia%2Fm%C3%AAs%2Fano.
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

   

}
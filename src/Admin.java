import java.util.Date;

public class Admin extends Usuario {

    public Admin(String nome, long cpf, long rg, Date dataNascimento, Endereco endereco,
            String telefone) {
        super(nome, cpf, rg, dataNascimento, endereco, telefone);
    }
    
    public void criarUsuario(Usuario usuario) {
        
    }
}
import java.util.Date;
import java.util.Random;

public abstract class Usuario {
    private final long  id = new Random().nextLong();
    private String nome;
    private long cpf;
    private long rg;
    private Date dataNascimento;
    private Endereco endereco;
    private String telefone;
    private boolean moderador;
    
    public Usuario(String nome, long cpf, long rg, Date dataNascimento, Endereco endereco,
            String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.moderador = false;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public long getRg() {
        return rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
    
}
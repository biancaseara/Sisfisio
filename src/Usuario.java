import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public abstract class Usuario {
   private final int id = new Random().nextInt(100);
   private String nome;
   private long cpf;
   private long rg;
   private Calendar dataNascimento;
   private Endereco endereco;
   private String telefone;
   private boolean moderador;

   public Usuario(String nome, long cpf, long rg, Calendar dataNascimento, Endereco endereco, String telefone) {
      this.nome = nome;
      this.cpf = cpf;
      this.rg = rg;
      this.dataNascimento = dataNascimento;
      this.endereco = endereco;
      this.telefone = telefone;
      this.moderador = false;
   }

   public Usuario() {
   }

   public int getId() {
      return this.id;
   }

   public String getNome() {
      return this.nome;
   }

   public long getCpf() {
      return this.cpf;
   }

   public long getRg() {
      return this.rg;
   }

   public Calendar getDataNascimento() {
      return this.dataNascimento;
   }

   public Endereco getEndereco() {
      return this.endereco;
   }

   public String getTelefone() {
      return this.telefone;
   }

   public void tornaModerador() {
      this.moderador = true;
   }

   public boolean isModerador() {
      return this.moderador;
   }
}

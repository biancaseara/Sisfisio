import java.text.DateFormat;
import java.util.Random;
import java.util.Calendar;
import java.util.ArrayList;

public abstract class Usuario {
   private final int id = new Random().nextInt(100);
   private String nome;
   private String cpf;
   private String rg;
   private Calendar dataNascimento;
   private Endereco endereco;
   private String telefone;
   private boolean moderador;
   private String senha;
   private DateFormat formataData = DateFormat.getDateInstance();


   public Usuario(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco, String telefone, String senha) {
      this.nome = nome;
      this.cpf = cpf;
      this.rg = rg;
      this.dataNascimento = dataNascimento;
      this.endereco = endereco;
      this.telefone = telefone;
      this.senha = senha;
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

   @SuppressWarnings("static-access")
   public String getDataNascimento() {
      return formataData.format(this.dataNascimento.getInstance().getTime());
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

   public String getCpf() {
      return cpf;
   }

   public String getRg() {
      return rg;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

}

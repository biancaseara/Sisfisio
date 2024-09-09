import java.text.DateFormat;
import java.util.Random;
import java.util.Calendar;

/**
 * Classe abstrata que representa um usuário com informações básicas.
 */
public abstract class Usuario {
   private final int id = new Random().nextInt(100); // Identificador único do usuário
   private String nome;
   private String cpf;
   private String rg;
   private Calendar dataNascimento;
   private Endereco endereco;
   private String telefone;
   private boolean moderador; // Indica se o usuário é um moderador
   private String senha;
   private DateFormat formataData = DateFormat.getDateInstance(); // Formato para exibir datas

   /**
    * Construtor da classe Usuario.
    */
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

   /**
    * Construtor padrão da classe Usuario.
    */
   public Usuario() {
   }

   // Getters e Setters

   /**
    * Retorna a data de nascimento formatada como uma String.
    * @return Data de nascimento formatada.
    */
    @SuppressWarnings("static-access")
    public String getDataNascimento() {
       return formataData.format(this.dataNascimento.getInstance().getTime());
    }
   
   public int getId() {
      return this.id;
   }

   public String getNome() {
      return this.nome;
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

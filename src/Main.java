import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] sla = {"sa", "num", "nunca nem vi"};
        int[] idadeDosAfetados = {10, 60, 49 ,60, 100};
        int[] sexoDosFamliaresAcometados = {1,2};
        HistoricoFamiliar historicoFamiliar = new HistoricoFamiliar(sla, idadeDosAfetados, sexoDosFamliaresAcometados);
        historicoFamiliar.porcentagemEmRelacaoAoSexo();
        historicoFamiliar.tabelaDasIdadesAfetadas();
        historicoFamiliar.tabelaDasComorbidadesFamiliares();
    }
}

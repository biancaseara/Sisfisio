public class HistoricoFamiliar {
    String[] comorbidadesGeneticas; // mais presentes na grande maioria da família
    int[] idadeDosAfetados;
    int[] sexoDosFamliaresAcometados; // 1 para masculino ou 2 pra feminino


    public HistoricoFamiliar(String[] comorbidadesGeneticas, int[] idadeDosAfetados, int[] sexoDosFamliaresAcometados) {
        this.comorbidadesGeneticas = comorbidadesGeneticas;
        this.idadeDosAfetados = idadeDosAfetados;
        this.sexoDosFamliaresAcometados = sexoDosFamliaresAcometados;
    }

    public void porcentagemEmRelacaoAoSexo(){
        int masculino = 0;
        int feminino = 0;
        for (int sexo : sexoDosFamliaresAcometados) {
            if (sexo == 1) {
                masculino++;
            }
            else if(sexo == 2){
                feminino++;
            }
        }
        System.out.println("A porcentagem de homens atingidos foi de :  " + (((double)masculino/sexoDosFamliaresAcometados.length) * 100) + "%");
        System.out.println("A porcentageM de mulheres atingidas foi de :  " + (((double)feminino/sexoDosFamliaresAcometados.length) * 100) + "%");

    }

    public void tabelaDasIdadesAfetadas(){
        int entreZeroEVinte = 0;
        int entreVinteEUmEQuarenta = 0;
        int entreQuarentaESessenta = 0;
        int entreSessentaEOitenta = 0;
        int acimaDeOitenta = 0;

        for (int idade : idadeDosAfetados) {
            if (idade < 20) {
                entreZeroEVinte++;
            }
            else if (idade <= 40){
                entreVinteEUmEQuarenta++;
            }
            else if(idade <=60){
                entreQuarentaESessenta++;
            }
            else if (idade <= 80){
                entreSessentaEOitenta++;
            }
            else{
                acimaDeOitenta++;
            }
        }

        System.out.println("TABELA DAS IDADES AFETADAS");
        System.out.println("Entre 0 e 20 tivemos -> " + entreZeroEVinte + " pessoas");
        System.out.println("Entre 20 e 40 tivemos -> " + entreVinteEUmEQuarenta + " pessoas");
        System.out.println("Entre 40 e 60 tivemos -> " + entreQuarentaESessenta + " pessoas");
        System.out.println("Entre 60 e 80 tivemos -> " + entreSessentaEOitenta + " pessoas");
        System.out.println("Acima de 80 anos tivemos-> " + acimaDeOitenta + " pessoas");
    }

    public void tabelaDasComorbidadesFamiliares(){
        System.out.println("Todas as comorbidades relatadas foram: ");
        for (String comorbidade : comorbidadesGeneticas) {
            System.out.println(comorbidade);
        }
    }

    public String[] getComorbidadesGeneticas() {
        return comorbidadesGeneticas;
    }

    public int[] getIdadeDosAfetados() {
        return idadeDosAfetados;
    }

    public int[] getSexoDosFamliaresAcometados() {
        return sexoDosFamliaresAcometados;
    }

    public void setComorbidadesGeneticas(String[] comorbidadesGeneticas) {
        this.comorbidadesGeneticas = comorbidadesGeneticas;
    }

    public void setIdadeDosAfetados(int[] idadeDosAfetados) {
        this.idadeDosAfetados = idadeDosAfetados;
    }

    public void setSexoDosFamliaresAcometados(int[] sexoDosFamliaresAcometados) {
        this.sexoDosFamliaresAcometados = sexoDosFamliaresAcometados;
    }






    
}

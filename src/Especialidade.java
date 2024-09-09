/**
 * Enum que representa diferentes especialidades na área de fisioterapia e saúde.
 */
public enum Especialidade {
    ACUPUNTURA("Envolve a aplicação de agulhas em pontos específicos do corpo para aliviar a dor e promover a saúde geral."),
    FISIOTERAPIA_AQUATICA("Fisioterapeutas aquáticos usam técnicas terapêuticas em piscinas para tratar uma variedade de condições musculares e ortopédicas."),
    FISIOTERAPIA_CARDIOVASCULAR("Foca no tratamento de pacientes com doenças cardíacas, auxiliando na reabilitação cardíaca e na melhoria da capacidade cardiovascular."),
    FISIOTERAPIA_DERMATOFUNCIONAL("Concentra-se na reabilitação de pacientes com condições de pele, como queimaduras e cicatrizes."),
    FISIOTERAPIA_ESPORTIVA("O fisioterapeuta trabalha com atletas, auxiliando na prevenção de lesões, na recuperação e na melhoria do desempenho esportivo."),
    GERONTOLOGIA("Os fisioterapeutas gerontológicos atendem pacientes idosos, auxiliando na manutenção da mobilidade e da qualidade de vida."),
    FISIOTERAPIA_DO_TRABALHO("Fisioterapeutas do trabalho se concentram na saúde dos trabalhadores, avaliando e prevenindo lesões ocupacionais."),
    FISIOTERAPIA_NEUROFUNCIONAL("Esta especialidade lida com pacientes com distúrbios neurológicos, como AVC, paralisia cerebral e lesões medulares."),
    FISIOTERAPIA_ONCOLOGIA("Fisioterapeutas oncológicos ajudam pacientes com câncer a manter a função física e melhorar a qualidade de vida durante e após o tratamento."),
    FISIOTERAPIA_RESPIRATORIA("Especialistas em fisioterapia respiratória tratam pacientes com doenças pulmonares, ajudando-os na reabilitação pulmonar e na melhoria da função respiratória."),
    FISIOTERAPIA_TRAUMATO_ORTOPEDICA("A especialidade traumato-ortopédica trata de lesões e de condições musculoesqueléticas, como fraturas, entorses e problemas articulares."),
    OSTEOPATIA("Fisioterapeutas osteopatas trabalham na manipulação do sistema musculoesquelético para aliviar a dor e melhorar essa função."),
    QUIROPRAXIA("Semelhante à osteopatia, a quiropraxia envolve a manipulação da coluna vertebral para tratar dores nas costas e distúrbios neuromusculares."),
    SAUDE_DA_MULHER("Essa especialidade aborda questões de saúde exclusivas das mulheres, como pré e pós-parto, incontinência urinária e disfunções pélvicas."),
    TERAPIA_INTENSIVA("Profissionais de terapia intensiva trabalham em Unidades de Terapia Intensiva (UTI), auxiliando pacientes com insuficiência respiratória, entre outras condições críticas.");

    private String descricao;

    /**
     * Construtor da enumeração Especialidade.
     */
    private Especialidade(String descricao){
        this.descricao = descricao;
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }
}

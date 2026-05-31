// Classe responsável por representar uma equipe do sistema
public class Equipe {

    private String nomeEquipe;
    private String descricao;

    // Construtor da classe
    public Equipe(String nomeEquipe, String descricao) {

        this.nomeEquipe = nomeEquipe;
        this.descricao = descricao;
    }

    // Retorna o nome da equipe
    public String getNomeEquipe() {
        return nomeEquipe;
    }

    // Retorna a descrição da equipe
    public String getDescricao() {
        return descricao;
    }
}

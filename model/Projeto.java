// Classe responsável por representar um projeto do sistema
public class Projeto {

    private String nomeProjeto;
    private String status;

    // Construtor da classe
    public Projeto(String nomeProjeto, String status) {
        this.nomeProjeto = nomeProjeto;
        this.status = status;
    }

    // Exibe as informações do projeto
    public void exibirProjeto() {

        System.out.println("Projeto: " + nomeProjeto);
        System.out.println("Status: " + status);
    }
}

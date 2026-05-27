public class Projeto {

    private String nomeProjeto;
    private String status;

    public Projeto(String nomeProjeto, String status) {
        this.nomeProjeto = nomeProjeto;
        this.status = status;
    }

    public void exibirProjeto() {

        System.out.println("Projeto: " + nomeProjeto);
        System.out.println("Status: " + status);
    }
}

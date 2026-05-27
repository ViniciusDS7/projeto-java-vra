public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
            "Carlos Silva",
            "carlos@freaky.com",
            "Gerente",
            "Administrador"
        );

        Projeto projeto = new Projeto(
            "Projeto Freaky",
            "Em andamento"
        );

        Equipe equipe = new Equipe(
            "Freaky Devs",
            "Equipe responsável pelo desenvolvimento"
        );

        ProjetoController controller = new ProjetoController();

        controller.iniciarProjeto();

        System.out.println(usuario.getNome());
        System.out.println(equipe.getNomeEquipe());

        projeto.exibirProjeto();
    }
}

// Classe principal do sistema
public class Main {

    public static void main(String[] args) {

        // Criação dos objetos do sistema
        Usuario usuario = new Usuario(
            "Carlos Silva",
            "carlos@freaky.com",
            "Gerente",
            "Administrador"
        );

        Freaky projeto = new Freaky(
            "Projeto Freaky",
            "Em andamento"
        );

        TeamFreaky equipe = new TeamFreaky(
            "Freaky Devs",
            "Equipe responsável pelo desenvolvimento"
        );

        // Inicialização do sistema
        ProjetoController controller = new ProjetoController();

        controller.iniciarProjeto();

        // Exibição dos dados cadastrados
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Equipe: " + equipe.getNomeEquipe());

        projeto.exibirProjeto();
    }
}

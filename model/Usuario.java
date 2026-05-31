// Classe responsável por representar um usuário do sistema
public class Usuario {

    private String nome;
    private String email;
    private String cargo;
    private String perfil;

    // Construtor da classe
    public Usuario(String nome, String email, String cargo, String perfil) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.perfil = perfil;
    }

    // Métodos de acesso aos atributos
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public String getPerfil() {
        return perfil;
    }
}

package Desafio.NivelDeAcesso.dominio;

public class Usuario {
    private String nome;
    NivelDeAcesso nivelDeAcesso;

    public Usuario(String nome, NivelDeAcesso nivelDeAcesso) {
        this.nome = nome;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public String toString() {
        return "Usuario: " + nome + " | nivelDeAcesso: "+nivelDeAcesso+" - "+nivelDeAcesso.getDescricao();
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Davi",NivelDeAcesso.ADMIN);
        Usuario usuario2 = new Usuario("Caique",NivelDeAcesso.USUARIO);
        Usuario usuario3 = new Usuario("Fernanda",NivelDeAcesso.MODERADOR);

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
    }
}

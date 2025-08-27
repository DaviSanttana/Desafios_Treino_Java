package Desafio.NivelDeAcesso.dominio;

public enum NivelDeAcesso {
    ADMIN("Acesso Total ao sistema"),
    MODERADOR("Pode gerenciar conteúdo e usuários"),
    USUARIO("Acesso limitado ao sistema");

    private  String descricao;

    NivelDeAcesso(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}

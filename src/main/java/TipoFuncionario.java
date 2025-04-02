public enum TipoFuncionario {
    CAIXA(1, "Caixa"),
    VENDEDOR(2, "Vendedor"),
    REPOSITOR(3, "Repositor"),
    SEGURANCA(4, "Segurança"),
    FAXINEIRO(5, "Faxineiro"),
    SAIR(0, "Sair");

    private final int codigo;
    private final String descricao;

    TipoFuncionario(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoFuncionario fromCodigo(int codigo) {
        for (TipoFuncionario tipo : values()) {
            if (tipo.codigo == codigo) {
                return tipo;
            }
        }

        return null;
    }
}
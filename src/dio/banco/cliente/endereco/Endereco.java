package dio.banco.cliente.endereco;

public class Endereco {

    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String complemento;

    public Endereco(String rua, int numero, String cidade, String estado, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }
}

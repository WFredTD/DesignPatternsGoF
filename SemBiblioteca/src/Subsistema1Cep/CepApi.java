package Subsistema1Cep;

public class CepApi {

    private static CepApi intancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getIntancia() {
        return intancia;
    }

    public String recuperarCidade(String cep){
        return "Brasília";
    }

    public String recuperarEstado(String cep){
        return "DF";
    }
}
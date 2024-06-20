package Gof.Facade;

import Subsistema1Cep.CepApi;
import Subsistema2Crm.CrmService;

public class Facade {
    
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getIntancia().recuperarCidade(cep);
        String estado = CepApi.getIntancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

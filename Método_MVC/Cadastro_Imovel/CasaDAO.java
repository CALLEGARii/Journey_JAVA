package Cadastro_Imovel;

public class CasaDAO extends ImovelDTO{
    
    private String mensagem;
    
    public String Mostrar_Dados(CasaDTO casaDTO){
        
        mensagem = "Cadastro Concluído ===== "
                + "\nCidade:> " + casaDTO.getCidade()
                + "\nEndereço:> " + casaDTO.getEndereco()
                + "\nBairro:> " + casaDTO.getBairro()
                + "\nNumero:> " + casaDTO.getNumero()
                + "\nProprietário:> " + casaDTO.getProprietario()
                + "\nQuantidade de Quartos:> " + casaDTO.getN_quartos()
                + "\nQuantidade de Banheiros:> " + casaDTO.getN_banheiros();
        
        return mensagem;
    }
    
}

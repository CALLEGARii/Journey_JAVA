package br.com.avaliacao_2.ctr;
import br.com.avaliacao_2.dao.ConexaoDAO;
import br.com.avaliacao_2.dao.VendaDAO;
import br.com.avaliacao_2.dto.VendaDTO;
import br.com.avaliacao_2.dto.ClienteDTO;
import javax.swing.JTable;

public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public VendaCTR(){ 
        
    }
    
    public String inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos){

        try{
            if(vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos)){
                return "Venda Cadastrada com Sucesso!!! ";
            }else{
                return "Venda Não Cadastrada!!! ";             
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Venda não Cadastrada!!! ";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }        
}

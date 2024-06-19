package br.com.projeto_3.ctr;
import br.com.projeto_3.dao.ConexaoDAO;
import br.com.projeto_3.dao.VendaDAO;
import br.com.projeto_3.dto.VendaDTO;
import br.com.projeto_3.dto.ClienteDTO;
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

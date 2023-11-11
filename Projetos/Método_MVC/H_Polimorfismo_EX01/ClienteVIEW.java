package H_Polimorfismo_EX01;
import javax.swing.JOptionPane;


public class ClienteVIEW {
    
    public static void main(String[] args){
        
    ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();
        
        clienteDTO.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
        clienteDTO.setRg(Integer.parseInt(JOptionPane.showInputDialog("Informe o RG: ")));
        clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade: ")));
        clienteDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura: ")));
        
        JOptionPane.showMessageDialog(null, clienteCTR.Mostrar(clienteDTO));
    }
    
}

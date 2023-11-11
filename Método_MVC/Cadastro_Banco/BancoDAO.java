package Cadastro_Banco;

import javax.swing.JOptionPane;

public class BancoDAO {
    
    private int saldo =0;
    private String mensagem = "";

     public String Mostrar_Dados(BancoDTO bancoDTO){
         
         JOptionPane.showMessageDialog(null, "Dados Cadastrados! " 
         + "\nNome: " + bancoDTO.getNome()
         + "\nSexo: " + bancoDTO.getSexo()
         + "\nCPF: " + bancoDTO.getCpf());
         
         boolean next = true;
         
           while(next){
               
               String opcao = JOptionPane.showInputDialog("Selecione uma Opção! "
                                                    + "\n[1] Depositar " 
                                                    + "\n[2] Sacar "
                                                    + "\n[3] Para Sair ");
               
            switch(opcao){
            
                case "1":
                double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Deposito! "));
                    Depositar(valorDeposito);
                    mensagem = opcao;
                    break;
                    
                case "2":
                    double valorSaque =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar! "));
                    Sacar(valorSaque);
                    mensagem = opcao;
                    break;
                    
                case "3":
                    JOptionPane.showMessageDialog(null, " Saindo do Sistema! ");
                     next = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null," Opção inválida! ");
                    break;
             }
         }
           return " Muito Obrigado! ";
     }
     
        private void Depositar(double valor){
            
            saldo += valor;
          
            JOptionPane.showMessageDialog(null, "Deposito Realizado --- "
                                                              +"\nSaldo" + " R$ " + saldo);
        }
        
        private void Sacar(double valor){
            
            if(valor > saldo){
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente! ");  
            }
            else{
                saldo -= valor;
                JOptionPane.showMessageDialog(null, "Saque Realizado --- "
                                                                  +"\nNovo Saldo " + " R$ " + saldo);
           }
        }  
     }  
package br.com.avaliacao_2.dto;
import java.util.Date;
public class VendaDTO {
    
    private int id_venda, qtde_vend;
    private double val_vend;
    private Date dat_vend;
    private String pg_vend;
    private double TotalVenda;
    

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public double getVal_vend() {
        return val_vend;
    }

    public void setVal_vend(double val_vend) {
        this.val_vend = val_vend;
    }

    public Date getDat_vend() {
        return dat_vend;
    }

    public void setDat_vend(Date dat_vend) {
        this.dat_vend = dat_vend;
    }


    public double getTotalVenda() {
        return TotalVenda;
    }

    public void setTotalVenda(double TotalVenda) {
        this.TotalVenda = TotalVenda;
    }

    public String getPg_vend() {
        return pg_vend;
    }

    public void setPg_vend(String pg_vend) {
        this.pg_vend = pg_vend;
    }

    public int getQtde_vend() {
        return qtde_vend;
    }

    public void setQtde_vend(int qtde_vend) {
        this.qtde_vend = qtde_vend;
    }

       
}

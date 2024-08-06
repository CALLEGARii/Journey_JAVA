package br.com.avaliacao_2.dto;

public class FornecedorDTO {
    
    private String nome_forn, logradouro_forn, bairro_forn, cidade_forn;
    private String estado_forn, cep_forn, cnpj_forn,telefone_forn;
    private int id_forn, numero_forn;

    public String getNome_forn() {
        return nome_forn;
    }
    
    public void setNome_forn(String nome_forn) {
        this.nome_forn = nome_forn;
    }

    public String getTelefone_forn() {
        return telefone_forn;
    }

    public void setTelefone_forn(String telefone_forn) {
        this.telefone_forn = telefone_forn;
    }
    
    public String getLogradouro_forn() {
        return logradouro_forn;
    }

    public void setLogradouro_forn(String logradouro_forn) {
        this.logradouro_forn = logradouro_forn;
    }

    public String getBairro_forn() {
        return bairro_forn;
    }

    public void setBairro_forn(String bairro_forn) {
        this.bairro_forn = bairro_forn;
    }

    public String getCidade_forn() {
        return cidade_forn;
    }

    public void setCidade_forn(String cidade_forn) {
        this.cidade_forn = cidade_forn;
    }

    public String getEstado_forn() {
        return estado_forn;
    }

    public void setEstado_forn(String estado_forn) {
        this.estado_forn = estado_forn;
    }

    public String getCep_forn() {
        return cep_forn;
    }

    public void setCep_forn(String cep_forn) {
        this.cep_forn = cep_forn;
    }

    public String getCnpj_forn() {
        return cnpj_forn;
    }

    public void setCnpj_forn(String cnpj_forn) {
        this.cnpj_forn = cnpj_forn;
    }

    public int getId_forn() {
        return id_forn;
    }

    public void setId_forn(int id_forn) {
        this.id_forn = id_forn;
    }

    public int getNumero_forn() {
        return numero_forn;
    }

    public void setNumero_forn(int numero_forn) {
        this.numero_forn = numero_forn;
    }
}

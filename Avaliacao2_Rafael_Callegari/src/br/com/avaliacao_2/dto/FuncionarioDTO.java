package br.com.avaliacao_2.dto;

public class FuncionarioDTO {
    
    private String nome_fun, cpf_fun, tipo_fun;
    private String login_fun, senha_fun;
    private int id_fun;

    public String getNome_fun() {
        return nome_fun;
    }

    public void setNome_fun(String nome_fun) {
        this.nome_fun = nome_fun;
    }

    public String getCpf_fun() {
        return cpf_fun;
    }

    public void setCpf_fun(String cpf_fun) {
        this.cpf_fun = cpf_fun;
    }

    public String getTipo_fun() {
        return tipo_fun;
    }

    public void setTipo_fun(String tipo_fun) {
        this.tipo_fun = tipo_fun;
    }

    public String getLogin_fun() {
        return login_fun;
    }

    public void setLogin_fun(String login_fun) {
        this.login_fun = login_fun;
    }

    public String getSenha_fun() {
        return senha_fun;
    }

    public void setSenha_fun(String senha_fun) {
        this.senha_fun = senha_fun;
    }

    public int getId_fun() {
        return id_fun;
    }

    public void setId_fun(int id_fun) {
        this.id_fun = id_fun;
    }   
}

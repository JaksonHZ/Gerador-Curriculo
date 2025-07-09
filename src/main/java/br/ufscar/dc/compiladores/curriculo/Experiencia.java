package br.ufscar.dc.compiladores.curriculo;

import java.util.List;

public class Experiencia {
    private String empresa;
    private String cargo;
    private String inicio;
    private boolean atual;
    private String descricao;
    private List<String> tecnologias;
    
    // Getters e Setters
    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    
    public String getInicio() { return inicio; }
    public void setInicio(String inicio) { this.inicio = inicio; }
    
    public boolean isAtual() { return atual; }
    public void setAtual(boolean atual) { this.atual = atual; }
    
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    
    public List<String> getTecnologias() { return tecnologias; }
    public void setTecnologias(List<String> tecnologias) { this.tecnologias = tecnologias; }
} 
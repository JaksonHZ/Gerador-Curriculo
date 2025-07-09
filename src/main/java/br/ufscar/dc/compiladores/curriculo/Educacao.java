package br.ufscar.dc.compiladores.curriculo;

public class Educacao {
    private String instituicao;
    private String curso;
    private String nivel;
    private String inicio;
    private String fim;
    private boolean concluido;
    private float nota;
    
    // Getters e Setters
    public String getInstituicao() { return instituicao; }
    public void setInstituicao(String instituicao) { this.instituicao = instituicao; }
    
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    
    public String getInicio() { return inicio; }
    public void setInicio(String inicio) { this.inicio = inicio; }
    
    public String getFim() { return fim; }
    public void setFim(String fim) { this.fim = fim; }
    
    public boolean isConcluido() { return concluido; }
    public void setConcluido(boolean concluido) { this.concluido = concluido; }
    
    public float getNota() { return nota; }
    public void setNota(float nota) { this.nota = nota; }
} 
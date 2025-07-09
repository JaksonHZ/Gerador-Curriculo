package br.ufscar.dc.compiladores.curriculo;

import java.util.ArrayList;
import java.util.List;

public class DadosCurriculo {
    private String nomeArquivo;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String linkedin;
    private String github;
    
    private List<Educacao> educacoes = new ArrayList<>();
    private List<Experiencia> experiencias = new ArrayList<>();
    private List<Habilidade> habilidades = new ArrayList<>();
    private List<Idioma> idiomas = new ArrayList<>();
    
    // Getters e Setters
    public String getNomeArquivo() { return nomeArquivo; }
    public void setNomeArquivo(String nomeArquivo) { this.nomeArquivo = nomeArquivo; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    
    public String getLinkedin() { return linkedin; }
    public void setLinkedin(String linkedin) { this.linkedin = linkedin; }
    
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    
    public List<Educacao> getEducacoes() { return educacoes; }
    public List<Experiencia> getExperiencias() { return experiencias; }
    public List<Habilidade> getHabilidades() { return habilidades; }
    public List<Idioma> getIdiomas() { return idiomas; }
    
    // Métodos para adicionar dados
    public void adicionarEducacao(Educacao educacao) {
        educacoes.add(educacao);
    }
    
    public void adicionarExperiencia(Experiencia experiencia) {
        experiencias.add(experiencia);
    }
    
    public void adicionarHabilidade(Habilidade habilidade) {
        habilidades.add(habilidade);
    }
    
    public void adicionarIdioma(Idioma idioma) {
        idiomas.add(idioma);
    }
} 
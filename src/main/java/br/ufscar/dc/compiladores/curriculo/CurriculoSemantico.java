package br.ufscar.dc.compiladores.curriculo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CurriculoSemantico extends CurriculoBaseVisitor<Void> {
    
    private List<String> erros = new ArrayList<>();
    private DadosCurriculo dadosCurriculo = new DadosCurriculo();
    
    public List<String> getErros() {
        return erros;
    }
    
    public DadosCurriculo getDadosCurriculo() {
        return dadosCurriculo;
    }
    
    @Override
    public Void visitPrograma(CurriculoParser.ProgramaContext ctx) {
        // Visita o currículo principal
        if (ctx.curriculo() != null) {
            visitCurriculo(ctx.curriculo());
        }
        
        // Visita todas as seções
        for (CurriculoParser.SecoesContext secao : ctx.secoes()) {
            if (secao.secao_educacao() != null) {
                visitSecaoEducacao(secao.secao_educacao());
            } else if (secao.secao_experiencia() != null) {
                visitSecaoExperiencia(secao.secao_experiencia());
            } else if (secao.secao_habilidades() != null) {
                visitSecaoHabilidades(secao.secao_habilidades());
            } else if (secao.secao_idiomas() != null) {
                visitSecaoIdiomas(secao.secao_idiomas());
            }
        }
        
        return null;
    }
    
    @Override
    public Void visitCurriculo(CurriculoParser.CurriculoContext ctx) {
        dadosCurriculo.setNomeArquivo(ctx.IDENT().getText());
        
        // Visita todos os campos do currículo
        for (CurriculoParser.Campo_curriculoContext campo : ctx.campos_curriculo().campo_curriculo()) {
            visitCampoCurriculo(campo);
        }
        
        return null;
    }
    
    public Void visitCampoCurriculo(CurriculoParser.Campo_curriculoContext ctx) {
        String valor = removerAspas(ctx.STRING().getText());
        
        if (ctx.NOME() != null) {
            dadosCurriculo.setNome(valor);
        } else if (ctx.EMAIL() != null) {
            if (!validarEmail(valor)) {
                erros.add("Erro semântico: Email inválido - " + valor);
            }
            dadosCurriculo.setEmail(valor);
        } else if (ctx.TELEFONE() != null) {
            dadosCurriculo.setTelefone(valor);
        } else if (ctx.ENDERECO() != null) {
            dadosCurriculo.setEndereco(valor);
        } else if (ctx.LINKEDIN() != null) {
            if (!validarLinkedIn(valor)) {
                erros.add("Erro semântico: LinkedIn inválido - " + valor);
            }
            dadosCurriculo.setLinkedin(valor);
        } else if (ctx.GITHUB() != null) {
            if (!validarGitHub(valor)) {
                erros.add("Erro semântico: GitHub inválido - " + valor);
            }
            dadosCurriculo.setGithub(valor);
        }
        
        return null;
    }
    
    public Void visitSecaoEducacao(CurriculoParser.Secao_educacaoContext ctx) {
        for (CurriculoParser.Educacao_itemContext item : ctx.educacao_item()) {
            visitEducacaoItem(item);
        }
        return null;
    }
    
    public Void visitEducacaoItem(CurriculoParser.Educacao_itemContext ctx) {
        Educacao educacao = new Educacao();
        
        for (CurriculoParser.Campo_educacaoContext campo : ctx.campos_educacao().campo_educacao()) {
            visitCampoEducacao(campo, educacao);
        }
        
        // Validação de datas
        if (educacao.getInicio() != null && educacao.getFim() != null && educacao.isConcluido()) {
            if (!validarDatas(educacao.getInicio(), educacao.getFim())) {
                erros.add("Erro semântico: Data de fim deve ser posterior à data de início - " + 
                         educacao.getInicio() + " a " + educacao.getFim());
            }
        }
        
        dadosCurriculo.adicionarEducacao(educacao);
        return null;
    }
    
    public Void visitCampoEducacao(CurriculoParser.Campo_educacaoContext ctx, Educacao educacao) {
        if (ctx.INSTITUICAO() != null) {
            educacao.setInstituicao(removerAspas(ctx.STRING().getText()));
        } else if (ctx.CURSO() != null) {
            educacao.setCurso(removerAspas(ctx.STRING().getText()));
        } else if (ctx.NIVEL() != null) {
            educacao.setNivel(ctx.nivel_educacao().getText());
        } else if (ctx.INICIO() != null) {
            educacao.setInicio(removerAspas(ctx.STRING().getText()));
        } else if (ctx.FIM() != null) {
            educacao.setFim(removerAspas(ctx.STRING().getText()));
        } else if (ctx.CONCLUIDO() != null) {
            educacao.setConcluido(ctx.valor_booleano().getText().equals("true"));
        } else if (ctx.NOTA() != null) {
            educacao.setNota(Float.parseFloat(ctx.numero().getText()));
        }
        
        return null;
    }
    
    public Void visitSecaoExperiencia(CurriculoParser.Secao_experienciaContext ctx) {
        for (CurriculoParser.Experiencia_itemContext item : ctx.experiencia_item()) {
            visitExperienciaItem(item);
        }
        return null;
    }
    
    public Void visitExperienciaItem(CurriculoParser.Experiencia_itemContext ctx) {
        Experiencia experiencia = new Experiencia();
        
        for (CurriculoParser.Campo_experienciaContext campo : ctx.campos_experiencia().campo_experiencia()) {
            visitCampoExperiencia(campo, experiencia);
        }
        
        dadosCurriculo.adicionarExperiencia(experiencia);
        return null;
    }
    
    public Void visitCampoExperiencia(CurriculoParser.Campo_experienciaContext ctx, Experiencia experiencia) {
        if (ctx.EMPRESA() != null) {
            experiencia.setEmpresa(removerAspas(ctx.STRING().getText()));
        } else if (ctx.CARGO() != null) {
            experiencia.setCargo(removerAspas(ctx.STRING().getText()));
        } else if (ctx.INICIO() != null) {
            experiencia.setInicio(removerAspas(ctx.STRING().getText()));
        } else if (ctx.ATUAL() != null) {
            experiencia.setAtual(ctx.valor_booleano().getText().equals("true"));
        } else if (ctx.DESCRICAO() != null) {
            experiencia.setDescricao(removerAspas(ctx.STRING().getText()));
        } else if (ctx.TECNOLOGIAS() != null) {
            experiencia.setTecnologias(extrairListaStrings(ctx.lista_strings()));
        }
        
        return null;
    }
    
    public Void visitSecaoHabilidades(CurriculoParser.Secao_habilidadesContext ctx) {
        for (CurriculoParser.Habilidade_itemContext item : ctx.habilidade_item()) {
            visitHabilidadeItem(item);
        }
        return null;
    }
    
    public Void visitHabilidadeItem(CurriculoParser.Habilidade_itemContext ctx) {
        Habilidade habilidade = new Habilidade();
        
        for (CurriculoParser.Campo_habilidadeContext campo : ctx.campos_habilidade().campo_habilidade()) {
            visitCampoHabilidade(campo, habilidade);
        }
        
        dadosCurriculo.adicionarHabilidade(habilidade);
        return null;
    }
    
    public Void visitCampoHabilidade(CurriculoParser.Campo_habilidadeContext ctx, Habilidade habilidade) {
        if (ctx.NOME() != null) {
            habilidade.setNome(removerAspas(ctx.STRING().getText()));
        } else if (ctx.NIVEL() != null) {
            habilidade.setNivel(ctx.nivel_habilidade().getText());
        } else if (ctx.CATEGORIA() != null) {
            habilidade.setCategoria(removerAspas(ctx.STRING().getText()));
        }
        
        return null;
    }
    
    public Void visitSecaoIdiomas(CurriculoParser.Secao_idiomasContext ctx) {
        for (CurriculoParser.Idioma_itemContext item : ctx.idioma_item()) {
            visitIdiomaItem(item);
        }
        return null;
    }
    
    public Void visitIdiomaItem(CurriculoParser.Idioma_itemContext ctx) {
        Idioma idioma = new Idioma();
        
        for (CurriculoParser.Campo_idiomaContext campo : ctx.campos_idioma().campo_idioma()) {
            visitCampoIdioma(campo, idioma);
        }
        
        dadosCurriculo.adicionarIdioma(idioma);
        return null;
    }
    
    public Void visitCampoIdioma(CurriculoParser.Campo_idiomaContext ctx, Idioma idioma) {
        if (ctx.NOME() != null) {
            idioma.setNome(removerAspas(ctx.STRING().getText()));
        } else if (ctx.NIVEL() != null) {
            idioma.setNivel(ctx.nivel_habilidade().getText());
        }
        
        return null;
    }
    
    // Métodos auxiliares para validação
    private String removerAspas(String texto) {
        return texto.substring(1, texto.length() - 1);
    }
    
    private boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex, email);
    }
    
    private boolean validarLinkedIn(String linkedin) {
        return linkedin.startsWith("https://linkedin.com/") || 
               linkedin.startsWith("https://www.linkedin.com/");
    }
    
    private boolean validarGitHub(String github) {
        return github.startsWith("https://github.com/");
    }
    
    private boolean validarDatas(String inicio, String fim) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataInicio = LocalDate.parse(inicio, formatter);
            LocalDate dataFim = LocalDate.parse(fim, formatter);
            return dataFim.isAfter(dataInicio);
        } catch (DateTimeParseException e) {
            erros.add("Erro semântico: Formato de data inválido - " + inicio + " ou " + fim);
            return false;
        }
    }
    
    private List<String> extrairListaStrings(CurriculoParser.Lista_stringsContext ctx) {
        List<String> lista = new ArrayList<>();
        if (ctx.STRING() != null) {
            for (var token : ctx.STRING()) {
                lista.add(removerAspas(token.getText()));
            }
        }
        return lista;
    }
} 
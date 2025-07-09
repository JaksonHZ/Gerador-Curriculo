package br.ufscar.dc.compiladores.curriculo;

import java.util.List;

public class GeradorHTML {
    
    public String gerarHTML(CurriculoParser.ProgramaContext ctx) {
        // Primeiro, vamos coletar os dados usando o analisador semântico
        CurriculoSemantico semantico = new CurriculoSemantico();
        semantico.visitPrograma(ctx);
        DadosCurriculo dados = semantico.getDadosCurriculo();
        
        StringBuilder html = new StringBuilder();
        
        // Cabeçalho HTML
        html.append("<!DOCTYPE html>\n");
        html.append("<html lang=\"pt-BR\">\n");
        html.append("<head>\n");
        html.append("    <meta charset=\"UTF-8\">\n");
        html.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        html.append("    <title>").append(dados.getNome()).append(" - Currículo</title>\n");
        html.append("    <style>\n");
        html.append("        body { font-family: Arial, sans-serif; line-height: 1.6; margin: 0; padding: 20px; }\n");
        html.append("        .container { max-width: 800px; margin: 0 auto; }\n");
        html.append("        h1 { color: #2c3e50; border-bottom: 3px solid #3498db; padding-bottom: 10px; }\n");
        html.append("        h2 { color: #34495e; margin-top: 30px; border-left: 4px solid #3498db; padding-left: 15px; }\n");
        html.append("        .info-pessoal { background-color: #f8f9fa; padding: 20px; border-radius: 5px; margin-bottom: 20px; }\n");
        html.append("        .info-pessoal p { margin: 5px 0; }\n");
        html.append("        .secao { margin-bottom: 30px; }\n");
        html.append("        .item { margin-bottom: 20px; padding: 15px; border-left: 3px solid #ecf0f1; }\n");
        html.append("        .item h3 { margin: 0 0 10px 0; color: #2c3e50; }\n");
        html.append("        .item p { margin: 5px 0; }\n");
        html.append("        .tecnologias { display: flex; flex-wrap: wrap; gap: 5px; }\n");
        html.append("        .tag { background-color: #3498db; color: white; padding: 3px 8px; border-radius: 12px; font-size: 0.9em; }\n");
        html.append("        .nivel { font-weight: bold; color: #27ae60; }\n");
        html.append("        .data { color: #7f8c8d; font-style: italic; }\n");
        html.append("        a { color: #3498db; text-decoration: none; }\n");
        html.append("        a:hover { text-decoration: underline; }\n");
        html.append("    </style>\n");
        html.append("</head>\n");
        html.append("<body>\n");
        html.append("    <div class=\"container\">\n");
        
        // Informações pessoais
        html.append("        <h1>").append(dados.getNome()).append("</h1>\n");
        html.append("        <div class=\"info-pessoal\">\n");
        if (dados.getEmail() != null) {
            html.append("            <p><strong>Email:</strong> <a href=\"mailto:").append(dados.getEmail()).append("\">").append(dados.getEmail()).append("</a></p>\n");
        }
        if (dados.getTelefone() != null) {
            html.append("            <p><strong>Telefone:</strong> ").append(dados.getTelefone()).append("</p>\n");
        }
        if (dados.getEndereco() != null) {
            html.append("            <p><strong>Endereço:</strong> ").append(dados.getEndereco()).append("</p>\n");
        }
        if (dados.getLinkedin() != null) {
            html.append("            <p><strong>LinkedIn:</strong> <a href=\"").append(dados.getLinkedin()).append("\" target=\"_blank\">").append(dados.getLinkedin()).append("</a></p>\n");
        }
        if (dados.getGithub() != null) {
            html.append("            <p><strong>GitHub:</strong> <a href=\"").append(dados.getGithub()).append("\" target=\"_blank\">").append(dados.getGithub()).append("</a></p>\n");
        }
        html.append("        </div>\n");
        
        // Seção de Educação
        if (!dados.getEducacoes().isEmpty()) {
            html.append("        <div class=\"secao\">\n");
            html.append("            <h2>Educação</h2>\n");
            for (Educacao educacao : dados.getEducacoes()) {
                html.append("            <div class=\"item\">\n");
                html.append("                <h3>").append(educacao.getInstituicao()).append("</h3>\n");
                html.append("                <p><strong>").append(educacao.getCurso()).append("</strong> - ").append(educacao.getNivel()).append("</p>\n");
                if (educacao.getInicio() != null && educacao.getFim() != null) {
                    html.append("                <p class=\"data\">").append(educacao.getInicio()).append(" a ").append(educacao.getFim()).append("</p>\n");
                }
                if (educacao.getNota() > 0) {
                    html.append("                <p><strong>Nota:</strong> ").append(educacao.getNota()).append("/10</p>\n");
                }
                if (educacao.isConcluido()) {
                    html.append("                <p><strong>Status:</strong> Concluído</p>\n");
                } else {
                    html.append("                <p><strong>Status:</strong> Em andamento</p>\n");
                }
                html.append("            </div>\n");
            }
            html.append("        </div>\n");
        }
        
        // Seção de Experiência
        if (!dados.getExperiencias().isEmpty()) {
            html.append("        <div class=\"secao\">\n");
            html.append("            <h2>Experiência Profissional</h2>\n");
            for (Experiencia experiencia : dados.getExperiencias()) {
                html.append("            <div class=\"item\">\n");
                html.append("                <h3>").append(experiencia.getCargo()).append("</h3>\n");
                html.append("                <p><strong>").append(experiencia.getEmpresa()).append("</strong></p>\n");
                if (experiencia.getInicio() != null) {
                    if (experiencia.isAtual()) {
                        html.append("                <p class=\"data\">").append(experiencia.getInicio()).append(" - Atual</p>\n");
                    } else {
                        html.append("                <p class=\"data\">").append(experiencia.getInicio()).append("</p>\n");
                    }
                }
                if (experiencia.getDescricao() != null) {
                    html.append("                <p>").append(experiencia.getDescricao()).append("</p>\n");
                }
                if (experiencia.getTecnologias() != null && !experiencia.getTecnologias().isEmpty()) {
                    html.append("                <div class=\"tecnologias\">\n");
                    for (String tecnologia : experiencia.getTecnologias()) {
                        html.append("                    <span class=\"tag\">").append(tecnologia).append("</span>\n");
                    }
                    html.append("                </div>\n");
                }
                html.append("            </div>\n");
            }
            html.append("        </div>\n");
        }
        
        // Seção de Habilidades
        if (!dados.getHabilidades().isEmpty()) {
            html.append("        <div class=\"secao\">\n");
            html.append("            <h2>Habilidades</h2>\n");
            for (Habilidade habilidade : dados.getHabilidades()) {
                html.append("            <div class=\"item\">\n");
                html.append("                <h3>").append(habilidade.getNome()).append("</h3>\n");
                html.append("                <p><span class=\"nivel\">").append(habilidade.getNivel()).append("</span></p>\n");
                if (habilidade.getCategoria() != null) {
                    html.append("                <p><strong>Categoria:</strong> ").append(habilidade.getCategoria()).append("</p>\n");
                }
                html.append("            </div>\n");
            }
            html.append("        </div>\n");
        }
        
        // Seção de Idiomas
        if (!dados.getIdiomas().isEmpty()) {
            html.append("        <div class=\"secao\">\n");
            html.append("            <h2>Idiomas</h2>\n");
            for (Idioma idioma : dados.getIdiomas()) {
                html.append("            <div class=\"item\">\n");
                html.append("                <h3>").append(idioma.getNome()).append("</h3>\n");
                html.append("                <p><span class=\"nivel\">").append(idioma.getNivel()).append("</span></p>\n");
                html.append("            </div>\n");
            }
            html.append("        </div>\n");
        }
        
        // Fechamento HTML
        html.append("    </div>\n");
        html.append("</body>\n");
        html.append("</html>");
        
        return html.toString();
    }
} 
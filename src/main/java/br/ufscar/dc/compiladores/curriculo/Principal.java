package br.ufscar.dc.compiladores.curriculo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.out.println("Uso: java -jar curriculo-compilador.jar <arquivo_entrada>");
                return;
            }

            String arquivoEntrada = args[0];
            String arquivoSaida = arquivoEntrada.replaceAll("\\.curriculo$", ".pdf");
            
            // Análise léxica
            CurriculoLexer lexer = new CurriculoLexer(CharStreams.fromFileName(arquivoEntrada));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Análise sintática
            CurriculoParser parser = new CurriculoParser(tokens);
            CurriculoParser.ProgramaContext arvore = parser.programa();
            
            // Análise semântica
            CurriculoSemantico semantico = new CurriculoSemantico();
            semantico.visitPrograma(arvore);
            
            if (semantico.getErros().isEmpty()) {
                // Geração de código HTML
                GeradorHTML gerador = new GeradorHTML();
                String html = gerador.gerarHTML(arvore);
                
                // Geração do PDF a partir do HTML
                GeradorPDF geradorPDF = new GeradorPDF();
                geradorPDF.gerarPDF(html, arquivoSaida);
                
                System.out.println("Compilação realizada com sucesso!");
                System.out.println("Arquivo PDF gerado: " + arquivoSaida);
            } else {
                System.out.println("Erros semânticos encontrados:");
                for (String erro : semantico.getErros()) {
                    System.out.println(erro);
                }
            }
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro durante a compilação: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 
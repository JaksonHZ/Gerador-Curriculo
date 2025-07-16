# Compilador de Currículos - Linguagem Declarativa

Jakson Huang - 811773 <br>
Gustavo Lamin - 811716 <br>
Vitor Vechin - 812287 <br>

## Vídeo de apresentação do gerador de curriculo

https://github.com/user-attachments/assets/f5ef8830-c09e-48ea-8614-4166da2c426d

Este projeto implementa um compilador para uma linguagem declarativa de currículos, desenvolvido em Java usando ANTLR4. O compilador analisa arquivos de entrada em formato declarativo e gera currículos em PDF formatado.

## 🎯 Objetivo

O compilador foi desenvolvido para:
- Fazer análise léxica e sintática usando ANTLR4
- Realizar análise semântica com validações
- Gerar PDF formatado como saída
- Manter estrutura simples e funcional

## 📋 Linguagem de Entrada

A linguagem declarativa de currículos permite definir currículos de forma estruturada com as seguintes seções:

### Estrutura Básica
```
CURRICULO <nome_arquivo> {
    nome: "Nome Completo";
    email: "email@exemplo.com";
    telefone: "(11) 99999-9999";
    endereco: "Cidade, Estado";
    linkedin: "https://linkedin.com/in/perfil";
    github: "https://github.com/usuario";
}
```

### Seções Disponíveis

#### 1. Educação
```
SECAO educacao {
    educacao {
        instituicao: "Nome da Instituição";
        curso: "Nome do Curso";
        nivel: GRADUACAO | POS_GRADUACAO | TECNICO;
        inicio: "01/03/2018";
        fim: "15/12/2022";
        concluido: true | false;
        nota: 8.5;
    }
}
```

#### 2. Experiência Profissional
```
SECAO experiencia {
    experiencia {
        empresa: "Nome da Empresa";
        cargo: "Cargo Ocupado";
        inicio: "01/03/2023";
        atual: true | false;
        descricao: "Descrição das atividades";
        tecnologias: ["Tecnologia1", "Tecnologia2"];
    }
}
```

#### 3. Habilidades
```
SECAO habilidades {
    habilidade {
        nome: "Nome da Habilidade";
        nivel: AVANCADO | INTERMEDIARIO | BASICO;
        categoria: "Categoria da Habilidade";
    }
}
```

#### 4. Idiomas
```
SECAO idiomas {
    idioma {
        nome: "Nome do Idioma";
        nivel: AVANCADO | INTERMEDIARIO | BASICO;
    }
}
```

## ✅ Validações Semânticas

O compilador realiza as seguintes verificações semânticas:

1. **Validação de Email**: Verifica se o formato do email é válido
2. **Validação de LinkedIn**: Verifica se o link do LinkedIn tem formato correto
3. **Validação de GitHub**: Verifica se o link do GitHub tem formato correto
4. **Validação de Datas**: Verifica se datas de fim são posteriores às datas de início
5. **Validação de Níveis**: Verifica se os níveis especificados são válidos

## 🛠️ Como Compilar e Executar

### Pré-requisitos
- Java 8 ou superior
- Maven 3.6 ou superior

### Compilação
```bash
# Navegue até o diretório do projeto
cd T6/curriculo-compilador

# Compile o projeto
mvn clean compile

# Gere o JAR executável
mvn package
```

### Execução
```bash
# Execute o compilador com um arquivo de entrada
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar arquivo.curriculo
```

### Script de Execução
```bash
# Use o script fornecido para compilar e executar automaticamente
./run.sh
```

## 📄 Exemplo de Uso

### Arquivo de Entrada (exemplo.curriculo)
```
CURRICULO JoaoSilva {
    nome: "João Silva";
    email: "joao.silva@email.com";
    telefone: "(11) 99999-9999";
    endereco: "São Paulo, SP";
    linkedin: "https://linkedin.com/in/joaosilva";
    github: "https://github.com/joaosilva";
}

SECAO educacao {
    educacao {
        instituicao: "Universidade de São Paulo";
        curso: "Ciência da Computação";
        nivel: GRADUACAO;
        inicio: "01/03/2018";
        fim: "15/12/2022";
        concluido: true;
        nota: 8.5;
    }
}

SECAO experiencia {
    experiencia {
        empresa: "TechCorp";
        cargo: "Desenvolvedor Full Stack";
        inicio: "01/03/2023";
        atual: true;
        descricao: "Desenvolvimento de aplicações web usando React, Node.js e PostgreSQL.";
        tecnologias: ["React", "Node.js", "PostgreSQL"];
    }
}

SECAO habilidades {
    habilidade {
        nome: "Java";
        nivel: AVANCADO;
        categoria: "Linguagens de Programação";
    }
}

SECAO idiomas {
    idioma {
        nome: "Inglês";
        nivel: AVANCADO;
    }
}
```

### Saída PDF
O compilador gera um arquivo PDF (`exemplo.pdf`) com o currículo formatado, incluindo:
- Informações pessoais
- Seção de educação
- Experiência profissional
- Habilidades técnicas
- Idiomas
- **Tecnologias** (com referências cruzadas para as experiências)

## Referências Cruzadas de Tecnologias

A partir da versão atual, o PDF gerado pelo compilador inclui uma seção especial chamada **Tecnologias** ao final do currículo. Nessa seção, todas as tecnologias utilizadas nas experiências profissionais são listadas, acompanhadas de referências (links) para as experiências onde cada tecnologia foi aplicada.

- Cada tecnologia aparece com números entre parênteses, por exemplo: `React (1), (2)`.
- Cada número é um link que leva diretamente à experiência correspondente no PDF.
- As experiências são numeradas na ordem em que aparecem no currículo.

### Exemplo de saída da seção Tecnologias

```
Tecnologias
- React (1), (2)
- Node.js (2), (3)
- JavaScript (1)
- PostgreSQL (3)
```

Ao clicar em `(1)`, `(2)`, etc., você será levado à experiência correspondente.

---

## 🏗️ Estrutura do Projeto

```
curriculo-compilador/
├── src/
│   └── main/
│       ├── antlr4/
│       │   └── br/ufscar/dc/compiladores/curriculo/
│       │       └── Curriculo.g4                    # Gramática ANTLR4
│       └── java/
│           └── br/ufscar/dc/compiladores/curriculo/
│               ├── Principal.java                   # Classe principal
│               ├── CurriculoSemantico.java          # Análise semântica
│               ├── GeradorHTML.java                 # Geração de HTML
│               ├── DadosCurriculo.java              # Estrutura de dados
│               ├── Educacao.java                    # Classe de educação
│               ├── Experiencia.java                 # Classe de experiência
│               ├── Habilidade.java                  # Classe de habilidades
│               └── Idioma.java                      # Classe de idiomas
├── pom.xml                                          # Configuração Maven
├── run.sh                                           # Script de execução
├── exemplo.curriculo                                # Arquivo de exemplo
└── README.md                                        # Documentação
```

## 🔧 Tecnologias Utilizadas

- **Java 8**: Linguagem de programação principal
- **ANTLR4**: Geração de analisadores léxicos e sintáticos
- **Maven**: Gerenciamento de dependências e build
- **OpenHTMLtoPDF**: Conversão de HTML para PDF

## 📝 Casos de Teste

O projeto inclui uma suíte completa de testes para validar todas as funcionalidades:

### 🧪 **Testes Incluídos**

#### **Testes Válidos**
- `exemplo.curriculo` - Exemplo básico funcional
- `testes/teste_valido_completo.curriculo` - Currículo completo com todas as seções
- `testes/teste_casos_especiais.curriculo` - Casos especiais e edge cases

#### **Testes de Erros**
- `teste_erros.curriculo` - Erros semânticos básicos
- `testes/teste_semantico_completo.curriculo` - Múltiplos erros semânticos
- `testes/teste_sintatico_erros.curriculo` - Erros de sintaxe
- `testes/teste_lexico_erros.curriculo` - Erros léxicos

### 🚀 **Execução dos Testes**

#### **Execução Individual**
```bash
# Teste válido
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_valido_completo.curriculo

# Teste com erros semânticos
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_semantico_completo.curriculo

# Teste com erros sintáticos
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_sintatico_erros.curriculo
```

#### **Execução Automática**
```bash
# Executar todos os testes
./executar_testes.sh
```

## 🚀 Funcionalidades

- **Análise Léxica**: Reconhecimento de tokens da linguagem
- **Análise Sintática**: Verificação da estrutura gramatical
- **Análise Semântica**: Validação de regras de negócio
- **Geração de Código**: Produção de HTML formatado
- **Tratamento de Erros**: Mensagens claras de erro

## 📞 Suporte

Para dúvidas ou problemas, contatar [JaksonHZ](https://github.com/JaksonHZ), [Gustavo Honda](https://github.com/gustavolhonda), [Vitor Vechin](https://github.com/vitorvechin). 

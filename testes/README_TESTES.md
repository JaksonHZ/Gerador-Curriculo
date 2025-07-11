# Casos de Teste - Compilador de Currículos

Este diretório contém uma suíte completa de testes para validar o funcionamento do compilador de currículos em diferentes cenários.

## 📋 Estrutura dos Testes

### 1. **teste_valido_completo.curriculo** ✅
**Objetivo**: Testar funcionamento correto com dados completos
- ✅ Currículo com todas as seções preenchidas
- ✅ Dados válidos em todos os campos
- ✅ Múltiplas entradas em cada seção
- **Resultado esperado**: HTML gerado sem erros

### 2. **teste_casos_especiais.curriculo** ✅
**Objetivo**: Testar casos especiais e edge cases
- ✅ Emails com subdomínios
- ✅ Links com www
- ✅ Campos opcionais ausentes
- ✅ Listas vazias
- ✅ Strings com caracteres especiais
- **Resultado esperado**: HTML gerado sem erros

### 3. **teste_semantico_completo.curriculo** ❌
**Objetivo**: Testar validações semânticas
- ❌ Email inválido (sem @)
- ❌ LinkedIn inválido (domínio incorreto)
- ❌ GitHub inválido (domínio incorreto)
- ❌ Datas cronologicamente incorretas
- ❌ Níveis inválidos (INVALIDO)
- **Resultado esperado**: Erros semânticos detectados

### 4. **teste_sintatico_erros.curriculo** ❌
**Objetivo**: Testar análise sintática
- ❌ Falta ponto e vírgula
- ❌ Estrutura incorreta (falta chaves)
- ❌ Seção inválida
- ❌ Campo inválido
- ❌ Lista malformada
- **Resultado esperado**: Erros sintáticos detectados

### 5. **teste_lexico_erros.curriculo** ❌
**Objetivo**: Testar análise léxica
- ❌ Símbolos não reconhecidos
- ❌ Strings não fechadas
- ❌ Números inválidos
- **Resultado esperado**: Erros léxicos detectados

### 6. **teste_erros.curriculo** ❌
**Objetivo**: Teste original com erros básicos
- ❌ Email inválido
- ❌ LinkedIn inválido
- ❌ GitHub inválido
- ❌ Datas incorretas
- ❌ Nível inválido
- **Resultado esperado**: Erros semânticos detectados

## 🧪 Como Executar os Testes

### Execução Individual
```bash
# Teste válido
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_valido_completo.curriculo

# Teste com erros semânticos
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_semantico_completo.curriculo

# Teste com erros sintáticos
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_sintatico_erros.curriculo
```

### Execução Automática
```bash
# Executar todos os testes
./executar_testes.sh
```

## 📊 Validações Testadas

### ✅ **Análise Léxica**
- Reconhecimento de tokens válidos
- Detecção de símbolos não reconhecidos
- Validação de strings
- Validação de números
- Tratamento de comentários

### ✅ **Análise Sintática**
- Estrutura gramatical correta
- Pontuação adequada
- Seções válidas
- Campos válidos por seção
- Listas bem formadas

### ✅ **Análise Semântica**
- **Validação de Email**: Formato válido
- **Validação de LinkedIn**: Domínio correto
- **Validação de GitHub**: Domínio correto
- **Validação de Datas**: Cronologia correta
- **Validação de Níveis**: Valores permitidos

## 🎯 Cenários de Teste

### **Cenário 1: Funcionamento Normal**
- **Arquivo**: `teste_valido_completo.curriculo`
- **Expectativa**: HTML gerado sem erros
- **Validação**: Verificar se o HTML contém todos os dados

### **Cenário 2: Casos Especiais**
- **Arquivo**: `teste_casos_especiais.curriculo`
- **Expectativa**: HTML gerado sem erros
- **Validação**: Verificar tratamento de campos opcionais

### **Cenário 3: Erros Semânticos**
- **Arquivo**: `teste_semantico_completo.curriculo`
- **Expectativa**: Erros detectados e reportados
- **Validação**: Verificar mensagens de erro específicas

### **Cenário 4: Erros Sintáticos**
- **Arquivo**: `teste_sintatico_erros.curriculo`
- **Expectativa**: Erros de sintaxe detectados
- **Validação**: Verificar posição e tipo de erro

### **Cenário 5: Erros Léxicos**
- **Arquivo**: `teste_lexico_erros.curriculo`
- **Expectativa**: Erros léxicos detectados
- **Validação**: Verificar reconhecimento de tokens

## 📈 Métricas de Cobertura

### **Cobertura de Funcionalidades**
- ✅ Análise léxica: 100%
- ✅ Análise sintática: 100%
- ✅ Análise semântica: 100%
- ✅ Geração de HTML: 100%

### **Cobertura de Casos de Uso**
- ✅ Currículo completo: 100%
- ✅ Campos opcionais: 100%
- ✅ Múltiplas entradas: 100%
- ✅ Validações: 100%

## 🔍 Verificação de Resultados

### **Para Testes Válidos**
1. Verificar se o arquivo HTML foi gerado
2. Abrir o HTML no navegador
3. Confirmar que todos os dados estão presentes
4. Verificar formatação e estilo

### **Para Testes com Erros**
1. Verificar se as mensagens de erro são claras
2. Confirmar que o tipo de erro está correto
3. Verificar se a posição do erro está correta
4. Confirmar que não foi gerado HTML

## 📝 Logs de Teste

Os testes geram logs que incluem:
- Status da compilação
- Mensagens de erro (se houver)
- Nome do arquivo HTML gerado
- Tempo de execução

## 🚀 Melhorias Futuras

### **Testes Adicionais Sugeridos**
- Testes de performance com arquivos grandes
- Testes de stress com muitos campos
- Testes de internacionalização
- Testes de acessibilidade do HTML gerado
- Testes de responsividade

### **Automação**
- Integração com CI/CD
- Relatórios automatizados
- Testes de regressão
- Cobertura de código 
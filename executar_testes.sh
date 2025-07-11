#!/bin/bash

echo "=========================================="
echo "EXECUTANDO TESTES DO COMPILADOR DE CURRÍCULOS"
echo "=========================================="

# Compilar o projeto
echo "1. Compilando o projeto..."
mvn clean package

if [ $? -ne 0 ]; then
    echo "❌ Erro na compilação!"
    exit 1
fi

echo "✅ Compilação bem-sucedida!"
echo ""

# Teste 1: Arquivo válido
echo "2. Teste 1 - Arquivo válido (exemplo.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar exemplo.curriculo
echo ""

# Teste 2: Arquivo válido completo
echo "3. Teste 2 - Arquivo válido completo (testes/teste_valido_completo.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_valido_completo.curriculo
echo ""

# Teste 3: Casos especiais
echo "4. Teste 3 - Casos especiais (testes/teste_casos_especiais.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_casos_especiais.curriculo
echo ""

# Teste 4: Erros semânticos
echo "5. Teste 4 - Erros semânticos (testes/teste_semantico_completo.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_semantico_completo.curriculo
echo ""

# Teste 5: Erros sintáticos
echo "6. Teste 5 - Erros sintáticos (testes/teste_sintatico_erros.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_sintatico_erros.curriculo
echo ""

# Teste 6: Erros léxicos
echo "7. Teste 6 - Erros léxicos (testes/teste_lexico_erros.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar testes/teste_lexico_erros.curriculo
echo ""

# Teste 7: Arquivo original com erros
echo "8. Teste 7 - Arquivo original com erros (teste_erros.curriculo):"
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar teste_erros.curriculo
echo ""

echo "=========================================="
echo "TESTES CONCLUÍDOS!"
echo "=========================================="
echo ""
echo "Arquivos HTML gerados:"
ls -la *.html
echo ""
echo "Verifique os arquivos HTML gerados para validar a saída." 
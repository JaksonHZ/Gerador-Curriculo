grammar Curriculo;

/*
Gramática da linguagem declarativa de currículos
*/

// Palavras reservadas
CURRICULO: 'CURRICULO';
SECAO: 'SECAO';
EDUCACAO: 'educacao';
EXPERIENCIA: 'experiencia';
HABILIDADES: 'habilidades';
IDIOMAS: 'idiomas';
HABILIDADE: 'habilidade';
IDIOMA: 'idioma';

// Níveis
GRADUACAO: 'GRADUACAO';
POS_GRADUACAO: 'POS_GRADUACAO';
TECNICO: 'TECNICO';
AVANCADO: 'AVANCADO';
INTERMEDIARIO: 'INTERMEDIARIO';
BASICO: 'BASICO';

// Valores booleanos
TRUE: 'true';
FALSE: 'false';

// Identificadores de campos
NOME: 'nome';
EMAIL: 'email';
TELEFONE: 'telefone';
ENDERECO: 'endereco';
LINKEDIN: 'linkedin';
GITHUB: 'github';
INSTITUICAO: 'instituicao';
CURSO: 'curso';
NIVEL: 'nivel';
INICIO: 'inicio';
FIM: 'fim';
CONCLUIDO: 'concluido';
NOTA: 'nota';
EMPRESA: 'empresa';
CARGO: 'cargo';
ATUAL: 'atual';
DESCRICAO: 'descricao';
TECNOLOGIAS: 'tecnologias';
CATEGORIA: 'categoria';

// Símbolos especiais
ABRE_CHAVE: '{';
FECHA_CHAVE: '}';
DOIS_PONTOS: ':';
PONTO_VIRGULA: ';';
VIRGULA: ',';
ABRE_COL: '[';
FECHA_COL: ']';

// Strings
STRING: '"' ( ~["\r\n] | '""' )* '"';

// Números
NUM_INT: [0-9]+;
NUM_REAL: [0-9]+ '.' [0-9]+;

// Identificadores
IDENT: [a-zA-Z_][a-zA-Z_0-9]*;

// Espaços em branco
WS: [ \t\r\n]+ -> skip;

// Comentários
COMENTARIO: '//' ~[\r\n]* -> skip;

/*
Regras do Parser
*/

programa: curriculo secoes* EOF;

curriculo: CURRICULO IDENT ABRE_CHAVE campos_curriculo FECHA_CHAVE;

campos_curriculo: campo_curriculo*;

campo_curriculo: 
    NOME DOIS_PONTOS STRING PONTO_VIRGULA |
    EMAIL DOIS_PONTOS STRING PONTO_VIRGULA |
    TELEFONE DOIS_PONTOS STRING PONTO_VIRGULA |
    ENDERECO DOIS_PONTOS STRING PONTO_VIRGULA |
    LINKEDIN DOIS_PONTOS STRING PONTO_VIRGULA |
    GITHUB DOIS_PONTOS STRING PONTO_VIRGULA;

secoes: 
    secao_educacao |
    secao_experiencia |
    secao_habilidades |
    secao_idiomas;

secao_educacao: SECAO EDUCACAO ABRE_CHAVE educacao_item* FECHA_CHAVE;

educacao_item: EDUCACAO ABRE_CHAVE campos_educacao FECHA_CHAVE;

campos_educacao: campo_educacao*;

campo_educacao:
    INSTITUICAO DOIS_PONTOS STRING PONTO_VIRGULA |
    CURSO DOIS_PONTOS STRING PONTO_VIRGULA |
    NIVEL DOIS_PONTOS nivel_educacao PONTO_VIRGULA |
    INICIO DOIS_PONTOS STRING PONTO_VIRGULA |
    FIM DOIS_PONTOS STRING PONTO_VIRGULA |
    CONCLUIDO DOIS_PONTOS valor_booleano PONTO_VIRGULA |
    NOTA DOIS_PONTOS numero PONTO_VIRGULA;

nivel_educacao: GRADUACAO | POS_GRADUACAO | TECNICO;

secao_experiencia: SECAO EXPERIENCIA ABRE_CHAVE experiencia_item* FECHA_CHAVE;

experiencia_item: EXPERIENCIA ABRE_CHAVE campos_experiencia FECHA_CHAVE;

campos_experiencia: campo_experiencia*;

campo_experiencia:
    EMPRESA DOIS_PONTOS STRING PONTO_VIRGULA |
    CARGO DOIS_PONTOS STRING PONTO_VIRGULA |
    INICIO DOIS_PONTOS STRING PONTO_VIRGULA |
    ATUAL DOIS_PONTOS valor_booleano PONTO_VIRGULA |
    DESCRICAO DOIS_PONTOS STRING PONTO_VIRGULA |
    TECNOLOGIAS DOIS_PONTOS lista_strings PONTO_VIRGULA;

secao_habilidades: SECAO HABILIDADES ABRE_CHAVE habilidade_item* FECHA_CHAVE;

habilidade_item: HABILIDADE ABRE_CHAVE campos_habilidade FECHA_CHAVE;

campos_habilidade: campo_habilidade*;

campo_habilidade:
    NOME DOIS_PONTOS STRING PONTO_VIRGULA |
    NIVEL DOIS_PONTOS nivel_habilidade PONTO_VIRGULA |
    CATEGORIA DOIS_PONTOS STRING PONTO_VIRGULA;

nivel_habilidade: AVANCADO | INTERMEDIARIO | BASICO;

secao_idiomas: SECAO IDIOMAS ABRE_CHAVE idioma_item* FECHA_CHAVE;

idioma_item: IDIOMA ABRE_CHAVE campos_idioma FECHA_CHAVE;

campos_idioma: campo_idioma*;

campo_idioma:
    NOME DOIS_PONTOS STRING PONTO_VIRGULA |
    NIVEL DOIS_PONTOS nivel_habilidade PONTO_VIRGULA;

valor_booleano: TRUE | FALSE;

numero: NUM_INT | NUM_REAL;

lista_strings: ABRE_COL (STRING (VIRGULA STRING)*)? FECHA_COL; 
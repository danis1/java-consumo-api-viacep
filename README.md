# 📍 Consulta ViaCEP - Java

Aplicação de console desenvolvida em Java para consulta e gerenciamento de endereços utilizando a API pública do **ViaCEP**. O projeto adota uma arquitetura em camadas (`model`, `service`, `view`) e manipula coleções em memória.

---

## 🚀 Funcionalidades

- **Consultar CEP:** Realiza requisições HTTP GET assíncronas/síncronas para a API ViaCEP e exibe as informações formatadas do endereço (Logradouro, Bairro, Localidade, UF).
- **Ver Histórico:** Lista todos os endereços e CEPs consultados durante a execução do programa.
- **Limpar Histórico:** Esvazia a lista de consultas armazenadas em memória.
- **Menu Interativo:** Controle de navegação estruturado via terminal com laço `while` e `switch/case`.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+ / JDK 21+**
- **Java HTTP Client** (`java.net.http.HttpClient` e `HttpRequest`)
- **Java Collections Framework** (`List`, `ArrayList`)
- **IntelliJ IDEA**

---

## 📂 Estrutura do Projeto

```text
src/
└── br/edu/fatecpg/consumoapi/
    ├── model/      # Entidades e representação dos dados
    ├── service/    # Regras de requisição HTTP e comunicação com a API
    └── view/       # Interface de linha de comando (CLI) e execução (Main)

```
---


## 📝 Exemplo de Uso

=================================

Digite uma opção: 
1 - Buscar CEP 
2 - Ver histórico

3 - Limpar histórico 

4 - Encerrar

1
Olá, digite um CEP (somente números) para buscar:
11310180

Resposta:
"cep": "11310-180",
"logradouro": "Rua Marquês de São Vicente",
"bairro": "Centro",
"localidade": "São Vicente",
"uf": "SP",

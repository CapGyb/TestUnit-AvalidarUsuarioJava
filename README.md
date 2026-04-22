# 🚀 Validador de Usuário com Testes Unitários (Java + JUnit 5)

![Build Status](https://github.com/CapGyb/TestUnit-AvalidarUsuarioJava/actions/workflows/main.yml/badge.svg)

## 📌 Visão Geral

Este projeto tem como objetivo validar dados de usuário (nome, email e senha) utilizando Java, com foco em **qualidade de software** através de **testes unitários com JUnit 5**.

A proposta central é simular um cenário real de validação de regras de negócio, garantindo que entradas válidas e inválidas sejam corretamente tratadas.

---

## 🧠 Funcionalidades

* ✅ Validação de nome de usuário
* ✅ Validação de email com expressão regular
* ✅ Validação de senha com regras de segurança
* ✅ Testes unitários cobrindo múltiplos cenários

---

## 🏗️ Estrutura do Projeto

```
src/
 ├── main/java/
 │    └── ValidadorUsuario.java
 └── test/java/
      └── ValidadorUsuarioTest.java

pom.xml
```

---

## 🔍 Regras de Validação

### 👤 Nome de Usuário

* Deve ter entre 3 e 20 caracteres
* Não pode ser nulo

### 📧 Email

* Deve seguir o padrão: `usuario@dominio.com`
* Validação feita via regex

### 🔐 Senha

* Mínimo de 8 caracteres
* Deve conter pelo menos:

  * 1 letra
  * 1 número
* Não pode ser nula

---

## 🧪 Testes Unitários

Os testes foram implementados utilizando **JUnit 5**, cobrindo:

* ✔️ Casos válidos (positivos)
* ✔️ Casos inválidos (negativos)
* ✔️ Validação de entradas nulas
* ✔️ Testes de borda (edge cases)

---

## ⚙️ Tecnologias Utilizadas

* Java 17
* Maven
* JUnit 5

---

## ▶️ Como Executar os Testes

No terminal, execute:

```
mvn clean test
```

Se tudo estiver correto, o build será concluído com sucesso:

```
BUILD SUCCESS
```

---

## 🔄 Integração Contínua

O projeto possui configuração de CI utilizando GitHub Actions.

A cada push na branch `main`:

* O código é compilado
* Os testes são executados automaticamente

---

## 📈 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

* Prática de testes unitários
* Aplicação de boas práticas de QA
* Estruturação de projetos com Maven
* Integração com pipeline CI/CD

---

## 🚀 Possíveis Evoluções

* Implementação de cobertura de testes (JaCoCo)
* Uso de validação com anotações (Bean Validation)
* Criação de API REST com Spring Boot
* Retorno de mensagens detalhadas de erro

---

## 👨‍💻 Autor

Raphael Silva Brito

---

## 📄 Licença

Este projeto é de uso educacional.

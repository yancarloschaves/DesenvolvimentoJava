# Fundamentos da arquitetura de Sistemas

## Web Services

- Fazem acesso ao banco de dados
- Liberam uma URI para acesso aos dados
- Formato ***XML*** ou ***JSON***

### Vantagens de se utilizar

- Linguagem comum
- integração
- Reutilização de implementação
- Segurança
- Custos

### Principais Tecnologias

- SOAP
- REST
- XML
- JSON



## O que é um SOAP ?

Protocolo baseado em *XML* para acessar um serviço web, principalmente por *HTTP*.

- Por meio de transporte genérico, ou seja, pode ser usado com outros protocolos.

### SOAP MESSAGE

![SOAPMESSAGE](D:\git\Introdução a Arquitetura de Sistemas\SOAPMESSAGE.png)

#### SOAP ENVELOPE

Primeiro elemento do documento.

#### SOAP HEADER

Informações de atributos e meta-dados de requisição.

#### SOAP BODY

Detalhes da mensagem.



## WSDL

Usado para descrever ***Web Services***, funciona como um contrato de serviço.

- A descrição é feita em um documento *XML*, onde é descrito o serviço, especificações de acesso, operação e métodos.



## XSD

É um Schema no formato de *XML* usado para definir a estrutura de dados que será validada no *XML*.

- Funciona como documentação de como deve ser montado o SOAP Message (XML) que será enviado através de web service.

   

## REST

É um estilo de arquitetura de software que define a implementação de um serviço web.

- Com JSON

### JSON

Exemplo:

`{`

​	`"nome" : "Os Vingadores",`

​	`"ano_lancamento": "2019",`

​	`"personagens" : [`

​		`{`

​				`"nome":"Thanos"`

​		`},`

​		`{`

​				`"nome" : "Homem de Ferro"`

​		`},`

​		`{`

​				`"nome":"Thor"`

​		`}`

​	`]`

`}`



## Status Code

- 1XX - Informativo
- 2XX - Sucesso
- 3XX - Redirecionamento
- 4XX - Erro do Cliente
- 5XX - Erro do Servidor



## Conceitos de Arquitetura em Aplicações para Internet


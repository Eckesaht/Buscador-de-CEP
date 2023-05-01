# Buscador de CEP

Projeto feito a partir da utilização das classes Java para consumo de APIs (Client, Request, Response), tratamento de exceções customizadas, gravação de arquivos e biblioteca GSON para serialização/desserialização de Objetos <-> JSON.


| :sparkles: Projeto        | **Buscador de CEP**
| -------------  | --- |
| :label: Tecnologias utilizadas | Java

![Main.png](img%2FMain.png)
![EnderecosJson.png](img%2FEnderecosJson.png#vitrinedev)

# Classes e pacotes utilizados
![Arquitetura.png](img%2FArquitetura.png)

<br>

## Detalhes do projeto

### Uso das classes Http-client, request e response para o consumo da API
![ApiModel.png](img%2FApiModel.png)

### Uso da classe FileWriter para gravar o arquivo Endereços.json e da biblioteca externa GSON para desserializar e serializar nosso objeto
![ApiController.png](img%2FApiController.png)

<br>

## Possíveis melhoras
### Tratamento de exceções
![Excecao.png](img%2FExcecao.png)

### Melhor implementação do código de serialização com o uso da classe especial Record
![Record1.png](img%2FRecord1.png)
![Record2.png](img%2FRecord2.png)
![Record3.png](img%2FRecord3.png)

### Serializar corretamente os atributos para seus respectivos tipos primitivos (no momento todos são serializados como strings)
![TipoIncorreto.png](img%2FTipoIncorreto.png)
![AtributosEmString.png](img%2FAtributosEmString.png)

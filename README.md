# Integração Webhook Slack - Java

Saudações! :vulcan_salute:

Esse repositório tem como objetivo ajudar os alunos da faculdade Bandtec, com a parte de integração com serviços de terceiros/mensageria, que são requeridos nas "sprints" dos projetos semestrais.

É um simples exemplo de como consumir o Webhook do Slack utilizando a linguagem Java.

Nesse exemplo, realizamos somente o envio de mensagens à um canal específico previamente configurado.

## Você vai precisar de:

### JDK

[**Para Windows, clique aqui.**](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

Para os usuários de **Linux**, recomendo que instale via [**SDKMan**](https://sdkman.io/).

Abra um terminal e execute o comando:
```bash
$ curl -s "https://get.sdkman.io" | bash
```

Logo após, abra um novo terminal ou atualize o atual e entre com o comando abaixo:

```bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
```
Para testar a instalação, execute o comando abaixo:

```bash
$ sdk version
```

Por fim, execute o comando de instalação do **JDK**:

```bash
$ sdk install java 11.0.8.j9-adpt
```

Pode parecer mais "trabalhoso", mas com esse gerenciador, fica fácil alternar entre as versões de SDK, recomendo que aprenda um pouco mais sobre. :ok_hand:

### Maven

Utilizamos o Maven nesse projeto como gerenciador de dependências, mas se preferir poderá utilizar qualquer outro.

[**Para Windows, clique aqui**](https://maven.apache.org/download.cgi).

Para os usuários de **Linux**:

```bash
$ sdk install maven
```

### Alguma IDE Java

Na faculdade, dependendo do semestre, utilizamos algumas IDE's como por exemplo [**IntelliJ**](https://www.jetbrains.com/pt-br/idea/), [**Netbeans**](https://netbeans.apache.org/), [**Vscode**]() e etc...

Escolha uma de sua preferência.

## Uso

Se você possuí uma versão anterior ao **Java 11**, deverá utilizar o código contido no pacote **"java"**, caso contrário, se possuí uma versão igual ou acima, utilize como referência o código contido no pacote **"java11"**

Assim que clonar o projeto, abra em sua IDE e execute o comando **"clean and build"** para forçar o download das dependencias, nesse caso só utilizaremos uma [**JSON Object**](https://mvnrepository.com/artifact/org.json/json)

Você precisará colocar sua URL obtida na configuração do workspace nesse atributo chamado "URL", dentro da classe Slack:

```java
public class Slack {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String URL = "INSIRA SUA URL AQUI (WEBHOOK)";

    ...
}
```
Logo após deverá criar um objeto Json para ser enviado na requisição:

```java
JSONObject json = new JSONObject();   
json.put("text", "Fácil né? :shrug:");
```

Por fim, para enviar a mensagem criada, invoque o método "sendMessage" da classe Slack:

```java
ublic class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        JSONObject json = new JSONObject();
        
        json.put("text", "Fácil né? :shrug:");
        
        Slack.sendMessage(json);
    }
}
```

### **Fácil né?** :grinning:

## Contribuições
Pull requests são bem-vindas. Para mudanças importantes, abra uma issue primeiro para discutir o que você gostaria de mudar.

Certifique-se de testar seu código.


## Code Owners
[@Britooo](https://github.com/Britooo)

## Licença
[MIT](https://choosealicense.com/licenses/mit/)

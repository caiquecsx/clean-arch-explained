# Introdução a Clean Architecture

### 🚀 Sobre

A Clean Architecture criada pelo Uncle Bob (Robert C. Martin), famoso nas áreas de engenharia e arquitetura de software, se você ainda não escutou falar dele, ainda vai ouvir, ele é o criador tanto do clean arch como do clean code.

### 📌 Objetivos
* Ser independente de frameworks
    - A arquitetura não depende de bibliotecas, assim ao invés de adaptar o sistema as limitações do framework, você os utiliza como ferramentas.

* Testabilidade
    - Os testes são independentes de UI, SGBD, Servidores, ou qualquer agente externo.

* Independência de UI
    - As mudanças na interface de usuário não devem impactar as regras de negócio. Posso utilizar minhas regras, sejam em interfaces Web, Console, Serviços, ETC.

* Independência de Banco de Dados
    - Pode trocar de bases tranquilamente, pois as suas regras de negócio não estão ligadas a base de dados.
    
* Independência de agentes externos
    - As regras de negócio não conhecem agentes externos e não são afetadas pelos mesmos.
    
O objetivo dessa arquitetura é que as regras de negócio sejam independentes e desacopladas. No diagrama da Clean Architecture, é divido em camadas e cada uma com suas responsabilidades.

Mas antes de falar das responsabilidades, tem algumas considerações a serem levantadas aqui. 

### 📌 Considerações
* Cada circulo representa uma área da aplicação.

* Quanto mais externo, mais representam mecanismos do software, ex: Banco de dados, UI, Frameworks e bibliotecas.
  Todos são externos e a ideia é não depender deles.
  
* Quantos mais interno, mais representam políticas, protocolos, abstrações e contratos do sistema. Ou seja, mais especialista ele é no negócio.

* As setas representam Regras de dependência, sempre apontando pra dentro, isso quer dizer que as dependências sempre vem de fora pra dentro e nunca de dentro pra fora. Exemplo: Um Gateway depende de um Use Case, mas um Use Case, não deve depender de um Gateway!

* O INTERNO não pode saber nada do mais EXTERNO, exemplo: Entidades nunca devem conhecer, controllers, DB`s etc.

### 🔨 Camadas

Agora falando sobre cada camada.

```
Shrek: Os ogros São como cebolas!
Burro: É... Fedem e fazem a gente chorar...
Shrek: Não Burro... Camadas... Cebolas tem camadas, ogros tem camadas!
```

![Screenshot](https://miro.medium.com/max/880/1*O4pMWCi5kZi20SNOR6V33Q.png)


* Entidades
    - As entidades representam os objetos de domínio, reúnem as regras de negócio da aplicação (Core), raramente alterada. Esta camada deve conter objetos puros, sem frameworks e annotations.

* Casos de uso
    - Os casos de uso contém as regras de negócio especificas, são responsáveis pela orquestração do fluxo de dados a partir das entidades, orientando a execução de funcionalidades da aplicação. Nessa camada que é descrita alguma funcionalidade da aplicação, exemplo: criação de usuário, haveria um caso de uso específico para isso, que implementaria toda a regra de criação necessária. 
    - Os casos de uso não sabem quem os chamou e nem qual a saída dele (JSON, XML, CSV, HTML).

* Adaptadores de interface (Gateway, Controllers, Presenters)
    - Nessa camada, os adaptadores devem converter os dados para o uso de use cases e entidades, como também para agentes externos, como bancos de dados, apresentação na web e etc. Ela serve como meio de campo entre as camadas internas e externas, ela quem sabe os dados passados a use cases, entidades, qual banco de dados utilizar, interface escolher e qualquer agente externo.

* Frameworks e Drivers (Web, UI, DB, Devices, Interfaces externas)
    - Nessa camada ficam os detalhes da aplicação, como banco de dados, bibliotecas e frameworks, raramente é necessário programar nessa camada, sendo mais normal a escrita de mecanismos de associação entre os mecanismos.

### Problema
* E se um caso de uso precisa chamar algo mais externo?
    - Nesse caso, é necessário fazer o uso de inversão de dependências. O caso de uso, faz uma chamada a uma interface na camada de caso de uso, que serve de abstração para o serviço, evitando que o caso de uso tenha que acoplar uma classe concreta desse serviço.

---
Desenvolvido por [Caique Campos](https://www.linkedin.com/in/caiquecsx/) 🚀
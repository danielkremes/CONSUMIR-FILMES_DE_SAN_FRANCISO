Diretrizes do Desafio de Programação
===========================

Especificações funcionais
---------------

Crie um protótipo de **um** dos seguintes projetos:

1. Horários de partida
2. Filmes de ficção científica
3. Serviço de e-mail
4. Food trucks

A experiência do usuário/interface do usuário fica totalmente a seu critério. Se quiser, seja criativo e adicione recursos adicionais
que possam ser úteis para o usuário!

### Horários de partida

Crie um serviço que forneça horários de partida em tempo real para o transporte público
(use API pública disponível gratuitamente). O aplicativo deve geolocalizar o usuário.

Aqui estão alguns exemplos de dados disponíveis gratuitamente:

* [511](http://511.org/developer-resources_transit-api.asp) (São Francisco)
* [Nextbus](http://www.nextbus.com/xmlFeedDocs/NextBusXMLFeed.pdf) (São
  Francisco)
* [Transport for London Unified API](https://api.tfl.gov.uk/) (Londres)

### Filmes em São Francisco

Crie um serviço que mostre em um mapa onde os filmes foram filmados em São
Francisco. O usuário deve poder filtrar a visualização usando a pesquisa com preenchimento automático.


Os dados estão disponíveis em [DataSF](http://www.datasf.org/): [Film
Locations](https://data.sfgov.org/Arts-Culture-and-Recreation-/Film-Locations-in-San-Francisco/yitu-d5am).

### Serviço de e-mail

Crie um serviço que aceite as informações necessárias e envie e-mails. Ele
deve fornecer uma abstração entre dois provedores de serviços de e-mail diferentes.
Se um dos serviços ficar fora do ar, seu serviço pode rapidamente fazer o failover para
um provedor diferente sem afetar seus clientes.

Exemplos de provedores de e-mail:

* [SendGrid](https://sendgrid.com/user/signup) - [Documentação do Simple Send](https://sendgrid.com/docs/API_Reference/Web_API/mail.html)
* [Mailgun](http://www.mailgun.com) - [Documentação do Simple Send](http://documentation.mailgun.com/quickstart.html#sending-messages)
* [SparkPost](https://www.sparkpost.com/) - [Centro de desenvolvedores](https://developers.sparkpost.com/)
* [Amazon SES](http://aws.amazon.com/ses/) - [Documentação do Simple Send](http://docs.aws.amazon.com/ses/latest/APIReference/API_SendEmail.html)

Todos os serviços listados são gratuitos para experimentar e muito fáceis de se inscrever, então
registre suas próprias contas de teste em cada um deles.

### Food Trucks

Crie um serviço que informe ao usuário quais tipos de food trucks podem ser encontrados
perto de um local específico em um mapa.

Os dados estão disponíveis no [DataSF](http://www.datasf.org/): [Food
Trucks](https://data.sfgov.org/Permitting/Mobile-Food-Facility-Permit/rqzj-sfat)

Especificações técnicas
--------------

A arquitetura será dividida entre um back-end e um front-end web, por
exemplo, fornecendo uma API RESTful de entrada/saída JSON. Sinta-se à vontade para usar qualquer outra
tecnologia, desde que a arquitetura geral do cliente/serviço seja
respeitada.

Escolha **uma** das seguintes trilhas técnicas que melhor se adapte às suas habilidades:

1. **Full-stack**: inclui front-end e back-end.
2. **Faixa back-end**: inclui um front-end mínimo (por exemplo, uma visualização estática ou API
   docs). Escreva, documente e teste sua API como se ela fosse ser usada por outros
   serviços.
3. **Faixa front-end**: inclui um back-end mínimo ou usa o serviço de dados
   diretamente. Concentre-se em tornar a interface o mais polida possível.

### Back-end

Acreditamos que não existe uma tecnologia única que sirva para todos. Uma boa engenharia consiste em
usar a ferramenta certa para o trabalho certo e aprender constantemente sobre elas.
Portanto, sinta-se à vontade para mencionar em seu `README` quanta experiência você tem
com a pilha técnica que escolheu, nós levaremos isso em consideração ao analisar
seu desafio.

Aqui estão algumas tecnologias com as quais estamos mais familiarizados:

* Python
* JavaScript
* Ruby
* PHP
* Go
* C++
* Haskell
* Java

Você também pode usar qualquer estrutura web. Se você optar por usar uma estrutura
que resulte em código boilerplate no repositório, detalhe em seu
README qual código foi escrito por você (em oposição ao código gerado).

### Front-end

O front-end deve ser, idealmente, um aplicativo de página única com um único `index.html`
vinculado a JS/CSS/etc. externos. Você pode aproveitar esta oportunidade para demonstrar
seu conhecimento de CSS3 ou HTML5.

Traduzido com a versão gratuita do tradutor - DeepL.com

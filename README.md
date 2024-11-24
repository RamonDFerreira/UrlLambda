
# UrlLambda

## Tecnologias Utilizadas

- **Java**
- **AWS Lambda**
- **Amazon S3**
- **API Gateway**
- **AWS SDK para Java**
- **Jackson ObjectMapper**

## Funcionalidade do Projeto

Este projeto implementa um serviço simples de encurtador de URLs utilizando AWS Lambda e Amazon S3. Ele consiste em duas funções Lambda:

1. **createUrlShortner**: Recebe uma URL original e um tempo de expiração, gera um código curto e armazena as informações em um bucket S3.

2. **redirectUrlShortner**: Utiliza o código curto para redirecionar o usuário para a URL original, verificando se o link ainda não expirou.

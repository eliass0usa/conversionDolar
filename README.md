## Conversor de Reais para Dólares | Compra de Dólares

Este é um simples projeto de conversor para facilitar a compra de Dólares. Ele foi desenvolvido como parte de um exercício para demonstrar o uso de membros estáticos em Java e como eles interagem com outras classes.

### Funcionalidades

O projeto inclui as seguintes funcionalidades:

- **Cotação Atual do Dólar:** O usuário insere a cotação mais recente do dólar.
  
- **Valor a ser Comprado em Dólares:** O usuário insere a quantidade de dólares que deseja comprar.
  
- **Conversão:** Com base na cotação inserida e considerando uma taxa de IOF, o programa calcula quantos reais o usuário precisará pagar para adquirir os dólares desejados.

### CurrencyConverter: Membro Estático da Classe (IOF)

- **Método `dollarToReal`:** Este método estático recebe como parâmetros o valor em dólares (`amount`) e o preço do dólar (`dollarPrice`), ambos do tipo `double`. A operação realizada é a seguinte: `amount * dollarPrice * (1.0 + IOF)`.

### Como Utilizar

1. Insira a cotação atual do dólar.
2. Informe a quantidade de dólares que deseja comprar.
3. O programa calculará automaticamente o valor em reais necessário para a compra, considerando a taxa de IOF.

### Observações

Certifique-se de inserir a cotação do dólar atualizada para obter resultados precisos. A taxa de IOF também será aplicada ao cálculo final.

Este projeto é uma ótima oportunidade para praticar conceitos de programação orientada a objetos em Java, especialmente o uso de membros estáticos para funcionalidades comuns que não dependem do estado de instâncias específicas da classe.

Divirta-se explorando e aprendendo com este conversor simples de Reais para Dólares!



Créditos: Java COMPLETO Programação Orientada a Objetos + Projetos | Nelio Alves
(UDEMY.COM)

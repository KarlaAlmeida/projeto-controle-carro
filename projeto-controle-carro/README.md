## Objetivos

O projeto consiste em desenvolvimento de código em Java para controle das seguintes funções de um carro: 

* Ligar o carro;
* Desligar o carro;
* Acelerar;
* Diminuir velocidade;
* Virar para esquerda/direita
* Verificar velocidade;
* Trocar a marcha.

## Regras do negócio

* Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0;
* O carro desligado não pode realizar nenhuma função;
* Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
* Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
* O carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
* A velocidade do carro deve respeitar os seguintes limites para cada velocidade:
  * se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar;
  * se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km;
  * se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km;
  * se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km;
  * se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km;
  * se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km;
  * se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km;
* O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km;
* O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km.

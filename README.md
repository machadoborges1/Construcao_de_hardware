# Construcao_de_hardware!

## Home

Este é um sistema para construção de um software capaz de pegar um hardware de um celular, e monta-lo com o preço determinado por um sistema que atualiza o valor das peças.
A motivação veio do ponto onde achei que poderia ser um trabalho bom e criativo saindo deste tema de criação de software para empacotamento de hardware.

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/458bea0c-9c83-4c53-b6c5-9b3265a27332)

## Padrões de Projeto

### Abstract Factory
O Abstract Factory permitiu que você criar objetos de celulares relacionados sem precisar saber exatamente quais classes de celulares estão sendo instanciadas.

Fabrica Abstrata

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/b1892631-a86a-48a3-ab78-1e8c62c5ee1e)
![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/2ccf058a-5446-4ac5-8761-0ca9f51a83cb)

Main

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/92b8f00b-0680-45a0-8def-f6a489803cdc)


### Observer
O padrão Observer foi quando o objeto HardwarePrice precisava notificar outros objetos de Phone sobre mudanças em seu valor de peças, sem saber quais objetos específicos foram notificados.

Observado

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/c4f4be45-f88f-44d6-996c-2c42b5f304dc)

Observer

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/cde93fef-a567-43f1-9901-950ff457141c)


### Strategy
Facilitou a alteração dos algoritmos de hardware utilizados pelo metodo Phone sem alterar a estrutura.


![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/27a07ca2-d1e2-409c-a2b1-9affc24f3669)

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/425aed96-ead4-4422-b036-adae52d44a02)


### Singleton
 O Singleton foi útil quando foi necessário garantir que as fabricas tenha uma classe tenha apenas uma instância.

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/6145e066-3da2-4d8a-a3e1-3fbb52f3a16b)


### Facade
Definiu uma interface de nível mais alto que tornou o sistema mais fácil de usar.

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/67e7e7d0-edd8-400f-8056-f7e3949ed9c9)


## Princípios de Projeto

### Dependency Injection Principle
Esse princípio teve o objetivo de tornar os componentes do sistema menos dependentes das implementações específicas de outros componentes, promovendo maior flexibilidade, reutilização.

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/df0727d4-f19f-4f76-a6f1-973be8abfd6b)

### Single Responsability
Este princípio estabeleceu que esta classe tem apenas um motivo para mudar, ou seja, ela tem apenas uma responsabilidade no sistema.

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/cd4664ae-25ac-4276-adb7-6e163e58cf1d)


### Aberto/Fechado
Aberto para extensão, mas fechado para modificação

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/f880f6cb-a477-41c9-84d4-ead877601397)

![image](https://github.com/machadoborges1/Construcao_de_hardware/assets/96207730/01d2305c-be56-43dc-9088-183455ed4b7f)




## Conclusão
Este trabalho me ensinou bem melhor a aplicar estes padrões de projeto, junto com a importância principalmente do principio de injeção de dependência.
É gratificante podr programar um codico um pouco menos acoplado.

Foi mais dificil que eu imaginava usar este tema e conseguir aplicar varios padrões de projeto.

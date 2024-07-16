# ✈️ Journey

> O projeto **Journey** tem como objetivo ajudar **o usuário a organizar viagens** à trabalho ou lazer. O usuário pode criar uma viagem com nome, data de início e fim. Dentro da viagem, o usuário pode planejar sua viagem adicionando atividades para realizar em cada dia.

## 📝 Requisitos

### ✅ Requisitos Funcionais

1. O usuário cadastra uma viagem informando:
   - Local de destino 🌍
   - Data de início 📅
   - Data de término 📆
   - E-mails dos convidados 📧
   - Seu nome completo e endereço de e-mail ✍️

2. O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link:
   - A viagem é confirmada ✔️
   - Os convidados recebem e-mails de confirmação de presença 📩
   - O criador é redirecionado para a página da viagem 🗺️

3. Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem:
   - Inserir seu nome (o e-mail já estará preenchido) ✏️
   - Confirmar sua presença na viagem ✔️

4. Na página do evento, os participantes da viagem podem:
   - Adicionar links importantes da viagem como reserva do AirBnB, locais para serem visitados, etc. 🌐

5. Ainda na página do evento, o criador e os convidados podem:
   - Adicionar atividades que irão ocorrer durante a viagem com título, data e horário 📅⏰

6. Novos participantes podem ser convidados dentro da página do evento através do e-mail e devem passar pelo fluxo de confirmação como qualquer outro convidado ✉️

## 🚀 Como começar

### Pré-requisitos

- Java 11 ou superior ☕
- Spring Boot 🌱
- Maven 🛠️

### Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/Caio-Ruiz-Romanato/InviteAPI.git
   cd planner

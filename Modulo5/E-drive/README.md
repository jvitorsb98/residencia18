# e-drive-navigator

O **e-drive-navigator** é um sistema inovador desenvolvido para otimizar o planejamento de viagens de veículos elétricos, garantindo que os motoristas possam realizar suas viagens de forma eficiente e sem imprevistos relacionados à falta de carga na bateria. O sistema calcula rotas entre o ponto de partida e o destino, levando em consideração a autonomia do veículo e a localização das estações de carregamento ao longo do trajeto. Além disso, o **e-drive-navigator** garante que o veículo pare apenas quando necessário, com base na distância até a próxima estação e na quantidade de carga restante na bateria.

Durante o desenvolvimento deste projeto, fui designado para liderar uma equipe de 4 desenvolvedores, onde cada membro contribuiu com habilidades especializadas para implementar as diversas funcionalidades do sistema. A colaboração entre os membros foi fundamental para garantir a implementação de uma solução robusta, que atende tanto às necessidades dos motoristas quanto à dinâmica de viagens de longa distância com veículos elétricos.

## Funcionalidades

- **Planejamento de Viagens**: O sistema calcula a rota completa do ponto de partida até o destino final, considerando todas as estações de carregamento ao longo do caminho, otimizando o percurso para que o veículo não precise fazer paradas desnecessárias, com uma margem de segurança.
- **Mapa de Postos de Carregamento**: O sistema exibe um mapa interativo com a localização das estações partindo de localização atual do usuário, permitindo que o usuário visualize todas as opções de recarga disponíveis.
- **Retorno à Residência**: Caso o motorista deseje retornar ao ponto de partida após a viagem, o sistema recalcula a rota de volta, garantindo que as mesmas considerações sobre autonomia e paradas sejam feitas para a viagem de retorno.
- **Modos de Administrador**: O sistema oferece um modo de administrador para gerenciar marcas, modelos e veículos do sistema. Além disso, o administrador pode gerar relatórios utilizando JavaReports para analisar o desempenho do sistema e as viagens realizadas.
- **Gerenciamento de Conta de Usuário**: A aplicação permite aos usuários criar uma conta para acessar o serviço e realizar o planejamento de viagens. Os usuários podem realizar login em suas contas, recuperar a senha em caso de esquecimento, e se necessário, recuperar a conta. Além disso, o sistema oferece a opção de desativar a conta, garantindo a privacidade e segurança do usuário.
- **Dicas de Otimização de Bateria**: O sistema inclui uma página com dicas de como otimizar o uso da bateria do veículo. Para questões de acessibilidade, a página conta com um botão que realiza a leitura do conteúdo, proporcionando uma experiência mais inclusiva para os usuários.


## Estrutura do Projeto

A verdadeira estrutura do projeto é organizada da seguinte forma:

- **Pasta `backend`**: Contém o projeto desenvolvido em Java 21 com Spring Boot 3.2.8, responsável pelo backend da aplicação.
- **Pasta `frontend`**: Contém o projeto desenvolvido em Angular 17, responsável pela interface do usuário.
- **Arquivo `backend.env`**: Arquivo de configuração contendo as variáveis de ambiente específicas para o backend do sistema.
- **Arquivo `db.env`**: Arquivo de configuração contendo as variáveis de ambiente relacionadas ao banco de dados.
- **Arquivo `docker-compose.yml`**: Arquivo utilizado para o deploy da aplicação, com a configuração necessária para a orquestração de contêineres.
- **Pasta `documentacao`**: Contém os seguintes arquivos de documentação:
  - **Diagrama de Sequência**: `Diagrama_de_Sequencia___E_drive.pdf`
  - **Dicionário de Dados**: `Dicionario_de_Dados_E_drive.pdf`
  - **Documentação do Front-end**: `Documentação_Front_end_e_drive.pdf`
  - **Regras para o Desenvolvimento do Backend**: `Regras_para_desenvolvimento_do_backend.pdf`


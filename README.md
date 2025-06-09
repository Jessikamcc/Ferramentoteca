🆕 Novas Funcionalidades


✅ Cadastro de Usuários com Permissões
Tela funcional para o cadastro de usuários com os seguintes campos:

Nome do usuário

Senha e confirmação de senha

Tipo de usuário: Administrador, Operador, Visualizador

No futuro, há a possibilidade de implementar métodos mais seguros para o armazenamento de senhas, além da opção de configurar um limite personalizado de empréstimos para cada usuário.

✅ Inventário com Filtros
Tela com JTable listando as ferramentas.

Filtros disponíveis:

Nome da ferramenta

Status da ferramenta (Disponível, Emprestada, Desativada.)

Localização (ambiente da escola onde a ferramenta está alocada)

A busca exige pelo menos um campo preenchido.

Atualmente, o filtro por "Nome" considera apenas o nome da ferramenta. Futuramente, seria interessante permitir a busca também por ID para facilitar o uso.

✅ Tela de Cadastro de Empréstimos com Busca
Permite busca por nome da ferramenta ou ID (obrigatório preencher ao menos um dos dois).

Os resultados são exibidos em uma tabela apenas para visualização (sem possibilidade de edição).

Inclui campos para cadastrar um novo empréstimo e um botão para confirmar a operação.

✅ Tela de Cadastro de Ferramentas
Esta tela permite Cadastrar, atualizar, buscar e desativar ferramentas no sistema de forma intuitiva.

🧾 Campos e Funcionalidades:
ID ou Nome + Botão Buscar
Permite localizar rapidamente uma ferramenta existente pelo ID ou nome. Ideal para atualização ou verificação de dados.

Nome
Campo obrigatório para informar o nome da ferramenta.

Descrição
Campo para inserir informações complementares como marca, modelo e categoria. Ajuda a diferenciar ferramentas semelhantes.

Localização
Seleção do ambiente da escola onde a ferramenta está armazenada. Campo com JComboBox.

Status da Ferramenta:
Disponível (padrão)
Desativar
Permite marcar a ferramenta como indisponível. Ao selecionar esta opção, o campo Motivo da Desativação se torna editável.

Motivo da Desativação
Campo opcional que deve ser preenchido ao desativar a ferramenta, explicando o motivo (ex: danificada, extraviada, manutenção).

🧰 Botões:
Cadastrar
Salva uma nova ferramenta no sistema.

Atualizar
Altera os dados de uma ferramenta já existente (após buscá-la por ID ou nome).

Limpar
Apaga todos os campos do formulário, facilitando o início de um novo cadastro.

✅ Controle de Permissões
O acesso ao sistema é controlado de acordo com o tipo de usuário:

Administrador: pode cadastrar, listar, excluir e cadastrar empréstimos de ferramentas.

Operador: pode cadastrar, listar e emprestar ferramentas.

Visualizador: pode apenas visualizar as listagens e o status das ferramentas.

✅ Botão "Limpar Campos"
Todas as telas de formulário (como a de cadastro de usuário) possuem um botão que limpa os campos automaticamente, facilitando novos cadastros.

🖥️ Tecnologias Utilizadas
Java (JDK 23)

Swing (JFrame Forms)

MySQL

JDBC

NetBeans 23

🗃️ Estrutura de Banco de Dados
Principais tabelas: usuario, ferramenta, emprestimo

Estrutura com relacionamentos para controle de responsáveis pelas ferramentas.

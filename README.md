# Sistema de Gerenciamento de Ferramentas

## Status do Projeto
🟡 Em desenvolvimento

## Tecnologias Aplicadas
- Java (JDK 23)
- Swing (JFrame Forms)
- MySQL
- JDBC
- NetBeans 23

## Time de Desenvolvedores
[Jessika Chavez]

## Objetivo do Software
Sistema para controle e gerenciamento de ferramentas em ambiente escolar, permitindo:
- Cadastro e controle de ferramentas
- Gerenciamento de empréstimos
- Controle de usuários com diferentes níveis de acesso
- Monitoramento do status e localização das ferramentas

## Funcionalidades do Sistema

### 🆕 Funcionalidades Implementadas

#### 👥 Cadastro de Usuários com Permissões
- Campos: Nome, Senha (com confirmação), Tipo de usuário (Administrador, Operador, Visualizador)
- Possibilidade futura de implementar armazenamento mais seguro de senhas e limites personalizados de empréstimos

#### 🔍 Inventário com Filtros
- Listagem de ferramentas em JTable
- Filtros por:
  - Nome da ferramenta
  - Status (Disponível, Emprestada, Desativada)
  - Localização (ambiente escolar)
- Busca requer pelo menos um campo preenchido

#### 📝 Cadastro de Empréstimos
- Busca por nome ou ID da ferramenta
- Exibição dos resultados em tabela (somente visualização)
- Campos para cadastro de novo empréstimo + botão de confirmação

#### � Cadastro de Ferramentas
- Funcionalidades CRUD (Criar, Ler, Atualizar, Desativar)
- Campos:
  - ID/Nome (para busca)
  - Nome (obrigatório)
  - Descrição (marca, modelo, categoria)
  - Localização (JComboBox)
  - Status (Disponível/Desativada)
  - Motivo da desativação (opcional quando desativada)

#### 🔒 Controle de Permissões
- **Administrador**: Cadastro, listagem, exclusão e empréstimos
- **Operador**: Cadastro, listagem e empréstimos
- **Visualizador**: Apenas visualização

#### 🧹 Botão "Limpar Campos"
- Disponível em todas as telas de formulário
- Limpa todos os campos para novo cadastro

## Estrutura de Banco de Dados
Principais tabelas:
- `usuario`
- `ferramenta`
- `emprestimo`

Estrutura com relacionamentos para controle de responsáveis pelas ferramentas.

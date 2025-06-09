Ferramentoteca - Sistema de Gestão de Ferramentas
Versão: 1.0
Data: [05/06/2025]

Funcionalidades Implementadas
🔐 Login e Autenticação
Tipos de Usuário:

Administrador: Acesso total.

Operador: Cadastro de ferramentas e empréstimos.

Visualizador: Apenas consulta o inventario.

Menu Dinâmico: Os botões são exibidos conforme o tipo de usuário logado.

🛠️ Cadastro de Ferramentas
Campos obrigatórios: Nome, Descrição, Localização, Status.

Validações:

Motivo de desativação obrigatório se status = "Desativar".

Banco de Dados: Integrado (MySQL).

Botões:

Cadastrar: Persiste os dados no banco.

Limpar: Reseta o formulário.

📋 Telas GUI Desenvolvidas
Tela	Status	Observações
Login	✅ Funcional	Autenticação por tipo de usuário.
Menu Principal	✅ Funcional	Botões dinâmicos.
Cadastro Ferramentas	✅ Funcional	Validação + BD.
Inventário	⚠️ GUI Pronta	Falta integrar com BD.
Empréstimo	⚠️ GUI Pronta	Falta lógica de negócio.
Cadastro Usuário	⚠️ GUI Pronta	Falta integração com BD.

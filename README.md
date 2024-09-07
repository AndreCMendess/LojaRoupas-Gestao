# LojaRoupas-Gestao

**Sistema de Gestão de Estoque e Vendas para Loja de Roupas**

Desenvolvido como parte do curso técnico de Desenvolvedor de Sistemas.

## Introdução ao Sistema
Este sistema foi desenvolvido para atender às necessidades de uma loja de roupas de pequeno porte que não utiliza tecnologia para a gestão de estoque, vendas e clientes. Toda a administração da loja, incluindo gestão financeira e controle de estoque, é realizada manualmente, o que pode gerar problemas com o aumento do fluxo de clientes, especialmente no caso de vendas a prazo.

O software propõe uma solução para gerenciar toda a operação da loja, controlando as vendas diárias e semanais, armazenando relatórios, listando produtos e fornecendo um cadastro completo dos clientes.

## Descrição do Projeto
- **Cadastro de Produtos:** Nome, descrição, tamanho, valor de compra, valor de venda e quantidade.
- **Cadastro de Vendas:** Produto(s), valor, data de venda, data de pagamento, nome do cliente e status da venda.
- **Cadastro de Clientes:** Nome, CPF, email, telefone e endereço.

## Descrição dos Usuários
O sistema será utilizado principalmente pelo dono da loja, podendo também ser acessado por funcionários, caso necessário.

## Necessidades Observadas e Regras de Negócio
- O sistema deve ser atualizado automaticamente com base nos produtos e informações cadastradas.
- O sistema deve enviar um aviso caso a venda passe da data de pagamento sem que o cliente tenha realizado o pagamento.
- Backup de todos os dados do sistema deve estar disponível.

## Requisitos Funcionais
1. O usuário deve poder cadastrar produtos no sistema, registrando nome, tipo, tamanho, quantidade, descrição, valor de compra e valor de venda.
2. O sistema deve fornecer uma tela com os produtos cadastrados, exibindo nome, tipo, tamanho, quantidade, descrição, valor de compra e valor de venda.
3. O sistema deve permitir o cadastro de clientes.
4. O sistema deve fornecer uma tela com o registro de todas as vendas.
5. O sistema deve registrar a venda, incluindo produto, valor, data, data de pagamento e nome do cliente.
6. O sistema deve fornecer a opção de visualizar o valor total dos produtos em estoque, a soma das vendas diárias e a soma das vendas entre datas específicas.
7. O sistema deve alertar o usuário sobre vendas não pagas após a data de vencimento.

## Requisitos Não Funcionais
- O sistema não deve depender de conexão à internet para funcionar.
- O sistema deve ser compatível com Windows e Linux.

## Tecnologias Utilizadas
- **Java**
- **MySQL Workbench**

## Exemplo de Funcionalidades do Sistema
- **Como dono da loja:** Quero uma tela com todas as vendas em aberto que ainda não foram pagas.
- **Como dono da loja:** Quero uma tela com o registro de todas as vendas.
- **Como dono da loja:** Quero saber o valor total dos produtos atualmente no estoque.
- **Como dono da loja:** Quero saber qual tipo de produto e tamanho são mais vendidos para otimizar a compra de produtos futuros.
- **Como dono da loja:** Quero uma tela com todos os produtos cadastrados, incluindo nome, tamanho, preço, etc.

## Documentação
A documentação completa da API está disponível [aqui](./dist/javadoc/index.html).

## Demonstração do Sistema

Aqui estão alguns vídeos que demonstram as funcionalidades do sistema:

- [Cadastro de Cliente e Tabela de Clientes](./videos/cadastro-de-cliente-e-tabela-de-clientes.mp4)
- [Cadastro de Produto e Tabela de Produto](./videos/cadastro-de-produto-e-tabela-de-produto.mp4)
- [Carrinho de Compra](./videos/carrinho-de-compra.mp4)
- [Tela de Vendas e Tabelas no Banco de Dados](./videos/tela-de-vendas-e-suas-tabelas-no-banco-de-dados.mp4)
- [Tela e Exemplo de Pesquisa na Tabela](./videos/telas-e-um-breve-exemplo-de-pesquisa-na-tabela.mp4)


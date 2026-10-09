# 🛒 Checkout Interativo: Atualização de Estoque & Cálculo em Tempo Real

Aplicação em Java desenvolvida para simular a operação imediata de um caixa/ponto de venda no terminal CLI.

---

## ⚡ Como Funciona (Na Prática)

O fluxo é instantâneo e direto no terminal:

1. **Exibição Inicial:** O sistema mostra o produto, o preço unitário e o saldo em estoque.
2. **Entrada do Usuário:** Você digita a quantidade desejada e pressiona `Enter`.
3. **Processamento Instantâneo:** 
   - **Cálculo Automático:** Multiplica a quantidade pelo preço unitário e exibe o valor total da compra.
   - **Baixa Automática:** Abate as unidades do estoque em tempo real.
   - **Validação de Segurança:** Se a quantidade digitada for maior que o saldo, o sistema bloqueia a venda e avisa que o estoque é insuficiente.

---

## 🖥️ Exemplo de Execução no Terminal

### Cenário 1: Venda Concluída com Sucesso
```text
=== SISTEMA DE VENDAS E ESTOQUE ===
Produto: Notebook Dell
Preço: R$ 3500.0
Estoque atual: 10 unidades

Digite a quantidade que deseja comprar: 3

--- RESULTADO DA OPERAÇÃO ---
Venda concluída com sucesso!
Produto: Notebook Dell
Quantidade Vendida: 3
Valor Total: R$ 10500.0
Estoque Atualizado: 7 unidades.

# 📦 Gestão Operacional de Vendas & Prevenção de Ruptura de Estoque

Solução criada para automatizar o processo de checkout, prevenir a venda de produtos indisponíveis (*overselling*) e garantir a integridade do saldo financeiro e de mercadorias.

---

## 💼 O Problema de Negócio

Em operações comerciais e de varejo, a falta de sincronia entre o ponto de venda e o estoque físico gera três gargalos críticos:

1. **Vendas Sem Estoque (*Overselling*):** Vender itens indisponíveis causa insatisfação do cliente, custos operacionais com estornos e perda de reputação da marca.
2. **Descentralização do Controle de Saldo:** A dependência de atualizações manuais no final do dia causa inconsistências entre o saldo informado e o saldo real de mercadorias.
3. **Erros Humanos de Precificação:** O cálculo manual do valor total de pedidos aumenta a margem de erro no faturamento e na cobrança.

---

## 🎯 A Solução Operacional

A aplicação atua como uma **camada preventiva de validação de transações**, garantindo a saúde financeira e operacional do checkout através de 3 pilares:

### 1. Bloqueio Preventivo de Pedidos
O sistema consulta o saldo em tempo real antes de autorizar qualquer cobrança. Caso o volume solicitado seja maior que a disponibilidade física, a operação é interrompida imediatamente, apresentando o saldo atual ao operador.

### 2. Baixa Automática e Instantânea
Ao confirmar uma transação válida, a mercadoria é abatida do saldo físico no mesmo instante, garantindo que o próximo atendimento consulte um estoque atualizado.

### 3. Faturamento Preciso e Recibo Instantâneo
O sistema consolida a multiplicação da quantidade pelo preço unitário e emite um resumo transparente com o status da operação, valor final e saldo remanescente.

---

## 📈 Impacto & Resultados de Negócio

* **Zero Falso Atendimento:** Garantia de que apenas vendas com capacidade de entrega sejam processadas.
* **Redução de Custos Administrativos:** Eliminação da necessidade de estornos manuais e renegociações por falta de produto.
* **Confiabilidade de Dados:** Informação de saldo sempre precisa para tomada de decisão de compras/reposição.

---

## ⚙️ Fluxo Operacional da Aplicação

```text
[ Entrada do Pedido ] ➔ [ Validação de Saldo ] 
                                 │
           ┌─────────────────────┴─────────────────────┐
           ▼                                           ▼
[ Estoque Insuficiente ]                   [ Estoque Disponível ]
           │                                           │
  - Cancela transação                        - Calcula valor total
  - Informa saldo restante                   - Executa baixa no estoque
  - Protege a operação                       - Emite resumo de sucesso

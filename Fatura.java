import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void mostrarFatura() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item comprado ainda.");
            return;
        }

        double valorFinal = 0;
        System.out.println("\n========= FATURA =========");
        for (Item item : itens) {
            Produto p = item.getProduto();
            System.out.println("Produto: " + p.getNome() + " (Código: " + p.getCodigo() + ")"  + " | Quantidade: " + item.getQuantidade()
             + " | Valor: R$ " + p.getPreco()
             + " | Valor total: R$ " + item.getCusto());
             valorFinal += item.getCusto();
        }
        System.out.println("=====================");
        System.out.println("VALOR FINAL: R$ " + valorFinal);
        System.out.println("==========================\n");
    }
}
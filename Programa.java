import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Coca Cola", "AXC1250", 8);
        Produto produto2 = new Produto("Pepsi", "AXC8250", 6);
        Produto produto3 = new Produto("Sprite", "AXC7250", 10);
        Fatura fatura = new Fatura();

        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção: \n1 - Comprar \n2 - Ver fatura \n3 - Encerrar Programa");
            int opcao = leia.nextInt();
            leia.nextLine();

            if (opcao == 3) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (opcao == 1) {
                System.out.println("====PRODUTO 1====");
                produto1.mostrarProduto();
                System.out.println("====PRODUTO 2====");
                produto2.mostrarProduto();
                System.out.println("====PRODUTO 3====");
                produto3.mostrarProduto();

                System.out.println("Informe o código do produto desejado:");
                String codigo = leia.nextLine();
                while (!codigo.equalsIgnoreCase(produto1.getCodigo()) 
                        && !codigo.equalsIgnoreCase(produto2.getCodigo())
                        && !codigo.equalsIgnoreCase(produto3.getCodigo())) {
                    System.out.println("O código informado não existe. Digite novamente:");
                    codigo = leia.nextLine();
                }

                System.out.println("Informe a quantidade desejada:");
                int qtd = leia.nextInt();
                leia.nextLine();
                while (qtd <= 0) {
                    System.out.println("Você precisa comprar pelo menos 1 unidade. Digite novamente:");
                    qtd = leia.nextInt();
                    leia.nextLine();
                }

                Produto escolhido;
                if (codigo.equalsIgnoreCase(produto1.getCodigo())) {
                    escolhido = produto1;
                } else if (codigo.equalsIgnoreCase(produto2.getCodigo())) {
                    escolhido = produto2;
                } else {
                    escolhido = produto3;
                }

                Item novoItem = new Item();
                novoItem.comprar(escolhido, qtd);
                fatura.adicionarItem(novoItem);

                System.out.println("Compra realizada com sucesso!\n");

            } else if (opcao == 2) {
                fatura.mostrarFatura();
            } else {
                System.out.println("Opção inválida!\n");
            }
        }

        leia.close();
    }
}
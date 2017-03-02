
import java.util.ArrayList;
import java.util.Scanner;

public class MetodosCargas {

    Scanner scan = new Scanner(System.in);
    ArrayList<Cargas> lista2 = new ArrayList<>();

    public void metodoAdicionaCarga() {

        System.out.println("\nDigite o Id da Carga: ");
        Integer id2 = scan.nextInt();
        System.out.println("Digite o nome do Produto:");
        scan.nextLine();
        String produto2 = scan.nextLine();
        System.out.println("Digite o tamanho da Carga:");
        Integer tamanho2 = scan.nextInt();
        System.out.println("Digite a origem do Produto:");
        scan.nextLine();
        String origem2 = scan.nextLine();
        System.out.println("Digite o Destino do Produto:");
        String destino2 = scan.nextLine();
        System.out.println("Digite o Valor Do Frete:");
        double ValorFrete2 = scan.nextDouble();

        Cargas carga = new Cargas();

        carga.setId(id2);
        carga.setProduto(produto2);
        carga.setTamanho(tamanho2);
        carga.setOrigem(origem2);
        carga.setDestino(destino2);
        carga.setValorFrete(ValorFrete2);

        //lista2.add(new Cargas(id2, produto2, tamanho2, origem2, destino2, ValorFrete2));
        lista2.add(carga);

    }

    public void metodoEditaCarga() {

        System.out.println("\nDigite o Id da carga a ser Editado");
        int j = scan.nextInt();

        System.out.println("Digite o Id da Carga: ");
        Integer id3 = scan.nextInt();
        System.out.println("Digite o nome do Produto:");
        scan.nextLine();
        String produto3 = scan.nextLine();
        System.out.println("Digite o tamanho da Carga:");
        Integer tamanho3 = scan.nextInt();
        System.out.println("Digite a origem do Produto:");
        scan.nextLine();
        String origem3 = scan.nextLine();
        System.out.println("Digite o Destino do Produto:");
        String destino3 = scan.nextLine();
        System.out.println("Digite o Valor Do Frete:");
        double ValorFrete3 = scan.nextDouble();

        for (int i = 0; i < lista2.size(); i++) {
            Cargas p = lista2.get(i);

            if (p.getId() == j) {

                lista2.get(i).setId(id3);
                lista2.get(i).setProduto(produto3);
                lista2.get(i).setTamanho(tamanho3);
                lista2.get(i).setOrigem(origem3);
                lista2.get(i).setDestino(destino3);
                lista2.get(i).setValorFrete(ValorFrete3);

                // Sai do loop.
                break;
            }

        }

    }

    public void metodoRemoveCarga() {

        System.out.println("\nDigite o Id da carga a ser removido");
        int m = scan.nextInt();
        for (int i = 0; i < lista2.size(); i++) {
            Cargas n = lista2.get(i);

            if (n.getId() == m) {

                // Remove.
                lista2.remove(n);

                // Sai do loop.
                break;
            }

        }

    }

    public void metodoImprimeCarga() {

        if (lista2.isEmpty()) {

            System.out.println("\nLista Vazia.\n");
        } else {
            System.out.println();
            for (int i = 0; i < lista2.size(); i++) {

                System.out.println(i + "" + lista2.get(i));
            }
        }

    }

}


import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);

    MetodosCaminhao caminhao1 = new MetodosCaminhao();
    MetodosCargas carga1 = new MetodosCargas();
    MetodosCidades cidade1 = new MetodosCidades();

    public void menu() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("Digite 1 para entrar no menu do caminhao.");
            System.out.println("Digite 2 para entrar no menu de cargas.");
            System.out.println("Digite 3 para entrar no menu de cidades.");
            System.out.println("Digite 0 para sair.");
            System.out.print("Opcao: ");

            int op = scan.nextInt();
            switch (op) {
                case 1:
                    menuCaminhao();
                    break;
                case 2:
                    menuCargas();
                    break;
                case 3:
                    menuCidades();
                    break;

                case 0:
                    exit(0);
                    break;

                default:
                    System.out.println("\nOpção Invalida.");
                    break;
            }
        }
    }

    public void menuCaminhao() throws IOException {

        while (true) {
            Caminhoes.menu();

            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    caminhao1.metodoAdicionaCaminhao();
                    break;

                case 2:
                    caminhao1.metodoRemoveCaminhao();
                    break;

                case 3:
                    caminhao1.metodoEditaCaminhao();
                    break;

                case 4:
                    caminhao1.metodoImprimeCaminhao();
                    
                    break;

                case 5:
                    menu();
                    break;

                case 0:
                    exit(0);
                    break;

                default:
                    System.out.println("\nOpção Invalida.");
                    break;
            }

        }

    }

    public void menuCargas() throws IOException {
        while (true) {

            Cargas.menu();
            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    carga1.metodoAdicionaCarga();
                    break;

                case 2:
                    carga1.metodoEditaCarga();
                    break;

                case 3:
                    carga1.metodoRemoveCarga();
                    break;

                case 4:
                    carga1.metodoImprimeCarga();
                    break;

                case 5:
                    menu();
                    break;

                case 0:
                    exit(0);
                    break;

                default:
                    System.out.println("\nOpção Invalida");
                    break;

            }
        }

    }

    public void menuCidades() throws IOException {

        while (true) {

            Cidades.menu();

            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    cidade1.metodoAdicionaCidades();
                    break;
                case 2:
                    cidade1.metodoEditaCidade();
                    break;
                case 3:
                    cidade1.metodoremovecidade();
                    break;

                case 4:
                    cidade1.metodoImprimeCidades();
                    break;

                case 5:
                    menu();
                    break;
                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("\nOpção Invalida.");
                    break;

            }

        }

    }

}

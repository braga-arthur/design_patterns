package applicationPackage;

import cozyConePackage.*;
import exceptionPackage.InvalidConeInstanceException;
import extrasPackage.Breakfast;
import extrasPackage.Fridge;
import extrasPackage.Party;
import extrasPackage.SPA;
import observerPackage.FlagObserver;
import observerPackage.Subject;
 import java.text.DecimalFormat;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        initialize();
    }

    private static void  initialize() {
        ConeFactory coneFactory = new ConeFactory();
        Scanner scanner = new Scanner(System.in);
        Cone cone = null;
        DecimalFormat dformat = new DecimalFormat("#.##");

        do {
            menu();
            System.out.print("> Sua opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 0:
                    return;
                case 1:

                    System.out.println("Cadastro do cliente");
                    System.out.print("Nome completo: ");
                    User user = new User(scanner.nextLine());

                    System.out.print("Selecione o tipo de acomodação \n | 1 - Cone Normal | 2 - Cone com Varanda | : ");

                    try {
                        cone = coneFactory.getCone((scanner.nextInt() == 1? ConeTypes.DAILY_SIMPLE_CONE : ConeTypes.DAILY_BALCONY_CONE), user);
                        SingletonCozyCone.getInstance().addCone(cone);

                        System.out.println("Serviços adicionais: ");
                        System.out.println("Digite 1 para adicionar café da manhã: ");
                        if(scanner.nextInt() == 1){
                            cone = new Breakfast(cone);
                        }

                        System.out.println("Digite 2 para adicionar frigobar: ");
                        if(scanner.nextInt() == 2){
                            cone = new Fridge(cone);
                        }

                        System.out.println("Digite 3 para adicionar SPA: ");
                        if(scanner.nextInt() == 3){
                            cone = new SPA(cone);
                        }

                        System.out.println("Digite 4 para adicionar festa no quarto: ");
                        if(scanner.nextInt() == 4){
                            cone = new Party(cone);
                        }

                    } catch (InvalidConeInstanceException e){
                        System.out.println("Invalid type of cone");
                    }

                    Subject subject = new Subject();
                    new FlagObserver(subject);

                    subject.setState(SingletonCozyCone.getInstance().isFlagFull());

                    break;
                case 2:
                    System.out.println("Check-out do cliente");
                    System.out.println("Preço: " + dformat.format(cone.getPrice()));
                    break;
            }
            scanner.nextLine();
        } while (true);
    }

    private static void menu() {
        System.out.println("Escolha uma opção: ");

        System.out.println("- 0. Sair do sistema");

        System.out.println("- Cliente:");
        System.out.println("-- 1. Check-in");
        System.out.println("-- 2. Check-out");
    }

}

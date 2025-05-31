package AgendaContatos;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Contato> contato = new ArrayList<>();
        boolean init = true;
        Scanner in = new Scanner(System.in);

        while (init) {

            System.out.println("========== Agenda de Contatos ==========");
            System.out.println("Escolha uma ação");
            System.out.println(" 1- Criar Contato\n 2- Apagar contato\n 3- Ver Contatos\n 4- Sair");
            int perguntaAcao = in.nextInt();
            in.nextLine();

            switch (perguntaAcao){

                case 1 : {

                    System.out.println("Digite um nome: ");
                    String perguntaNome = in.nextLine();

                    System.out.println("Digite um numero de Telefone: ");
                    String perguntaTel = in.nextLine();

                    contato.add(new Contato(perguntaNome, perguntaTel));

                    break;
                }
                case 2 : {

                    System.out.println("selecione um contato para apagar.");
                    for (int i = 0; i < contato.size(); i++){

                        System.out.println((i + 1) +"-"+ contato.get(i));
                    }
                    System.out.println("Selecione um contato com numero");
                    int remover = in.nextInt();
                    contato.remove(remover - 1);
                    System.out.println("Contato Removido");

                    break;
                }
                case 3 : {

                    System.out.println(">>>>>>>>>>> Contatos <<<<<<<<<<<<<");
                    System.out.println(contato);

                    break;
                }
                case 4 : {

                    System.out.println("Saindo........");

                    init = false;
                    break;
                }
                default : {

                    System.out.println("Opção Invalida!!!");

                    break;
                }
                

            }
        }
    }
}

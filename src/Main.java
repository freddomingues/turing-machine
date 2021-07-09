
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Frederico A. Domingues
 */
public class Main {

    public static void main(String[] args) {
        Machine maquina = new Machine();         //Instancia do objeto que realizará as transições da maquina
        Main main = new Main();                  //Instancia do objeto para exibir o menu
        main.menu();                             //Exibe menu no console
        Scanner tec = new Scanner(System.in);    //Instancia do objeto que pega entrada do usuário
        int opcao = tec.nextInt();               //Variável que armazena a opcao escolhida pelo usuário
        
        while(opcao != 2){                       //Repetir ate usuário escolher a opção de Saída
            switch(opcao){
                case 1:
                    maquina.start();             //Caso seja escolhida essa opção, inicia a máquina
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida! ");    
            }
            main.menu();                        
            opcao = tec.nextInt();
        }
        
    }
    
    public void menu(){
        System.out.println("______________________________________");
        System.out.println("|                                    |");
        System.out.println("|         MAQUINA DE TURING          |");
        System.out.println("|  Reconhecedor da gramática AnBnCn  |");
        System.out.println("|____________________________________|");
        System.out.println("|                                    |");
        System.out.println("|  1 | Reconhecer Palavra            |");
        System.out.println("|  2 | Sair                          |");
        System.out.println("|____________________________________|");
    }
}


import java.util.Scanner;

/*
 * Classe dedicada as ações da máquina, contendo seus
 * estados representados pelos seguintes métodos.
 */

/**
 *
 * @author Frederico A. Domingues
 */
public class Machine {
        
    int indice;
    char fita[];
    
    public void start() {
        System.out.println("-> Digite a entrada na máquina: ");
        System.out.println("Obs: Colocar 'T' no final para representar simbolo branco");
        Scanner tec = new Scanner(System.in);
        String palavra = tec.nextLine();
        indice = 0;
        fita = palavra.toCharArray();
        q0();
    }

    public void q0() {
        try {
            if(indice < fita.length){
                if(fita[indice] == 'a'){
                    fita[indice] = 'A';
                    indice++;
                    q1();
                }else if(fita[indice] == 'B'){
                    fita[indice] = 'B';
                    indice++;
                    q0();
                }else if(fita[indice] == 'C'){
                    fita[indice] = 'C';
                    indice++;
                    q0();
                }else if(fita[indice] == 'T'){
                    fita[indice] = 'T';
                    indice++;
                    qf();
                }else if(fita[indice] == 'b'){
                    fita[indice] = 'b';
                    indice++;
                    q2();
                }else if(fita[indice] == 'c'){
                    fita[indice] = 'c';
                    indice++;
                    q2();
                }else{
                    qParada();
                }
            }else qParada();
        } catch (Exception e) {
            qParada();
        }
    }
    public void q1() {
        try {
            if(indice < fita.length){
                if(fita[indice] == 'b'){
                    fita[indice] = 'B';
                    indice++;
                    q2();
                }else if(fita[indice] == 'A'){
                    fita[indice] = 'A';
                    indice++;
                    q1();
                }else if(fita[indice] == 'B'){
                    fita[indice] = 'B';
                    indice++;
                    q1();
                }else if(fita[indice] == 'a'){
                    fita[indice] = 'a';
                    indice++;
                    q1();
                }else if(fita[indice] == 'C'){
                    fita[indice] = 'C';
                    indice++;
                    q1();
                }else{
                    qParada();
                }
            } else qParada();
        } catch (Exception e) {
            qParada();
        }
    }
    public void q2() {
        try {
            if(indice < fita.length){
                if(fita[indice] == 'c'){
                    fita[indice] = 'C';
                    indice--;
                    q3();
                }else if(fita[indice] == 'b'){
                    fita[indice] = 'b';
                    indice++;
                    q2();
                }else if(fita[indice] == 'C'){
                    fita[indice] = 'C';
                    indice++;
                    q2();
                }else if(fita[indice] == 'T'){
                    fita[indice] = 'T';
                    indice--;
                    q1();
                }else{
                    qParada();
                }
            }else qParada();
        } catch (Exception e) {
            qParada();
        }
    }
    public void q3() {
        try {
            if(indice < fita.length){
                if(fita[indice] == 'T'){
                    fita[indice] = 'T';
                    indice++;
                    qf();
                }else if(fita[indice] == 'c'){
                    fita[indice] = 'C';
                    indice--;
                    q3();
                }else if(fita[indice] == 'C'){
                    fita[indice] = 'C';
                    indice--;
                    q3();
                }else if(fita[indice] == 'A'){
                    fita[indice] = 'A';
                    indice++;
                    q0();
                }else if(fita[indice] == 'B'){
                    fita[indice] = 'B';
                    indice--;
                    q3();
                }else if(fita[indice] == 'b'){
                    fita[indice] = 'b';
                    indice--;
                    q3();
                }else if(fita[indice] == 'a'){
                    fita[indice] = 'a';
                    indice--;
                    q3();
                }else{
                    qParada();
                }
            }else qParada();
        } catch (Exception e) {
            qParada();
        }
        
    }
    public void qf() {
        System.out.println("______________________");
        System.out.println("|                     |");
        System.out.println("|  PALAVRA ACEITA!!!  |");
        System.out.println("|_____________________|");
    }
    public void qParada() {
        System.out.println("______________________");
        System.out.println("|                     |");
        System.out.println("| PALAVRA NAO ACEITA  |");
        System.out.println("|_____________________|");
    }
}

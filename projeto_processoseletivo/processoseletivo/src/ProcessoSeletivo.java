import java.util.Locale;
import java.util.Scanner;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("digite sua proposta: ");
        Scanner sc = new Scanner(System.in);
    analisarCandidato(sc.nextInt());
    sc.close();
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");}
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
        
    }
}

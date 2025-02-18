package AssistenteDeVagas.Candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
        
    }
        static void imprimirSelecionados(){

            String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA"};

            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

            for(int indice=0; indice < candidatos.length;indice++) {
                System.out.println("O candidato de número " + (indice+1) + " é o "+ candidatos[indice]);

            }

            System.out.println("Forma abreviada de interação for each");

            for(String candidato: candidatos){
                System.out.println("O candidato é " + candidato);
            }

        

    }
        static void selecaoCandidatos(){

            String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA"};

            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato" + candidato + "solicitou este valor de salário" + salarioPretendido);
                if(salarioBase >= salarioPretendido){
                    System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
                    candidatosSelecionados++;
                }

                candidatosAtual++;
            }
        }

        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);

        }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        
        } else if(salarioBase == salarioPretendido) 
                System.out.println("Ligue para o candidato oferecendo uma contraproposta");
        else {
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}

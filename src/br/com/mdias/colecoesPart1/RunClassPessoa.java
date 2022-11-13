package br.com.mdias.colecoesPart1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunClassPessoa {

    public static void main(String args[]){
        grupoPessoas();
    }
    public static void grupoPessoas(){
        //Instantiating the objects
        Woman woman = new Woman();
        Man man = new Man();
        Scanner scan = new Scanner(System.in);
        List<String> interviewListWoman = new ArrayList<String>();
        List<String> interviewListMan = new ArrayList<String>();

        String genero = "";
        String nome = "";
        String nomeListMan = "";
        String nomeListwoman = "";

        //Inputting name
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("********Realize entrevista com 5 Pessoas de diferentes gêneros********\n" +
                "    ************Perguntando QUAL É O SEU NOME E GÊNERO?************");

        for (int interview = 0; interview < 5; interview++){
            System.out.println("######### "+(interview+1) + "° Intrevistado #########");
            System.out.println("Qual é seu nome?");
            nome = scan.next();
            //interviewList.add(nome);
            for (int x =0; x < 1; x++){
                System.out.println("Com qual gênero você se identifica Masculino ou Femenino?");
                genero = scan.next();
            }
            if (genero.equalsIgnoreCase("Femenino")){
                nomeListwoman = woman.setNome(nome);
                interviewListWoman.add(nomeListwoman);
                woman.setSexo('F');
            }else {
                nomeListMan = man.setNome(nome);
                interviewListMan.add(nomeListMan);
                man.setSexo('M');
            }
        }
        System.out.println("GRUPO GÊNERO MASCULINO: ("+man.getSexo()+") " + interviewListMan);
        System.out.println("GRUPO GÊNERO FEMENINO: ("+woman.getSexo()+") " +interviewListWoman);
    }
}

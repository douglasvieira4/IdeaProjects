package br.com.fatec.time;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class PrincipalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Jogador> listaJogador = new ArrayList<Jogador>();

        int opc=0;
        do{
            System.out.println("***TELA INICIAL***");
            System.out.println("1. INCLUIR JOGADOR");
            System.out.println("2. ALTERAR JOGADOR");
            System.out.println("3. PESQUISAR JOGADOR");
            System.out.println("4. EXCLUIR JOGADOR");
            System.out.println("9. SAIR");
            System.out.println("Selecione a opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    Jogador jgd = new Jogador();
                    System.out.println("Digite o id do jogador: ");
                    jgd.setId(Integer.parseInt(sc.nextLine()));

                    System.out.println("Digite o nome: ");
                    jgd.setNome(sc.nextLine());

                    System.out.println("Digite a idade: ");
                    jgd.setIdade(Integer.parseInt(sc.nextLine()));

                    System.out.println("Digite o peso: ");
                    jgd.setPeso(Double.parseDouble(sc.nextLine()));
                    
                    listaJogador.add(jgd);
                    break;

                case 2:
                    if(listaJogador.isEmpty()){
                        System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar!");
                        sc.nextLine();
                    }else {
                        System.out.println(listaJogador.toString());

                        System.out.println("Pressione um tecla para continuar.");
                        sc.nextLine();
                    }
                    break;

                case 9:
                    System.out.println("Você saiu do programa");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        }while(opc!=9);
    }
}

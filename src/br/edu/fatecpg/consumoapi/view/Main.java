package br.edu.fatecpg.consumoapi.view;

import br.edu.fatecpg.consumoapi.service.BuscaCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        //variáveis
        String cep;
        int continuar = 1;
        Scanner scanner = new Scanner(System.in);
        List<String> historico = new ArrayList<>();
        BuscaCep consumo = new BuscaCep();


        while (continuar == 1) {
            System.out.println("\n=================================\n");
            System.out.println("Digite uma opção: \n1 - Buscar cep   \n2 - ver histórico  \n3- Limpar historico \n4 - encerrar\n");
            int opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {


                case 1:

                    System.out.println("Olá, digite um cep (somente números) para buscar");
                    cep = scanner.nextLine();


                    if (cep.length() == 8) {

                        String lista = consumo.informacoes("https://viacep.com.br/ws/" + cep + "/json/");

                        System.out.println("\nResposta:");
                        System.out.println(lista);

                        historico.add(lista);



                    } else {
                        System.out.println("invalido");
                    }
                break;



                case 2:

                    for (String registro : historico)
                        System.out.println("===== Cep consultado:\n " + registro);
                break;

                case 3:
                    historico.clear();
                    System.out.println("O histórico foi limpo");
                break;

                case 4:
                    System.out.println("Programa encerrado.obrigada!");
                    continuar = 0;
                break;

            }

        }



        scanner.close();
    }
}

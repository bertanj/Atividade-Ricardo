package Atividades;

import java.util.Scanner;

public class AttTroco {
    public static void main(String[] args) {
        int t100=0, t50=0, t20=0, t10=0, t5=0, t2=0, saque, saquet;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor deseja sacar?");
        saquet = scanner.nextInt();

        saque = saquet;

        while(saque < 1){
            System.out.println("Insira um valor válido:");
            saque = scanner.nextInt();
        }

        while(saque > 0){
            if(saque >= 100) {
                saque -= 100;
                t100++;
                if(saque == 0 || saque < 100) {
                    System.out.println("Você recebeu " + t100 + " nota(s) de R$100");
                }
            }

            if (saque >=50 && saque < 100){
                saque-=50;
                t50++;
                if(saque == 0 || saque < 50){
                    System.out.println("Você recebeu " + t50 + " nota(s) de R$50");

                }
            }

            if (saque >=20 && saque < 50){
                saque-=20;
                t20++;
                if(saque == 0 || saque < 20){
                    System.out.println("Você recebeu " + t20 + " nota(s) de R$20");

                }
            }

            if (saque >=10 && saque < 20){
                saque-=10;
                t20++;
                if(saque == 0 || saque < 10){
                    System.out.println("Você recebeu " + t10 + " nota(s) de R$10");

                }
            }

            if (saque >=5 && saque < 10){
                saque-=5;
                t20++;
                if(saque == 0 || saque < 10){
                    System.out.println("Você recebeu " + t5 + " nota(s) de R$5");

                }
            }

            if (saque >=2 && saque < 5){
                saque-=2;
                t2++;
                if(saque == 0 || saque < 5){
                    System.out.println("Você recebeu " + t20 + " nota(s) de R$2");

                }
            }

            if(saque == 1){
                System.out.println("Foi possível sacar apenas R$"+(saquet-1)+", pois estamos sem modas de R$1");
                break;
            }

        }

    }
}

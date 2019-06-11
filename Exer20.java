import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomeUsuario = new String[50];
        int[] numConta = new int[nomeUsuario.length];
        double[] saldoConta = new double[nomeUsuario.length];
        int operacao;
        int numC = 0;
        int cont = 0;
        boolean validoConta = true;
        for (int i = 0; i < numConta.length; i++) {
            System.out.println("Digite o nome do cliente " + (i + 1));
            nomeUsuario[i] = scan.nextLine();
            validoConta = true;
            while(validoConta){
            System.out.println("Digite o numero da conta de " + nomeUsuario[i]);
            numC = scan.nextInt();
            for (int j = 0; j < numConta.length; j++) {
                if (numC == numConta[j]) {
                    validoConta = true;
                    System.out.println("Conta Ja Cadastrada \nTente outro numero de conta\n");
                    break;
                } else {
                    numConta[i] = numC;
                    validoConta = false;
                    break;
                }
            }
        }
            System.out.println("Digite o saldo do cliente " + nomeUsuario[i]);
            saldoConta[i] = scan.nextDouble();
            scan.nextLine();
        }
        boolean menu = true;

        do {
            System.out.println("Menu De Operações");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar saldo em conta");
            System.out.println("4. Finalizar o programa");
            operacao = scan.nextInt();
            int verificarConta = 0;
            int depositoConta = 0;
            int saqueConta = 0;

            switch (operacao) {
                case 1:
                    System.out.println("Digite o numero da conta");
                    verificarConta = scan.nextInt();
                    System.out.println("Digite o valor do deposito");
                    depositoConta = scan.nextInt();
                    break;
                case 2:
                    System.out.println("Digite o numero da conta");
                    verificarConta = scan.nextInt();
                    System.out.println("Digite o valor do saque");
                    saqueConta = scan.nextInt();
                    break;
                case 3:
                    System.out.println("Digite o numero da conta");
                    verificarConta = scan.nextInt();
                    break;
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
            boolean conta = false;
            for (int i = 0; i < nomeUsuario.length; i++) {
                if (verificarConta == numConta[i]) {
                    conta = true;
                    saldoConta[i] += depositoConta;
                    if (saldoConta[i] < saqueConta) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldoConta[i] -= saqueConta;
                    }
                    System.out.println("Saldo : " + saldoConta[i]);
                    break;
                }
            }
            if (menu) {
                if (!conta) {
                    System.out.println("Conta não Encontrada");
                }
            }

        } while (menu);
    }
}

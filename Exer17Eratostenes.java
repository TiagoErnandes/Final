public class Exer17Eratostenes {
    public static void main(String[] args) {
        int[] primos = new int[100];
        int cont=0,num=2;
        boolean achou = true;
        while(cont<100){

                for(int i=0; i <cont;i++){
                    if(num % primos[i] == 0){
                        achou = false;
                        break;
                    }
                }

            if(achou){
                primos[cont] = num;
                cont++;
            }
            num++;
            achou=true;

        }
        for(int i =0 ; i <primos.length;i++){
            System.out.print(" "+primos[i]);
        }

    }
}

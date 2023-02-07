import java.util.Scanner;
    public class Ex2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int i, j, maior;

            System.out.println("Digite um valor de inicio: ");
            i = input.nextInt();
            System.out.println("Digite o valor final: ");
            j = input.nextInt();

            maior = calcular(i, j);

            System.out.println("Max number: " + maior);
        }

        public static int calcular(int i, int j) {
            int repeticao, maior, n;
            maior = 0;

            for (; i <= j; i++) {
                repeticao = 0;
                n = i;
                while (true) {
                    repeticao++;
                    if(n == 1){
                        break;
                    }
                    if(n % 2 != 0){
                        n = n * 3 + 1;
                    }
                    else{
                        n = n/2;
                    }
                }
                if(repeticao > maior){
                    maior = repeticao;
                }
            }
            return maior;
        }
    }



import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite um valor: ");
        n = input.nextInt();

        imprimir(n);

    }
    public static void imprimir(int n) {
        if(n == 1){
            System.out.println("Erro");
            System.exit(0);
        }
        else {
            while(n != 1){
                if(n % 2 != 0){
                    n = n * 3 + 1;
                    System.out.println(n);
                }
                else{
                    n = n / 2;
                    System.out.println(n);
                }
            }
        }
    }
}

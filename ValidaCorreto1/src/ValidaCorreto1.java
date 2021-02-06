import java.util.Scanner;

public class ValidaCorreto1 {
    public static void main(String[] args) throws Exception {
        // Para utilizar a entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Declara��o de vari�veis
        double num, raiz;

        //{entrada de dados}
        num = -1; //valor inicial conveniente para testar a valida��o
        while (num < 0)
        {
            System.out.print("Digite um n�mero positivo: ");
            num = entrada.nextDouble();
            if (num < 0) // Redund�ncia de verifica��o, isto pode ser melhorado !!!
            {
                System.out.println("Valor Inv�lido");
            }                
            System.out.println(); // Pular linha"
        }

        //{Processamento: Tenta extrair a raiz quadrada do n�mero lido}
        raiz = Math.sqrt(num);

        //{Sa�da de dados}
        System.out.println("Raiz quadrada de " + num + ": " + raiz);

        // Fechando o objeto de entrada de dados
        entrada.close();
    }
}

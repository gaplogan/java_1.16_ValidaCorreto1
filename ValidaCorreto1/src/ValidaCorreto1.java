import java.util.Scanner;

public class ValidaCorreto1 {
    public static void main(String[] args) throws Exception {
        // Para utilizar a entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Declaração de variáveis
        double num, raiz;

        //{entrada de dados}
        num = -1; //valor inicial conveniente para testar a validação
        while (num < 0)
        {
            System.out.print("Digite um número positivo: ");
            num = entrada.nextDouble();
            if (num < 0) // Redundância de verificação, isto pode ser melhorado !!!
            {
                System.out.println("Valor Inválido");
            }                
            System.out.println(); // Pular linha"
        }

        //{Processamento: Tenta extrair a raiz quadrada do número lido}
        raiz = Math.sqrt(num);

        //{Saída de dados}
        System.out.println("Raiz quadrada de " + num + ": " + raiz);

        // Fechando o objeto de entrada de dados
        entrada.close();
    }
}

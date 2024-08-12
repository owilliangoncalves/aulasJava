// Entendendo como funciona tipo de dados em Java
public class App {
   public static void main(String[] args) {
       // Em java temos os dados primitivos e os de referência. Vejamos:
       // Primitivos:
    //    byte, short, int, long, float. Com exceção do float, os demais são para valores numéricos e a diferença esta no tamanho do número que é possível armazenar 
       int idade;
       idade = 28;
       float altura;
       altura = 1.73f;
       //    Para um único caracter usamos char e o valor deve estar entre aspas simples
       char genero;
       genero = 'm';

       //    boolean armazena apenas true ou false
       boolean pcd;
       pcd = true;

       //    Tipo de Referência. Repare que a tipagem inicia com letra em caixa alta, pois se trata de uma classe
       String nome;
       nome = "Willian Gonçalves";

       //    Operadores aritméticos
       int n1 = 1;
       int n2 = 2;
       int soma = n1+n2;
       System.out.println(soma);
       System.out.println(n1 * n2);
       System.out.println(n1 - n2);
       System.out.println(n1 / n2);
       System.out.println(n1 % n2);
       System.out.println(n1++);
       System.out.println(n1--);

       
       
       
       


   }
    }


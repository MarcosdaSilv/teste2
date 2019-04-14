
package somavetor;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Somavetor {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
int dados[] = new int[10];
//leitura
for (int i = 0; i < dados.length; i++) {
System.out.print("Digite o valor para o indice " + i + ":" );
try{dados[i] = sc.nextInt();
}catch(InputMismatchException e){
sc.nextLine();
i--;
System.out.print("Entrada não permitida ");}
finally{ }
}
//soma dos elementos
int soma = 0;
try{for (int i = 0; i < 15; i++)
soma = soma + dados[i];
System.err.println("A soma dos elementos é : "+soma);
sc.close();
}
catch(ArrayIndexOutOfBoundsException e ){
for(int i = 0; i<10; i++)
    soma = soma + dados[i];
System.out.println("A soma dos elemento é :"+soma);
sc.close();}
  
    }
    
}

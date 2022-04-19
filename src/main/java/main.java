import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] anum = new int[10];
        int [] anum2 = new int[10];

        metodos.pedir(anum);

        metodos.comparar(anum,anum2);

        metodos.imprimir(anum,anum2);

    }



}



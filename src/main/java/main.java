import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] anum = new int[10];
        int [] anum2 = new int[10];

        pedir(anum);

        comparar(anum,anum2);
        imprimir(anum,anum2);

    }

    private static void pedir(int anum[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Numero:");
            anum[i]=Integer.parseInt(sc.nextLine());
        }
    }
    private  static void comparar(int anum[],int anum2[]){
        int cont=0;
        for(int x=0; x<10; x++){
            cont=0;
            for(int y=0; y<10; y++){
                if(anum[x] == anum[y])
                anum2[x]=cont++;
            }
        }
    }
    private  static void imprimir(int anum[],int anum2[]){
        System.out.printf("\n{");
        for(int x=0; x<10; x++){
            if(x==9)
                System.out.printf("%d=%d",anum[x],anum2[x]);
            else
                System.out.printf("%d=%d,",anum[x],anum2[x]);
        }
        System.out.printf("}");
    }

}



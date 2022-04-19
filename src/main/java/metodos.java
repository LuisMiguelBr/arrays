import java.util.Scanner;

public class metodos {
    public  static void pedir(int anum[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Numero:");
            anum[i]=Integer.parseInt(sc.nextLine());
        }
    }
    public   static void comparar(int anum[],int anum2[]){
        int cont=0;
        for(int x=0; x<10; x++){
            cont=1;
            for(int y=0; y<10; y++){
                if(anum[x] == anum[y])
                    anum2[x]=cont++;
            }
        }
    }
    public  static void imprimir(int anum[],int anum2[]){
        int aux=0;
        System.out.printf("\n{");
        for(int x=0; x<10; x++){
            if(anum[x]!=aux) {
                if (x == 9)
                    System.out.printf("%d=%d", anum[x], anum2[x]);
                else
                    System.out.printf("%d=%d,", anum[x], anum2[x]);
            }


            aux=anum[x];
        }
        System.out.printf("}");
    }



}

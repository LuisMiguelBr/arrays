import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] anum = new int[10];
        int [] anum2 = new int[]{1,2,3,4,5,6,7,8,9,10};


        for(int i=0; i<=10; i++){
            System.out.println("Numero:");
            anum[i]=Integer.parseInt(sc.nextLine());
        }
        for(int y=0; y<=10; y++){
            System.out.printf("%d - %d",anum[y],anum2[y]);
        }

    }




}



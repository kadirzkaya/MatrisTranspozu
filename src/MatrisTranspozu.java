import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        String[][] arr=new String[2][3];
        String[][] newArr=new String[3][2];
        String t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Matris : ");
        for (int i=0; i<2;i++){
            t=sc.nextLine();

            for (int j=0;j<t.split(" ").length;j++){
                arr[i][j]=t.split(" ")[j];
            }

        }

        for (int i=0; i<3;i++){

            for (int j=0;j<2;j++){
                newArr[i][j]=arr[j][i];
            }

        }

        System.out.println("Transpoze : ");
        for (String[] k:newArr){
            for (String m:k){
                System.out.print(m+" ");
            }
            System.out.println();
        }





    }
}

//prob2
import java.util.Scanner;
public class Matrice {


    public boolean verif(int[][]matr,int nr_lin,int nr_col){
        if(nr_lin!=nr_col) return false;
        for(int i = 0 ; i < nr_lin;i++)
        {
            for(int j = 0 ; j < nr_col ;j++)
            {
                if(matr[i][j]!=matr[j][i]) return false;
            }
        }
        return true;
    }


    public static void main(String[]arg){
        int lin,col;
        Scanner in=new Scanner(System.in);
        lin=in.nextInt();
        col=in.nextInt();
        int[][]matrice=new int[lin][col];
        for(int i = 0 ;i <lin; i ++)
            for(int j = 0; j <col ;j++)
                matrice[i][j]=in.nextInt();
        Matrice ob=new Matrice();
        System.out.println(ob.verif(matrice,lin,col));
    }
}

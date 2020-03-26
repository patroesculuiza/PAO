//prob3

import java.util.Scanner;
public class Matr{

    private int[][]matr;
    private int nr_col,nr_lin;
    public Matr(int[][]a,int lin,int col)
    {
        nr_col=col;
        nr_lin=lin;
        matr=new int[lin][col];
        matr=a;
    }


    public int[][] add(int[][]matr2)
    {
        for(int i = 0 ; i < nr_lin;i++)
            for(int j = 0; j < nr_col;j++)
                matr2[i][j]+=matr[i][j];

        return matr2;
    }

    public int[][] multiply(int[][]matr2, int lin,int col)
    {
        int[][]temp=new int[nr_lin][col];
        if(lin!=nr_col)  { System.out.println("error lenght");
            return  temp;
        }
        for(int i=0;i<nr_lin;i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = 0;
                for (int k = 0; k < nr_col; k++) {
                    temp[i][j] += matr[i][k] * matr2[k][j];
                }
            }
        }

        return temp;
    }
    public int[][] pow(int power)
    {
        int[][]temp=new int[nr_lin][nr_col];
        temp=matr;
        for(int i = 1 ; i < power ; i++)
        {
            temp=multiply(temp,nr_lin,nr_col);
        }
        return temp;
    }
    public String toString() {

        StringBuilder b = new StringBuilder();
        b.append(String.valueOf(nr_lin));
        b.append(' ');
        b.append(String.valueOf(nr_col));
        b.append('\n');

        for (int i = 0; i < nr_lin; i++) {
            for(int j = 0 ; j< nr_col;j++) {
                b.append(String.valueOf(matr[i][j]));
                b.append(' ');
            }
            b.append('\n');
        }

        return b.toString();
    }
    public static void main(String[]arg){
        int lin,col,lin1,col1;
        Scanner in=new Scanner(System.in);
        lin=in.nextInt();
        col=in.nextInt();
        int[][]matrice=new int[lin][col];
        for(int i = 0 ;i <lin; i ++)
            for(int j = 0; j <col ;j++)
                matrice[i][j]=in.nextInt();

        lin1=in.nextInt();
        col1=in.nextInt();
        int[][]matrice1=new int[lin][col];
        for(int i = 0 ;i <lin1; i ++)
            for(int j = 0; j <col1 ;j++)
                matrice1[i][j]=in.nextInt();

        Matr ob=new Matr(matrice,lin,col);
        matrice1 =ob.multiply(matrice1,lin1,col1);
        Matr ob1=new Matr(matrice1,lin,col1);


        //  System.out.println(ob.toString());
        System.out.println(ob1.toString());
    }
}

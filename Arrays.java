public class Arrays {
    int[]array;

    public Arrays(int []arr)
    {
        array=arr;
    }
    public int[] cautare(int[]arr, int element)
    {
        int poz=-1;
        for(int i = 0; i<array.length;i++)
        {
            if(array[i]==element) poz=i;
        }
        if(poz==-1) {
            System.out.println("nu exista element\n");return null;
                    }
      int []arra=new int[array.length-poz];
      System.arraycopy(array,poz,arra,0,array.length-poz);
      arr=arra;

     return arr;
    }
    public static void main(String[] args)
    {

        int []arr={1,5,6,9,12,22,7,20};


        Arrays ob=new Arrays(arr);
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
        int[]vec=new int[arr.length ];
       vec= ob.cautare(vec,9);
      if(vec!=null ){
        for(int i = 0 ; i < vec.length;i++)
        {
            System.out.print(vec[i]);
            System.out.print(" ");
        }
      }
    }
}

public class Maximum {
    private int nr;
    public Maximum(int element){nr=element;}
   public int maxim(int a){
        if(a<nr) return nr;
        return a;
   }
   public int maxim(int a, int b){
        if(a>maxim(b)) return a;
        return maxim(b);
   }
   public int maxim(int a, int b, int  c)
   {
      return maxim(maxim(a,b),c);
   }
   public int maxim(int a, int b, int c, int d)
   {
       return maxim(maxim(a,b,c),d);
   }
public static void main(String[]atr){
        Maximum ob=new Maximum(-1);
       System.out.println(ob.maxim(-1,-2,-3,-4));
}
}

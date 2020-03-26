public class Complex {
    private double real,imag;
    public Complex(double re,double im)
    {
        real=re;
        imag=im;
    }
    public Complex(){
        new Complex(0, 0);
    }
    public void suma(Complex ob)
    {
        imag+=ob.imag;
        real+=ob.real;
    }
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append("real:");
        b.append(imag);
        b.append(" imaginar:");
        b.append(real);
        b.append('\n');
        return b.toString();
    }
    public boolean equals(Complex ob)
    {
        if(imag==ob.imag && real==ob.real) return true;
        return false;
    }
    public static void main(String[]arg)
    {
        Complex ob=new Complex(2,3);
        Complex ob1=new Complex(3,2);
        ob.suma(ob1);
        System.out.println(ob.equals(ob1));
        System.out.println(ob.toString());

    }
}

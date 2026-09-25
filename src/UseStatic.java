public class UseStatic {
    static int a=3;
    static int b;
    static void meth(int x){
        System.out.println("meth(x):"+x);
        System.out.println("meth(a):"+a);
        System.out.println("meth(b):"+b);
    }
    static{
        System.out.println("static");
        b=a*4;
    }
    public static void main(String[] args) {
            meth(2);
    }
}

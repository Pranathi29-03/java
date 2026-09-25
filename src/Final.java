import com.sun.tools.javac.Main;

public class Final {
    final int x=20;
    public static void main(String[] args) {
        Main myobj=new Main();
        myobj.x=25;
        System.out.println(myobj.x)
    }
}

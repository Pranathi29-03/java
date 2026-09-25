import java.util.Scanner;

public class Area {
        public static void main(String[]args){
            int rad;
            double area;
            Scanner sc=new Scanner(System.in);
            System.out.println("radius:");
            rad=sc.nextInt();
            area = 3.14*rad*rad;
            System.out.println("area:"+area);
        }
    }


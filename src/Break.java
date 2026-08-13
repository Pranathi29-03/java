public class Break {
    public static void main(String[] args){
        boolean t= true;
            first:{
            second:{
                third:{
                       System.out.println("before the break");
                       if(t)
                           break second;
                       System.out.println("This wont excute");
                }System.out.println("this wont excute");
            }System.out.print("this is after second break");

            }

    }
}

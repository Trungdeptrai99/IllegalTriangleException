import java.util.Scanner;

public class TriangleException {
    public static boolean checkTrue(int a,int b,int c){
        if(a<0||b<0||c<0){
            return true;
        }
            return false;
    }
    public static int findMax(int a,int b,int c){
        int max = a;
        if(max<b) max = b;
        if(max<c) max = c;
        return max;
    }
    public static void main(String[] args) {
     while (true){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập a");
         int a=  sc.nextInt();
         System.out.println("Nhập b");
         int b=  sc.nextInt();
         System.out.println("Nhập c");
         int c=  sc.nextInt();

         try {
             if(checkTrue(a,b,c)){
                 throw new Exception("Ngoại lệ 1");

             }
             if(a+b+c <= (2*findMax(a,b,c))){

                 throw new Exception("Ngoại lệ 2");
             }
         }catch (Exception e){
             System.out.println("Trong khối catch "+e.getMessage());
         }
         System.out.println("Tôi ở ngoài này bạn eiii");
     }
    }
}

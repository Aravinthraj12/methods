import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        boolean e=ar(a);
        System.out.println(e);

        //digit number that contain armstrong
        System.out.println("3 digits number that contain amstong number");
        for(int i=100;i<=1000;i++){
            if(ar(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean ar(int a){
        int b=a;
        int c=0;
        int sum=0;
        while(a>0){
            int r=a%10;
            c=r*r*r;
            sum=sum+c;
            a=a/10;
        }
        return sum==b;
    }
}

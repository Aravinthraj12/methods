//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=sums();
        System.out.println(a);
        int s=sums2(45,98);
        System.out.println(s);
    }
    static int sums(){
        int a=100;
        int b=23;
        int sum=a+b;
        return sum;
    }
    static int sums2(int w,int e){
        int sum =w+e;
        return sum;
    }
}
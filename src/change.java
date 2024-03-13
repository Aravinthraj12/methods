public class change {
    public static void main(String[] args) {

        int a=10;
        int b=19;
        change(a, b);



    }
    static void change(int a, int b  ) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}

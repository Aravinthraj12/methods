public class Scope {
    static int x=19;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 28;
        System.out.println(x);
        sco();
    }//scoping using two different value with same variable name
    static void sco(){
        System.out.println(x);
    }
}

import java.util.Arrays;

public class Variableargument {
    public static void main(String[] args) {
        arg(4,5,322,4,5,2,6,7,4,5,6,7);
    }
    static void arg(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

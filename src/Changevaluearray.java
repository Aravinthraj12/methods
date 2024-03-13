import java.util.Arrays;

public class Changevaluearray {
    public static void main(String[] args) {
        int arr[]={12,43,564,332,43,2};
        value(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void value(int num[]){
       num[0]=21;
        //System.out.println(Arrays.toString(num));
    }
}

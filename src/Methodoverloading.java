import java.util.Arrays;

public class Methodoverloading {
    public static void main(String[] args) {
     over(23);
     over("aravinth");

     int oi=orer(23,43);
        System.out.println(oi);
        //era(47,57,3,2,1,4);
        era("Aravinth");
    }
    static int orer(int num,int num1) {  //66
        return num+num1;
    }
    static void over(int name){//23
        System.out.println(name);
    }
    static void over(String se){
        System.out.println(se);//aravint
    }

    static void era(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void era(String ...v){
        System.out.println(Arrays.toString(v));
    }



}

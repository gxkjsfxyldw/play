package study;



public class four {
    public static void main(String[] args) {
        System.out.println("ldw");
        int ldw = ldw(3, 4);
        if("1".equals(String.valueOf(ldw))){
            System.out.println(ldw);
        }
    }
    public static int ldw(double a,double b){
        System.out.println(a);
        System.out.println(b);
        return a>b? 1:0;
    }


    public static boolean test(int a,int b){
        return b<a? true:false;
    }
}

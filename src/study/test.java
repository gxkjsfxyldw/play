package study;

public class test {
    public static void main(String[] args) {
        String listType ="201";
        String medChrgitmType ="01";

        if(listType != "201" || !medChrgitmType.matches("03|02|12|04")){
            System.out.println("自费");
        }else{
            System.out.println("报销");
            System.out.println("ldw");
            System.out.println("ldw2");
            System.out.println("ldw3");
        }

    }
}

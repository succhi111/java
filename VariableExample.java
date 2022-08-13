public class VariableExample {
    static int b=20;  //static
    int c=30;  //instance

    public static void main(String[] args) {
        {
            int a=10;  //local
            VariableExample ref =new VariableExample();
            System.out.println(a);
            System.out.println(VariableExample.b);
            System.out.println(ref.c);
        }
    }
}

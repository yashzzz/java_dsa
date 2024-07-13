public class Type_promotion {
    public static void main(String args[]){
        char a = 'a';
        char b ='b';
        int c = b - a;
        System.out.println((int)a); //by type casting we can find value of a
        System.out.println((int)b);
        System.out.println(c);
    }
}

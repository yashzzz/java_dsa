public class Linear2 {
    public static void main(String[] args) {
        String name = "yash";
        char target = 'e';
        boolean b = search(name, target);
        System.out.println(b);
    }
    static boolean search( String name , char target ){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}

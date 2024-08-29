public class child{

    public void show(){
        System.out.println("hey i m the function of parent class");
    }
        
    }

class opps extends child
   {
    public void show(){
        System.out.println("hey i m function of child class");
    }
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
   }
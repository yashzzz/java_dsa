public class opps1 {
    int rollno;
    String name;
    String adress;

    public opps1(){
        System.out.println("defalut constuctor");
    }
    public opps1(int i , String s , String j){
        rollno = i;
        name = s;
        adress = j;
    }
    public void show(){
        System.out.println("name of student is " + name);
    }
    public void alldetails(){
        System.out.println("name of student is " + name );
        System.out.println("id of student is " + rollno);
        System.out.println("adress of student is " + adress );
    }
    }


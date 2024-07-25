public class Arr3 {
    public static int search(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
    return -1;
    }
    public static void main(String args[]){
        int number[] = {1 , 2 , 3 , 4 , 5 };
        int key=4;
        int index=search(number, key);
        if(index == -1){
            System.out.println("value is not present in the array");
        }
        else{
            System.out.println("value is present at index = "+ index);
        }

    }
}

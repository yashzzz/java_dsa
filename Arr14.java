public class Arr14 {
    public static void stocks(int price[]){
        int buy_price= Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<price.length;i++){
            if(buy_price<price[i]){
                int profit = price[i]-buy_price;
                max= Math.max(profit,max);
            }
            else{
                buy_price=price[i];
        }
        }System.out.println(max);
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        stocks(price );
    }
}

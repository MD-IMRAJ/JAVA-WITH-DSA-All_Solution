public class LargestNumber {
    public static int getLargest(int number[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(Largest<number[i]){
                Largest=number[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int number[]={1,2,6,3,5};
        System.out.println("Largest Value is:"+getLargest(number));
    }
}

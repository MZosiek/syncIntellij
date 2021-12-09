public class petle {
    public static void main(String[] args) {


   /*     for (int i=1; i<100; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }

    */

        int[] numbers = new int[] {1,3,5,6,8,15};
        int[] reversed = new int[numbers.length];
        int j=numbers.length-1;

        for(int i=0; i<numbers.length;i++){

            reversed[i]=numbers[j];
            j--;
        }

        for(int i =0; i<reversed.length; i++){
            System.out.println(reversed[i]);
        }

    }
}

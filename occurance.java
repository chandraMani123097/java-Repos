public class occurance {
    public static boolean checkShorting(int arr[], int idx){
        if (idx==arr.length-1) {
            return true;
            
        }        

        if (arr[idx]<arr[idx+1]) {
          return  checkShorting(arr, idx+1);
            
        }else{
            return false;
        }
    }
   public static void main(String[] args) {
    int arr[]={1,2,3,5,7};
   System.out.println( checkShorting(arr, 0));

   }
}

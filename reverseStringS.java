public class reverseStringS {

    public static void reverse_strings(String str, int idx) {
          if(idx==0){
            System.out.print(str.charAt(idx));
            return;
          }

        System.out.print(str.charAt(idx));
        reverse_strings(str, idx-1);
        
    }

    public static void main(String[] args) {
        String str="abcde";
        reverse_strings(str, str.length()-1);
    }
}
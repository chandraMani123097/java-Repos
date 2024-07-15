

public class revreseStrThrRec {
    public static void StrRev(String str, int idx){
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
            
        }
        System.out.println(str.charAt(idx));
        StrRev(str,idx-1);
    }
    public static void main(String[] args) 
   
    
    {

       String Str="abcdefgh";
       StrRev(Str, Str.length()-1);



    }
}

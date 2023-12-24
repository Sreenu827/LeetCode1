public class Palandrome{
    public static boolean isPalandrome(int x){
        String str = Integer.toString(x);
        int i = 0;
        int j = str.length() -1;

        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String []args){
        int Number = 1222;
        boolean result = isPalandrome(Number);

        System.out.println("The Given Number : " + Number + " Is a Palandrome? " + result);    
    }
}

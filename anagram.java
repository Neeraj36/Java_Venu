import java.util.Scanner;

public class Anagram {
 static boolean isAnagram(String a, String b) {
        
        String[] arr1 = a.trim().split("");

        String[] arr2 = b.trim().split("");

        int count = 0;

        if (arr1.length != arr2.length){
            return false;
        }else{
            for(String c: arr1){
                for(int i = 0; i < arr2.length; i++){
                    if(c.equalsIgnoreCase(arr2[i])){
                        count++;
                        arr2[i] = null;
                        break;
                    }
                }
            }
        }

        if(count == arr2.length){
            return true;
        }

                return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

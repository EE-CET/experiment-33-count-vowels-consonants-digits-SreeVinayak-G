import java.util.Scanner;

public class CountCharacters {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                int n = s.length();
                int vowelCount = 0;
                int consonantCount = 0;
                int digitCount = 0;
                int specialCharCount = 0;
                for(int i=0;i<n;i++){
                        char ch = Character.toLowerCase(s.charAt(i));
                        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                                vowelCount++;
                        }
                        else if(ch>'a' && ch<'z'){
                                consonantCount++;
                        }
                        else if(ch>='0' && ch<='9'){
                                digitCount++;
                        }
                        else{
                                specialCharCount++;
                        }
                }
                int[] op = new int[]{vowelCount, consonantCount, digitCount, specialCharCount};
                for(int i=0;i<4;i++){
                        if(i!=3){
                                System.out.print(op[i]+" ");
                        }
                        else{
                                System.out.print(op[i]);
                        }
                }
        }
    
}

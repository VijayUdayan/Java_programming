import java.util.Scanner;
public class AsciiWord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int w = 0;
        System.out.print("Enter a string: ");
        String line = sc.nextLine();
        int x = line.length();
        for(int i=0; i<x; i++){
            char ch=line.charAt(i);  
            int a = ch;
            w = w + a;
        }
        System.out.println(w); 
        System.out.println(w*w);
        sc.close();
    }
}

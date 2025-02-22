import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        bufferedReader.close();

        try{
            System.out.print(Integer.parseInt(S));
        }catch (Exception e){
            System.out.print("Bad String");
        }

    }
}
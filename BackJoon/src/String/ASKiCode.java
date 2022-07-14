// [BackJoon] 11654번 : 아스키 코드
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASKiCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aski = (int) br.readLine().charAt(0);

        System.out.println(aski);

        br.close();
    }
}

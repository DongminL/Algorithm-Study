// [BackJoon] 11720번 : 숫자의 합
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();

        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(num.substring(i, i+1));
        }

        System.out.println(sum);

        br.close();
    }
}

// [BackJoon] 2869번 : 달팽이는 올라가고 싶다.
package basicMath;

import java.io.*;
import java.util.StringTokenizer;

public class Snail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int daytime = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int days = (height - night) / (daytime - night);

        if ((height - night) % (daytime - night) != 0)
            days++;

        bw.write(String.valueOf(days));

        bw.flush();
    }
}

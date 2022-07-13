// [BackJoon] 1546번 : 평균
package oneDimaArray;
import java.io.*;
import java.util.StringTokenizer;

public class SejoonAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count;
        int[] score;
        int max = 0;
        double average = 0;

        count = Integer.parseInt(br.readLine());

        score = new int[count];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            if (st.hasMoreTokens())
                score[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < count; i++) {
            max = (score[i] > max) ? score[i] : max;
        }

        for (int i = 0; i < count; i++) {
            average += ((((double)score[i] / max)) * 100) / count;
        }

        bw.write(Double.toString(average));

        br.close();
        bw.flush();
    }
}

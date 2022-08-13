// [BackJoon] 2751번 : 수 정렬하기 2
package sorting;

import java.io.*;
import java.util.Arrays;

public class SortingNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        for (int num : nums)
            bw.write(num + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

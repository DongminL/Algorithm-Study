//[BackJoon] 15596번 : 정수 N개의 합
package function;

public class IntegerSum {
    long sum(int[] a) {
        long ans = 0;
        for(int i : a)
            ans += i;
        return ans;
    }
}

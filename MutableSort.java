// good
import java.util.Arrays;
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {(Integer.parseInt(args[0])), (Integer.parseInt(args[1])), (Integer.parseInt(args[2]))};
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i<a.length;i++){
            if (a[maxIndex]<=a[i]){
                maxIndex = i;
            }
            if (a[minIndex]>a[i]){
                minIndex = i;
            }
        }
        int maxValue = a[maxIndex];
        int minValue = a[minIndex];
        int medValue = a[3-maxIndex-minIndex];
        a[0] = minValue;
        a[1] = medValue;
        a[2] = maxValue;

        System.out.println(Arrays.toString(a));
    }
}

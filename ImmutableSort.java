// nicely done
import java.util.Arrays;
public class ImmutableSort {
    
    public static void main(String[] args) {
        
        int[] a = {(Integer.parseInt(args[0])), (Integer.parseInt(args[1])), (Integer.parseInt(args[2]))};
        // NOTE: I think better variable names would be maxIndex and minIndex (technically indexOfMax but that's getting too verbose)
        int maxValue = 0;
        int minValue = 0;
        for(int i = 0; i<a.length;i++){
            if (a[maxValue]<a[i]){
                maxValue = i;
            }
            if (a[minValue]>=a[i]){
                minValue = i;
            }
        }
        int[] numList = new int[3];
        numList[0] = a[minValue];
        numList[2] = a[maxValue];
        // NOTE: love this trick!
        numList[1] = a[3-maxValue-minValue];
        
        System.out.println(Arrays.toString(numList));

        
    }
}

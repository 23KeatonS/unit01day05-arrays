public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {(Integer.parseInt(args[0])), (Integer.parseInt(args[1])), (Integer.parseInt(args[2]))};
        int maxValue = a[0];
        int minValue = a[0];
        for (int i = 0; i < a.length; i ++){
            if (maxValue<a[i]){
                maxValue = a[i];
            }
        }
        for (int i = 0; i < a.length; i ++){
            if (minValue>a[i]){
                minValue = a[i];
            }
        }
        System.out.println(maxValue-minValue);
    }
}

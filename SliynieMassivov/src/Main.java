import java.util.Arrays;

public class Main {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arrResult = new int[arr1.length + arr2.length];
        int indexArr1 = 0;
        int indexArr2 = 0;
        int count = 0;

        while (count < arrResult.length) {
            arrResult[count] = arr1[indexArr1] < arr2[indexArr2] ? arr1[indexArr1++] : arr2[indexArr2++];
            if (indexArr1 == arr1.length) {
                System.arraycopy(arr2, indexArr2, arrResult, ++count, arr2.length - indexArr2);
                break;
            }
            if (indexArr2 == arr2.length) {
                System.arraycopy(arr1, indexArr1, arrResult, ++count, arr1.length - indexArr1);
                break;
            }
            count++;
        }
        return arrResult;
    }


    public static void main(String[] args) {
        int[] arr1 = {-5,-1,0,3,6,7,8,11,11,12,19};
        int[] arr2 = {-4,1,2,15,16,19,20};
        int[] result = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
import java.lang.reflect.Array;

public class BubbleSort {

    public void bubbleSort(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            for (int k = 0; k < (n-i-1); k++){
                if (array[k] > array[k+1]){
                    int swapIndex = array[k];
                    array[k] = array[k+1];
                    array[k+1] = swapIndex;
                }
            }
        }
    }

    public String toString(int array[]){
        String s = "";
        for (int i = 0; i < array.length; i++){
            s += array[i] + " ";
        }
        return s;
    }

    public static void main(String args[]){
        BubbleSort bubble = new BubbleSort();
        int array[] = {2, 5, 6, 1, 8};
        bubble.bubbleSort(array);
        System.out.println(bubble.toString(array));
    }
}

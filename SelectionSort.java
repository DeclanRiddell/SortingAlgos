public class SelectionSort {

    public void selectionSort(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            int search = i;
            for (int k = i+1; k < n; k++){
                if (array[k] < array[search]){
                    search = k;
                }
                else {
                    int swapIndex = array[search];
                    array[search] = array[i];
                    array[i] = swapIndex;
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
        SelectionSort ss = new SelectionSort();
        int array[] = {2, 5, 6, 1, 8};
        ss.selectionSort(array);
        System.out.println(ss.toString(array));
    }
}

public class QuickSort {
    public int partition(int array[], int l, int h){
        int pivot = array[h];
        int i = l - 1;
        for (int j = l; j < h; j++){
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i+1] = array[h];
        array[h] = temp;
        return (i + 1);
    }

    public void sort(int array[], int l, int h){
        if (l < h){
            int index = partition(array, l, h);
            sort(array, l, index -1);
            sort(array, index+1, h);
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
        int array[] = {4, 12, 17, 2, 27};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);
        System.out.println(quickSort.toString(array));

        int array2[] = {7, 13, 17, 45, 98};
        quickSort.sort(array2, 0, array2.length - 1);
        System.out.println(quickSort.toString(array2));
    }
}

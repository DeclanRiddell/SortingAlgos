public class MergeSort {
    public void merge(int array[]){
        if (array.length > 1) {
            int sub1 = array.length / 2;
            int sub2 = array.length - sub1; //from last point of sub1 to the end of the collection
            int SA1[] = new int[sub1]; // smaller subarray
            int SA2[] = new int[sub2]; // second subarray
            int comparisons = 0;

            for (int i = 0; i < sub1; i++) {
                SA1[i] = array[i];
            }
            for (int i = 0; i < sub2; i++) {
                SA2[i] = array[sub1 + i];
            }

            merge(SA1);
            merge(SA2);

            int firstIndexSA1 = 0;
            int firstIndexSA2 = 0;
            int i = 0;
            while (firstIndexSA1 < sub1 && firstIndexSA2 < sub2) {
                if (SA1[firstIndexSA1] < SA2[firstIndexSA2]) {
                    array[i] = SA1[firstIndexSA1];
                    firstIndexSA1 = firstIndexSA1 + 1;
                    comparisons++;
                    i++;
                } else {
                    array[i] = SA2[firstIndexSA2];
                    firstIndexSA2 = firstIndexSA2 + 1;
                    comparisons++;
                    i++;
                }
            }
            if (sub1 <= firstIndexSA1) {
                while(firstIndexSA2 < sub2){
                    array[i] = SA2[firstIndexSA2];
                    firstIndexSA2 = firstIndexSA2 + 1;
                    i++;
                }
            }
            else{
                while(firstIndexSA1 < sub1){
                    array[i] = SA1[firstIndexSA1];
                    firstIndexSA1 = firstIndexSA1 + 1;
                    i++;
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
        int array[] = {4, 12, 17, 2, 27};
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(array);
        System.out.println(mergeSort.toString(array));

        int array2[] = {7, 13, 17, 45, 98};
        mergeSort.merge(array2);
        System.out.println(mergeSort.toString(array2));
    }
}

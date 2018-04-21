package sort;

import static sort.SortUtils.*;

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 *
 * @see SortAlgorithm
 */

class BubbleSort implements SortAlgorithm {
    /**
     * This method implements the Generic Bubble Sort
     *
     * @param array The array to be sorted
     * Sorts the array in increasing order
     **/

    @Override
    public  <T extends Comparable<T>> T[] sort(T array[]) {
        int last = array.length;
        //Sorting
        boolean swap;
        do {
            swap = false;
            for (int count = 0; count < last-1; count++) {
                if (less(array[count], array[count + 1])) {
                    swap = swap(array, count, count + 1);
                }
            }
            last--;
        } while (swap);
        return array;
    }

    // Driver Program
    public static void main(String[] args) {

        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12, 34, 97};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integers);

        // Output => 1	  4	 6	9	12	23	54	78	231
        print(integers);

        // String Input
        String[] strings = {"c", "a", "e", "b","d"};
        //Output => a	  b	 c	d	e
        print(bubbleSort.sort(strings));

    }
}

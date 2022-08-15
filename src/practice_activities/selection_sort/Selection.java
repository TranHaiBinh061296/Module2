package practice_activities.selection_sort;

public class Selection {
    public static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    public static void selectionSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_pos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_pos]) {
                    min_pos = j;
                }
                int t = a[min_pos];
                a[min_pos] = a[i];
                a[i] = t;
//                swap(a[min_pos], a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 2, 6, 5, -4, -10, 12, 15, 35, 24};
        selectionSort(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

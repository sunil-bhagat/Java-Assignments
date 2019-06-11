package sunil.incrementalassignment2;

/**
 * @author sunil bhagat
 */

public class Vampire {

    int vampireCount = 0;
    boolean isVampire = false;

    public static void main(String[] args) {
        System.out.println("The vampire numbers are: ");
        Vampire v = new Vampire();
        v.getVampire();
    }

    void getVampire() {
        int[] arr;
        int len;
        for (int i = 1001; vampireCount < 100; i++) {
            len = Integer.toString(i).length();
            if (len % 2 == 0) {
                arr = getDigits(i, len);
                isVampire = false;
                permutations(arr, 0, len, i);
            }
        }

    }

    //check if the given permutation is a vampire number.
    boolean checkVampire(int[] arr, int num) {
        int num1 = 0, num2 = 0, i = 0;
        for (i = 0; i < (arr.length) / 2; i++) {
            num1 = num1 * 10 + arr[i];
        }
        for (i = (arr.length) / 2; i < arr.length; i++) {
            num2 = num2 * 10 + arr[i];
        }
        if ((num1 * num2) == num) {
            vampireCount++;
            System.out.println(num);
            return true;
        }
        return false;

    }

    boolean shouldSwap(int[] arr, int start, int curr) {
        for (int i = start; i < curr; i++)
            if (arr[i] == arr[curr])
                return false;
        return true;
    }

    //swap the given indexes of array.
    void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;

    }

    //find all permutation of a number.
    void permutations(int[] arr, int index, int size, int num) {
        if (index >= size) {
            isVampire = checkVampire(arr, num);
            return;
        }
        if (isVampire)
            return;
        for (int i = index; i < size; i++) {
            boolean check = shouldSwap(arr, index, i);
            if (check) {
                swap(arr, index, i);
                permutations(arr, index + 1, size, num);
                swap(arr, index, i);
            }
        }
    }


    //save thr digits of number in array;
    int[] getDigits(int num, int len) {
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = (num - num % 10) / 10;
        }
        return arr;
    }

}

package homeworklesontwo;

public class Lesson2 {
    public static void main(String[] args) {
        // Задание 1
        int[] arr = {1, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
        // Задание 2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }

        // Задание 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        }

        // Задание 4
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (j == i || j == arr4[i].length - 1 - i) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
        }
        // Задание 5
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random() * 10 * arr5.length);
        }
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (min > arr5[i]) {
                min = arr5[i];
            } else if (max < arr5[i]) {
                max = arr5[i];
            }
        }
    }
        // Задание 6
        public static boolean checking(int arr[]) {
            boolean check = false;
            for (int i = 0; i < arr.length - 1; i++) {
                int rightSum = 0;
                int leftSum = 0;
                for (int l = i;l >= 0; l--) {
                    leftSum = leftSum + arr[l];
                }
                for (int r = i + 1;r < arr.length; r++) {
                    rightSum = rightSum + arr[r];
                }
                if (rightSum == leftSum) {
                    check = true;
                    break;
                }
            }
            return check;
        }
        // Задание 7
        public static int [] change(int arr[], int n) {
            int positionOld = 0;
            int a = arr [positionOld];
            int b;
            for(int i = 0; i < arr.length; i++){
                int positionNew = positionOld + n;
                if (positionNew < 0){
                    positionNew = arr.length + positionNew;
                } else if (positionNew >= arr.length){
                    positionNew = positionNew - arr.length;}

                b = arr [positionNew];
                arr [positionNew] = a;
                positionOld = positionNew;
                a = b;

                if (positionOld == 0){
                    positionOld++;
                    a = arr [positionOld];
                }
            }
            return arr;
        }
}

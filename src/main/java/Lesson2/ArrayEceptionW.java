package Lesson2;

public class ArrayEceptionW {
    private static final int SIZE = 4;

    public static void main(String[] args) {

        //String[][] arr = new String[][]{{"10", "30", "30", "50"}, {"10", "10", "10", "10"}, {"10", "10", "10", "10"}, {"10", "10", "10", "kkk"}};
        String[][] arr = new String[][]{{"10", "jjj", "30", "50"}, {"10", "10", "10", "10"}, {"10", "10", "10", "10"}, {"10", "10", "10", "10"}, {"10", "10", "10", "10"}};
        try {
            try {
                int result = arr_method(arr);
                System.out.println(result);
            } catch (ArrayEceptionW.MyArraySizeException e) {
                System.out.println("Размер массива не может быть больше "+ SIZE + " x " + SIZE);
            }
        }
        catch (ArrayEceptionW.MyArrayDataException e) {
            System.out.println("Возможно не числовое значение в массиве!");
            System.out.println("Ошибка в ячейке массива: " + e.getI() + " " + e.getJ());
        }

    }


    public static int arr_method(String[][] arr) throws ArrayEceptionW.MyArraySizeException, ArrayEceptionW.MyArrayDataException {
        int count = 0;
        if (arr.length != SIZE) {
            throw new ArrayEceptionW.MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new ArrayEceptionW.MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new ArrayEceptionW.MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

    private static class MyArraySizeException extends Exception {

    }

    private static class MyArrayDataException extends Exception {
        private final int i;
        private final int j;

        public MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }
}

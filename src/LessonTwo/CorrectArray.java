package LessonTwo;

public class CorrectArray {
    public void correctArray(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int sizeArrayOne = 4;
        int sizeArrayTwo = 4;
        int sum = 0;
        if (array.length != sizeArrayOne) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i].length != sizeArrayTwo) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array.length; j++) {
                int element;
                try {
                    element = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Element data error " + i + "," + j);
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        System.out.println(sum);
    }
}

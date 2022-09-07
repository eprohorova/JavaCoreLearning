package LessonTwo;

public class Main {

    private static void PrintSum (String array[][]){
        CorrectArray correctArray = new CorrectArray();
        try {
                correctArray.CorrectArray(array);


        } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[][] arrayOne = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arrayTwo = {{"2", "2"}, {"3", "3"}, {"4", "4"}, {"5", "5"}};
        String[][] arrayThree = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "a", "12"}, {"13", "14", "15", "16"}};

        PrintSum(arrayOne);
        PrintSum(arrayTwo);
        PrintSum(arrayThree);
    }

}





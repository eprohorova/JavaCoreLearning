package LessonNine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Course> result = getListOfHouse(3,3);
        //1 задание
        result.stream().flatMap(course -> course.getRoomList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(course -> course.getRoomList().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((course1, course2) -> course1.getRoomList().size() - course2.getRoomList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Student paramStudent = new Student("room1");
        result.stream().filter(course -> course.getRoomList().contains(paramStudent)).collect(Collectors.toList());

        System.out.println();

    }

    private static List<Course> getListOfHouse(int j, int m){
        ArrayList<Course> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Student> students = new ArrayList<>();
            for (int h=0; h<m ;h++){
                students.add(new Student("room"+h));
            }
            result.add(new Course("house"+i, students));
        }
        return result;
    }
}

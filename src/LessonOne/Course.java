package LessonOne;

public class Course {
    String result;
    private static Obstacles[] obstacles; //А дальше все, а дальше я не знаю куда воевать с двумя массивами.
    String nameCourse;

    public Course(Obstacles[] obstacles, String nameCourse) {
        this.obstacles = obstacles;
        this.nameCourse = nameCourse;

    }
    public static void doIt(Team team) {
        Participant [] participants = team.getParticipants();
        for (int i = 0; i < participants.length; i++){
            for (int j = 0; j < obstacles.length; j++){
                participants[i].setEnduranceParticipant(participants[i].getEnduranceParticipant() - obstacles[j].getObstaclesValue());
            }
        }

    }



}

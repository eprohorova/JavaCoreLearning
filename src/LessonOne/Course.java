package LessonOne;

public class Course {
    String result;
    private Obstacles[] obstacles; //А дальше все, а дальше я не знаю куда воевать с двумя массивами.
    private int distance;
    private int jumpLength;
    private int throwRange;

    public Course(int distance, int jumpLength, int throwRange) {
        this.distance = distance;
        this.jumpLength = jumpLength;
        this.throwRange = throwRange;
    }
    public String doIt(Team team) {
        result = ("Группа номер: " + team.getTeamName() + " " + '\n');
        for (Participant participant : team.getParticipants()) {
            result += "имя участника: " + participant.getNameParticipant() + " " + '\n';
            int value = participant.getEnduranceParticipant();
            testDistance(value);
            testJumpLength(value);
            testThrowRange(value);

        }
        return result;
    }
    private void testDistance(int value){
        if(value<distance) {
            result = (result + "Дистанция - пройдена. "+ '\n');
        }
        else {
            result += ("Дистанция - не пройдена. "+ '\n');
        }

    }

    private void testJumpLength(int value){
        if(value<jumpLength + 50) result += ("Хороший прыжок! "+ '\n');
        else result += "Длина прыжка слишком короткая! "+ '\n';
    }

    private void testThrowRange(int value){
        if(value<throwRange - 100) result += ("Хороший бросок! "+ '\n');
        else result += "Не попал! "+ '\n';
    }
    /*
    public int getDistance() {

        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
    }

    public int getThrowRange() {
        return throwRange;
    }

    public void setThrowRange(int throwRange) {
        this.throwRange = throwRange;
    }
    */

}

package LessonOne;

public class Main {
    public static void main(String[] args) {
        Participant [] participants = new Participant[4];
        participants [0] = new Participant("Maykel", 200);
        participants [1] = new Participant("Rik", 50);
        participants [2] = new Participant("Morty", 150);
        participants [3] = new Participant("Bobby", 170);

        Team team = new Team("ParticipantOne", participants);

        Obstacles [] obstacles = new Obstacles[3];
        obstacles [0] = new Obstacles("distance", 100);
        obstacles [1] = new Obstacles("jumpLength", 50);
        obstacles [2] = new Obstacles("throwRange", 50);

        Course course = new Course(obstacles, "Obstacles");
        Course.doIt(team);

        team.infoParticipant();
        team.infoTeamResult();

    }

}

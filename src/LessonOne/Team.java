package LessonOne;

public class Team {
    private String teamName;
    private Participant [] participants;

    public Team (String teamName, Participant [] participants){
        this.teamName = teamName;
        this.participants = participants;
    }

    public void infoParticipant(){
        System.out.println(teamName + ":");
        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i].getNameParticipant());
        }
    }
    public void infoTeamResult(){
        System.out.println("Winners: ");
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].getEnduranceParticipant() >= 0) {
                System.out.println(participants[i].getNameParticipant());

            }
        }
    }

    public Participant[] getParticipants() {
        return participants;
    }




}

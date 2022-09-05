package LessonOne;

public class Team {
    private String teamName;
    private Participant [] participants;

    public Team (String teamName, Participant [] participants){
        this.teamName = teamName;
        this.participants = participants;
    }

    public Team() {
    }

    public void infoParticipant(){
        System.out.println(teamName + participants);
    }
    public void infoTeam(){
        System.out.println(participants + " Прощли все испытания " );
    }

    public String getTeamName() {
        return teamName;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    /*
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }
    */



}

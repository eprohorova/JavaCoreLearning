package LessonOne;

public class Participant {
    private String nameParticipant;
    private int enduranceParticipant;

    public Participant(String nameParticipant, int speedParticipant) {
        this.nameParticipant = nameParticipant;
        this.enduranceParticipant = speedParticipant;
    }

    public String getNameParticipant() {
        return nameParticipant;
    }

    public void setNameParticipant(String nameParticipant) {
        this.nameParticipant = nameParticipant;
    }

    public int getEnduranceParticipant() {
        return enduranceParticipant;
    }

    public void setEnduranceParticipant(int speedParticipant) {
        this.enduranceParticipant = speedParticipant;
    }
}



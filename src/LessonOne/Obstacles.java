package LessonOne;

public class Obstacles {
    private String obstaclesName;
    private int obstaclesValue;

    public Obstacles(String obstaclesName, int obstaclesValue) {
        this.obstaclesName = obstaclesName;
        this.obstaclesValue = obstaclesValue;
    }

    public String getObstaclesName() {
        return obstaclesName;
    }

    public void setObstaclesName(String obstaclesName) {
        this.obstaclesName = obstaclesName;
    }

    public int getObstaclesValue() {
        return obstaclesValue;
    }

    public void setObstaclesValue(int obstaclesValue) {
        this.obstaclesValue = obstaclesValue;
    }
}

package miniplc0java.Analyser;

public class BreakPoint {

    int instructionID;

    boolean isBreak;

    public BreakPoint(int instructionID,boolean isBreak){
        this.instructionID=instructionID;
        this.isBreak=isBreak;
    }

    public int getInstructionID() {
        return instructionID;
    }

    public void setInstructionID(int instructionID) {
        this.instructionID = instructionID;
    }

    public boolean isBreak() {
        return isBreak;
    }

    public void setBreak(boolean aBreak) {
        isBreak = aBreak;
    }
}

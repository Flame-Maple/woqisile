package miniplc0java.Analyser;

public class BreakPoint {

    int ID;

    boolean isBreak;

    public BreakPoint(int ID,boolean isBreak){
        this.ID=ID;
        this.isBreak=isBreak;
    }

    public int getInstructionID() {
        return ID;
    }

    public void setInstructionID(int ID) {
        this.ID = ID;
    }

    public boolean isBreak() {
        return isBreak;
    }

    public void setBreak(boolean a) {
        isBreak = a;
    }
}

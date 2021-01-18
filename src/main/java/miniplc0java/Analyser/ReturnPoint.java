package miniplc0java.Analyser;

public class ReturnPoint {
    ReturnEnum Enum;
    boolean ifReturn;
    public ReturnPoint(ReturnEnum Enum,boolean ifReturn){
        this.Enum=Enum;
        this.ifReturn=ifReturn;
    }

    public ReturnEnum getReturnEnum() {
        return Enum;
    }

    public void setReturnEnum(ReturnEnum Enum) {
        this.Enum = Enum;
    }

    public boolean isIfReturn() {
        return ifReturn;
    }

    public void setIfReturn(boolean ifReturn) {
        this.ifReturn = ifReturn;
    }
}

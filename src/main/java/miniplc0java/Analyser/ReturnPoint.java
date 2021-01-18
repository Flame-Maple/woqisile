package miniplc0java.Analyser;

public class ReturnPoint {
    ReturnEnum returnEnum;
    boolean ifReturn;
    public ReturnPoint(ReturnEnum returnEnum,boolean ifReturn){
        this.returnEnum=returnEnum;
        this.ifReturn=ifReturn;
    }

    public ReturnEnum getReturnEnum() {
        return returnEnum;
    }

    public void setReturnEnum(ReturnEnum returnEnum) {
        this.returnEnum = returnEnum;
    }

    public boolean isIfReturn() {
        return ifReturn;
    }

    public void setIfReturn(boolean ifReturn) {
        this.ifReturn = ifReturn;
    }
}

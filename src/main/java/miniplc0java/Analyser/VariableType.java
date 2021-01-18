package miniplc0java.Analyser;

public enum VariableType {
    INT,
    VOID,
    STRING;

    public String toString(){
        switch (this){
            case INT:
            case STRING:
                return "int";
            default:
                return null;
        }
    }
}

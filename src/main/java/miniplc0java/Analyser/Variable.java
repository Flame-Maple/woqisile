package miniplc0java.Analyser;

public class Variable {
    String name;
    boolean isConst;
//    boolean isInitialized;
    boolean isGlobal;
    boolean isParam;
    boolean isLocal;
    int offset;
    VariableType variableType;
    String value;
    public Variable(String name,boolean isConst,VariableType variableType,boolean isGlobal,boolean isParam,boolean isLocal,String value){
        this.name=name;
        this.isConst=isConst;
//        this.isInitialized=isInitialized;
        this.variableType=variableType;
        this.isGlobal=isGlobal;
        this.isParam=isParam;
        this.isLocal=isLocal;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConst() {
        return isConst;
    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    public void setGlobal(boolean global) {
        isGlobal = global;
    }

    public boolean isParam() {
        return isParam;
    }

    public void setParam(boolean param) {
        isParam = param;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

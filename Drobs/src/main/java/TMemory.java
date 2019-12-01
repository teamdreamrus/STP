public class TMemory<T extends Operations> {
    private T FNumber;
    private Boolean FState;
    private T defaultValue;

    public TMemory(T FNumber) {
        this.FNumber = FNumber;
        this.FState = false;
        this.defaultValue = FNumber;
    }

    public void Store(T E) {
        this.FNumber = E;
        this.FState = true;
    }

    public T Get() {
        this.FState = true;
        return FNumber;
    }

    public void add(T number) throws Exception {
        FNumber = (T) FNumber.add(number);
        FState = true;
    }

    public void clear() throws Exception {
        FState= false;
        FNumber = defaultValue;
    }

    public String getState(){
        return FState.toString();
    }
    public T getFNumber(){
        return FNumber;
    }

}

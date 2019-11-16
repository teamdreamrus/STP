public class TMemory<T>{
    private T FNumber;
    private boolean FState;
    private Object T;

    public TMemory(T FNumber) {
        this.FNumber = FNumber;
        this.FState = false;
    }
    public void Store(T E)  {
        this.FNumber = E;
        this.FState = true;
    }
    public T Get()  {
        this.FState = true;
        return FNumber;
    }
    public void Add(T E)  {
       // this.FNumber;
        this.FState = true;
    }
}

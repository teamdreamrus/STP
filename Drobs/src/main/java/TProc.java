public class TProc<T extends Operations> {
    public T getLop_Res() {
        return Lop_Res;
    }

    public void setLop_Res(T lop_Res) {
        Lop_Res = lop_Res;
    }

    public T getRop() {
        return Rop;
    }

    public void setRop(T rop) {
        Rop = rop;
    }

    public TOperations getOperation() {
        return operation;
    }

    public void setOperation(TOperations operation) {
        this.operation = operation;
    }

    private T Lop_Res;
    private T Rop;
    private TOperations operation;
    private T defaultValue;

    public TProc(T TStart) throws Exception {
        Lop_Res = TStart;
        Rop = TStart;
        operation = TOperations.NONE;
        defaultValue = (T)TStart.getDefaultValue();
    }

    //нету значений по умолчанию
    public void clearProc() {
        Lop_Res = defaultValue;
        Rop = defaultValue;
        operation = TOperations.NONE;
    }

    public void clearOperation() {
        operation = TOperations.NONE;
    }

    public void performOperation() throws Exception {
        switch (operation) {
            case ADD:
                Lop_Res = (T) Lop_Res.add(Rop);
                break;
            case DVD:
                Lop_Res = (T) Lop_Res.division(Rop);
                break;

            case MUL:
                Lop_Res = (T) Lop_Res.multiply(Rop);
                break;
            case SUB:
                Lop_Res = (T) Lop_Res.subtraction(Rop);
                break;
            default:
                break;
        }
    }

    public void performFunction(TFunctions function) throws Exception {
        switch (function) {
            case REV:
                Rop = (T) Rop.turnOver();
                break;
            case SQR:
                Rop = (T) Rop.square();
                break;
            default:
                break;
        }

    }

    enum TOperations {
        NONE,
        ADD,
        SUB,
        MUL,
        DVD
    }

    enum TFunctions {
        REV,
        SQR
    }


}

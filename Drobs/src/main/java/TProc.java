public class TProc<T extends Operations> {
    T Lop_Res;
    T Rop;
    String operation;
    //нету значений по умолчанию
    public TProc(T TStart) {
        Lop_Res = TStart;
        Rop = TStart;
        operation = "None";
    }
    //нету значений по умолчанию
    public void clearProc() {

       // Lop_Res =
      //  Rop = TStart;
        operation = "None";
    }



}

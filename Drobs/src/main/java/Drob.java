public class Drob {
    private long chislitel;
    private long znamienatel;

    public Drob(){
    }

    public Drob(long ch,long zn){
        if (zn == 0){
            System.out.println("Del na nol'");
        }
        else {
            chislitel = ch;
            znamienatel = zn;

            sokr();
        }
    }

    public Drob(String str){
        String[] arr = str.split("/");
        if (Integer.parseInt(arr[1]) == 0){
            System.out.println("Del na nol'");
        }
        else {
            chislitel = Integer.parseInt(arr[0]);
            znamienatel = Integer.parseInt(arr[1]);
            sokr();
        }
    }

    public void sokr(){
        long mn=Mnozhitel(chislitel, znamienatel);
        if(mn != 0) {
            chislitel = chislitel / mn;
            znamienatel = znamienatel / mn;
        }

    }

    public Drob copyDrob(){
        return  new Drob(chislitel,znamienatel);
    }

    public  void output(){
        System.out.print(chislitel);
        System.out.print("/");
        System.out.print(znamienatel);
        System.out.println();
    }

    public  String outputS(){
        return chislitel+"/"+znamienatel;
    }

    private static long Mnozhitel(long a, long b){
        if(b==0) return a;

        return Mnozhitel(b,a%b);
    }

    void setChis(long ch){
        chislitel = ch;
    }
    void setZnamen(long zn){
        znamienatel = zn;
    }
    long getChis(){
        return chislitel;
    }
    long getZnam(){
        return znamienatel;
    }
    double getChisD(){
        return chislitel/1.0;
    }
    double getZnamD(){
        return znamienatel/1.0;
    }
    String getChisS(){
        return Long.toString(chislitel);
    }
    String getZnamS(){
        return Long.toString(znamienatel);
    }

    public Drob slozh(Drob d1){
        Drob result = new Drob(chislitel*d1.getZnam()+ d1.getChis()*znamienatel,znamienatel*d1.getZnam());

        return result;
    }

    public Drob kvadr(){
        Drob result = new Drob(chislitel*chislitel,znamienatel*znamienatel);

        return result;
    }

    public Drob minus(){
        Drob z = new Drob(0,1);
        Drob q = new Drob(chislitel,znamienatel);
        Drob result = z.vichet(q);

        return  result;
    }

    public Boolean ravno(Drob d){
        Boolean result = false;
        d.sokr();
        if(chislitel == d.getChis() && znamienatel ==d.getZnam() )
            result = true;

        return  result;
    }

    public Boolean bolshe(Drob d1){
        Boolean result = false;
        d1.sokr();
        Drob d = new Drob(d1.getChis(),d1.getZnam());
        Drob q = new Drob(chislitel,znamienatel);
        q.setChis(chislitel*d1.getZnam());
        q.setZnamen(d1.getZnam()*znamienatel);
        d.setChis(d1.getChis()*znamienatel);
        d.setZnamen(znamienatel*d1.getZnam());
        if(chislitel==0) return false;
        if(q.getChis() > d.getChis() )
            result = true;

        return  result;
    }

    public Drob obratno(){
        Drob result = new Drob(znamienatel,chislitel);

        return result;
    }

    public Drob umnoz(Drob d1){
        Drob result = new Drob();
        result.setChis(d1.getChis()*chislitel);
        result.setZnamen(d1.getZnam()*znamienatel);

        return result;
    }

    public Drob delen(Drob d1){
        Drob result = new Drob();
        result.setChis(d1.getZnam()*chislitel);
        result.setZnamen(d1.getChis()*znamienatel);

        return result;
    }

    public Drob vichet(Drob d1){
        Drob result = new Drob();
        if(chislitel==0) {
            result.setChis(-1*d1.getChis());
            result.setZnamen(d1.getZnam());

            return result;
        }
        if(d1.getChis()==0){
            result.setChis(chislitel);
            result.setZnamen(znamienatel);

            return result;
        }
        result.setChis(chislitel*d1.getZnam() - d1.getChis()*znamienatel);
        result.setZnamen(d1.getZnam()*znamienatel);

        return result;
    }

}
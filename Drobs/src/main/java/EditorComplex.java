import java.util.Scanner;

public class EditorComplex implements Editor {
    private String string;

    public EditorComplex() {
        string = NULL_COMPLEX;
    }

    private boolean isNull() {
        return string.equals(NULL_COMPLEX);
    }
    //так же в других едиторах
    // тестить измение строки
    //isNull не просто так существует

    public String addSign() {

        if (string.charAt(0) == '-')
            string = string.substring(1);
        else string = '-' + string;
        return string;

    }

    public String addDot() {
        if (string.charAt(string.length() - 1) == 'i') {
            string = string.substring(0, string.length() - 1);
            string = string + DELIMITER + "i";
        } else string = string + DELIMITER;
        return string;
    }

    public String addNumeral(int num) {
        if(num==0) return addZero();
        if (string.charAt(string.length() - 1) == 'i') {
            string = string.substring(0, string.length() - 1);
            string = string + num + "i";
        } else string = string + num;

        return string;
    }
    public String addSignChoice(String sign) {
      if(sign.equals("-") || sign.equals("+")){

          if (string.charAt(string.length() - 1) == 'i') {
              string = string.substring(0, string.length() - 1);
              string = string + sign + "i";
          } else string = string + sign;
      }

        return string;
    }

    public String addZero() {
        if (string.charAt(string.length() - 1) == 'i') {
            string = string.substring(0, string.length() - 1);
            string = string + ZERO + "i";
        } else string = string + ZERO;

        return string;
    }

    //Точки остались без проверки когда удаляешь
    public String characterSlaughter() {
        if(string.equals("i")) return string;
        int count = string.length() - 1;
        if (string.charAt(string.length() - 1) == 'i') {
            count--;
            if(string.charAt(string.length() - 3) == '.'){
                count--;
                if(string.charAt(string.length() - 4) == '0'){
                    count--;
                }
            }

            string = string.substring(0, count);

            string = string + "i";
        } else string = string + "i";

        return string;
    }

    public String clear() {
        string = NULL_COMPLEX;
        return string;
    }

    public String edit(int number) {
        Scanner in = new Scanner(System.in);
        String str = "";
        switch (number) {
            case 0:
                str = addSign();
                break;
            case 1:
                System.out.println("Enter number for concatenation to fraction: ");
                str = addNumeral(in.nextInt());
                break;
            case 2:
                str = addZero();
                break;
            case 3:
                str = characterSlaughter();
                break;
            case 4:
                str = clear();
                break;
            default:
                System.out.println("This command not found!");
        }
        return str;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}

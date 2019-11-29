import java.util.Scanner;

public class EditorComplex implements Editor {
    private String string;

    public EditorComplex() {
    }
//точка как ставиьть
    private boolean isNull() {
        return string.equals(NULL_COMPLEX);
    }
//нк же в улевую строку в константы
    //тадругих едиторах
    // тестить измение строки
    //isNull не просто так существует

    private String addSign() {
        if (string.charAt(0) == '-')
            string = string.substring(1);
        else string = '-' + string;
        return string;
    }
private String addDot () {
        string = string+DELIMITER;
        return string;
}
    private String addNumeral(int num) {
        //isNull
        if (string.charAt(string.length() - 1) == 'i') {
            string = string.substring(0, string.length() - 1);
            string = string + num + "i";
        } else string = string + num;

        return string;
    }

    private String addZero() {
        if (string.charAt(string.length() - 1) == 'i') {
            string = string.substring(0, string.length() - 1);
            string = string + ZERO + "i";
        } else string = string + ZERO;

        return string;
    }
//Точки остались без проверки когда удаляешь
    private String characterSlaughter() {
        if (string.charAt(string.length() - 1) == 'i') {
            string = string.substring(0, string.length() - 2);
            string = string + "i";
        } else string = string + "i";

        return string;
    }

    private String clear() {
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

    private String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}

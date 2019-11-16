import java.util.Scanner;

public class EditorPNumber implements Editor {
    private String string;
    public EditorPNumber() {}
    private boolean isNull() {
        return string.equals("0.0");
    }

    private String addSign() {
        if (string.charAt(0) == '-')
            string = string.substring(1);
        else string = '-' + string;
        return string;
    }

    private String addNumeral(int num) {
        return string + changeToChar(num);
    }
    private String addZero() {
        return string + ZERO;
    }
    private String characterSlaughter() {
        string = string.substring(0, string.length() - 1);
        return string;
    }
    private String clear() {
        string = "0.0";
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


    private char changeToChar(int number) {
        return number < 10 ? (char) ('0' + number) : (char) ('A' + number - 10);
    }
}

import java.util.Scanner;

public class EditorFraction extends Fraction implements Editor {
    private String string;

    public EditorFraction() {
    }

    private boolean fractionIsNull() {
        return string.equals("0/1");
    }

    private String addSign() {
        if (string.charAt(0) == '-')
            string = string.substring(1);
        else string = '-' + string;
        return string;
    }

    private String addNumeral(int num) {
        string = string + num;
        return string;
    }

    private String addZero() {
        string = string + ZERO;
        return string;
    }

    private String characterSlaughter() {
        string = string.substring(0, string.length() - 1);
        return string;
    }

    private String clear() {
        string = "0/1";
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

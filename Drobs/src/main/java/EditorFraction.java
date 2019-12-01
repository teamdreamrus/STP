import java.util.Scanner;

public class EditorFraction extends Fraction implements Editor {
    private String string;

    public EditorFraction() {
        string =  NULL_FRACTION;
    }

    public boolean fractionIsNull() {
        return string.equals(NULL_FRACTION);
    }

    public String addSign() {
        if (string.charAt(0) == '-')
            string = string.substring(1);
        else string = '-' + string;
        return string;
    }

    public String addNumeral(int num) {
        string = string + num;
        return string;
    }

    public String addZero() {
        string = string + ZERO;
        return string;
    }
    public String addSeparator() {
        if (!string.contains(SEPARATOR)) {
            string = string + SEPARATOR;
        }
        return string;
    }

    public String characterSlaughter() {
        if (string.equals("")) return string;

        int count = string.length() - 1;
        if (string.length() > 1)
            if (string.charAt(string.length() - 2) == '/') {
                count--;
            }
        string = string.substring(0, count);
        return string;
    }

    public String clear() {
        string =  NULL_FRACTION;
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

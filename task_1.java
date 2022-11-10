import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();

        int t = 0, q, w, e;

        String str_a = str.substring(0, str.indexOf('+'));
        String str_b = str.substring(str.indexOf('+') + 1, str.indexOf('='));
        String str_c = str.substring(str.indexOf('=') + 1, str.length());

        str_a = str_a.replace('?', '0');
        str_b = str_b.replace('?', '0');
        str_c = str_c.replace('?', '0');

        if (str_a.length() == str_b.length()) {
            for (int i = 0; i < str_a.length(); i++) {
                if (str_c.charAt(i) > str_b.charAt(i) && str_c.charAt(i) > str_a.charAt(i)) {
                    t = 0;
                    q = (int) str_c.charAt(i) - (int) str_b.charAt(i);
                    if (str_a.charAt(i) == '0')
                        str_a = str_a.replace('0', Character.forDigit(q, 10));
                    w = (int) str_c.charAt(i) - (int) str_a.charAt(i);
                    if (str_b.charAt(i) == '0')
                        str_b = str_b.replace('0', Character.forDigit(w, 10));
                    for (int j = 0; j < str_c.length(); j++) {
                        e = (int) str_a.charAt(j) - (int) str_b.charAt(j);
                        if (str_c.charAt(j) == '0')
                            str_c = str_c.replace('0', Character.forDigit(e, 10));
                    }
                } else t = 1;
            }
        }
        if (t == 1) System.out.print("No solution");
        else System.out.print(str_a + '+' + str_b + '=' + str_c);
    }
}


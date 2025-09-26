public class kthbitntbinary {
    public static void main(String[] args) {
        char kth = nth(4, 11);
        System.out.println(kth);
    }

    static char nth(int n, int k) {
        String num = val(n-1, "0");
        char val = num.charAt(k-1);
        return val;
    }

    static String val(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return s;
        }
        return val(n-1,(s + "1" + reverse(inverse(s))));
    }

    static String reverse(String s) {
        StringBuilder ss = new StringBuilder();
        for (int i = s.length() - 1; i > -1; i--) {
            ss.append(s.charAt(i));
        }
        return ss.toString();
    }

    static String inverse(String s) {
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                ss.append('1');

            } else {
                ss.append('0');
            }
        }
        return ss.toString();

    }
}

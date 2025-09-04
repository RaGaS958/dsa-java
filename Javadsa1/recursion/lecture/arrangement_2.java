import java.util.ArrayList;

public class arrangement_2 {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = arrange("", s);
        System.out.println(list);
    }

    static ArrayList<String> arrange(String p, String up) {
        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        for (int i = 0; i < p.length() + 1; i++) {
            ArrayList<String> inner = arrange(p.substring(0, i) + up.charAt(0) + p.substring(i, p.length()), up.substring(1));
            list.addAll(inner);
        }
        return list;
    }
}

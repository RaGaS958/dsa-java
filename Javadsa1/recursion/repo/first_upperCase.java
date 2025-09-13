public class first_upperCase {
    public static void main(String[] args) {
        String s="geeksforgeEks";
        System.out.println(first(s));
    }
    static String first(String up)
    {
        if(up.isEmpty())
        {
            return "!!!!!!";
        }
        if(up.charAt(0)<91)
        {
            return up.substring(0,1);
        }
        return first(up.substring(1));

    }
}

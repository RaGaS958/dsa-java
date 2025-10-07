
public class password_crack {
    public static void main(String[] args) {
        String [] passwords={"abra","ka","dabra"};
        String loginAttempt="abra";
        boolean cond=cracker(passwords,loginAttempt,"");
        if(cond)
        {
            System.out.println("Found "+loginAttempt);
        }
        else
        {
            System.out.println("Wrong Password");
        }
    }
    static boolean cracker(String passwords[],String loginAttempt,String pass) {

        if(pass.length()>=loginAttempt.length()) {
            if(pass.equals(loginAttempt)) {
                return true;
            } else {
                return false;
            }
        }
           boolean cond=false;
            for(int i=0;i< passwords.length;i++)
            {
               cond=cond | cracker(passwords,loginAttempt,pass+passwords[i]);
            }
            return cond;
        }
    }


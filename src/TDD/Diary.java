package TDD;

public class Diary {
   private boolean isLocked = true;
   private String password;
    public boolean isLocked() {

        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches) {
            this.isLocked = false;
        }
    }
    public Diary(String password){
        this.password = password;

    }
}

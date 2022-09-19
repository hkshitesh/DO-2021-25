public class Sports_Player {
    public static void main(String[] args) {
        Cricket_Player  cp = new Cricket_Player("Cricket", 7, "India");
        Football_Player fp = new Football_Player("Football", 11, "Brazil");
        Hockey_Player hp = new Hockey_Player("Hockey", 60, "India");

        cp.Display();
        fp.Display();
        hp.Display();
    }
}

class Player {
    String sports;
    int jerseynumber;
    String country;

    void Display() {
        System.out.println(this.sports + " " + this.jerseynumber + " " + this.country);
    }
}

class Cricket_Player extends Player {
    Cricket_Player(String s, int jn, String c) {
        this.sports = s;
        this.jerseynumber = jn;
        this.country = c;
    }
}

class Football_Player extends Player {
    Football_Player(String s, int jn, String c) {
        this.sports = s;
        this.jerseynumber = jn;
        this.country = c;
    }
}

class Hockey_Player extends Player {
    Hockey_Player(String s, int jn, String c) {
        this.sports = s;
        this.jerseynumber = jn;
        this.country = c;
    }
}
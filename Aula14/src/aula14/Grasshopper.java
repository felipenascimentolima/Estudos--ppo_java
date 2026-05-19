package aula14;

public class Grasshopper extends Person {
    
    private boolean login;
    private int totWatched;
    
    
    public void sawOneMore(){
        this.totWatched++;
    }

    ////////////////////////////////////////////////////////////////////////////
    
    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
}

package aula14;

public class Video implements VideoActions {
    
    private String title;
    private int rate;
    private int views;
    private int likes;
    private boolean playing;

    
    ///////////////////////////////////////////////////////////////////////////
    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    
    ///////////////////////////////////////////////////////////////////////////
    
    
    
    @Override
    public void play() {
        this.playing=true;
    }

    @Override
    public void pause() {
        this.playing=false;
    }

    @Override
    public void like() {
        this.likes++;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////
    
    
    
    
}

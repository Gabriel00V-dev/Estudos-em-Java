public class AnimeLamb_S06L04 {
    private String title;
    private int episodes;

    public AnimeLamb_S06L04(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEpisodes() {
        return episodes;
    }
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "AnimeLamb_S06L04 [title=" + title + ", episodes=" + episodes + "]";
    }
}

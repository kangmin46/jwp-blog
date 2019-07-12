package techcourse.myblog.domain;

public class Article {
    private int id;
    private String title;
    private String coverUrl;
    private String contents;

    public Article(String title, String coverUrl, String contents) {
        this.title = title;
        this.coverUrl = coverUrl;
        this.contents = contents;
    }

    public void updateTitle(Article updatedArticle) {
        this.title = updatedArticle.title;
    }

    public void updateUrl(Article updatedArticle) {
        this.coverUrl = updatedArticle.coverUrl;
    }

    public void updateContents(Article updatedArticle) {
        this.contents = updatedArticle.contents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public String getContents() {
        return contents;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

public class Tweet {
    private String userHandle, caption;
    private int likes, imageId;
    private int createdAtYear, createdAtMonth, createdAtDay;

    /**
     * The Tweet object constitutes a model for an instantiation of a tweet
     * @param userHandle - is the user's handle on the platform
     * @param caption - caption hadnles the text input from the user, if any
     * @param likes - likes show the number of users who liked the Tweet instance
     * @param imageId - identitfies the image resource to get and display
     * @param createdAtYear - tags the tweet instance for its year
     * @param createdAtMonth - tags the tweet instance for its month
     * @param createdAtDay - tags the tweet instance for its day
     */
    public Tweet(String userHandle, String caption, int likes, int imageId, int createdAtYear, int createdAtMonth, int createdAtDay) {
        this.userHandle = userHandle;
        this.caption = caption;
        this.likes = likes;
        this.imageId = imageId;
        this.createdAtYear = createdAtYear;
        this.createdAtMonth = createdAtMonth;
        this.createdAtDay = createdAtDay;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public String getCaption() {
        return caption;
    }

    public int getLikes() {
        return likes;
    }

    public int getImageId() {
        return imageId;
    }

    public String getCreatedAt() {
        return createdAtDay + "/" + createdAtMonth + "/" + createdAtYear;
    }

    public void setLikes(int newLikes) {
    	this.likes = newLikes;
    }

}

/**
 * An class called Tweet where text, images, and social metrics of the tweet are contained
 */
public class Tweet {
    /**
     * Initializing variables to create parts for the text/images content, 
     * entity that created the content, social metrics of the content as well as attributes
     */
    private String userHandle, caption;
    private int likes, imageId;
    private int createdAtYear, createdAtMonth, createdAtDay;

    /**
     * 
     * @param userHandle is the entity who made the tweet
     * @param caption is the text content
     * @param likes is the number of entities that liked the tweet
     * @param imageId references visual content
     * @param createdAtYear
     * @param createdAtMonth
     * @param createdAtDay all show the tweet's creation stat
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

    /**
     * 
     * @return retireves the entity/user's handle
     */
    public String getUserHandle() {
        return userHandle;
    }

    /**
     * 
     * @return retrieves the text content of the tweet
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @return retrieves the number of likes of the tweet
     */
    public int getLikes() {
        return likes;
    }

    /**
     * 
     * @return retrieves visual content reference
     */
    public int getImageId() {
        return imageId;
    }

    /**
     * 
     * @return retrieves when the tweet was made in Days, Months, Years
     */
    public String getCreatedAt() {
        return createdAtDay + "/" + createdAtMonth + "/" + createdAtYear;
    }

    /**
     * 
     * @param newLikes updates the value of the likes attribute of the tweet
     */
    public void setLikes(int newLikes) {
    	this.likes = newLikes;
    }
}

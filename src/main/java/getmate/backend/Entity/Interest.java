package getmate.backend.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Interest
{
    @JsonProperty
    String name;
    @JsonProperty
    String pname;
    @JsonProperty
    int imageId;
    @JsonProperty
    int level;
    @JsonProperty
    int count;

    public Interest() {
    }

   /* public Interest(String name, String pname, String imageId, int level, int count) {
        this.name = name;
        this.pname = pname;
        this.imageId = imageId;
        this.level = level;
        this.count = count;
    }*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}


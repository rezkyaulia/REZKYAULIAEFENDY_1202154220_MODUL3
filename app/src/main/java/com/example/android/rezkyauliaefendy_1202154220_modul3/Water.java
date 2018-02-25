package com.example.android.rezkyauliaefendy_1202154220_modul3;

public class Water {
    String title, descpription, detail;
    int image;

    public Water(String title, String descpription, String detail, int image) {
        this.title = title;
        this.descpription = descpription;
        this.detail = detail;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescpription() {
        return descpription;
    }

    public String getDetail() {
        return detail;
    }

    public int getImage() {
        return image;
    }
}

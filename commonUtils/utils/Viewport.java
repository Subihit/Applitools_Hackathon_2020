package utils;

public enum Viewport {
    LAPTOP(1200, 700),
    TABLET(768, 700),
    MOBILE(500, 700);

    int width, height;

    Viewport(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

}

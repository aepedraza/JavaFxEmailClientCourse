package com.barosanu.view;

public enum FontSize {
    SMALL("fontSmall"),
    MEDIUM("fontMedium"),
    BIG("fontBig");

    private String css;

    FontSize(String css) {
        this.css = css;
    }

    public String getCssPath() {
        return "css/" + css + ".css";
    }

    public static String getCssPath(FontSize fontSize){
        switch (fontSize) {
            case MEDIUM:
                return "css/fontMedium.css";
            case BIG:
                return "css/fontBig.css";
            case SMALL:
                return "css/fontSmall.css";
            default:
                return null;
        }
    }
}

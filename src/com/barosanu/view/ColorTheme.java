package com.barosanu.view;

public enum ColorTheme {
    LIGHT("themeLight"),
    DEFAULT("themeDefault"),
    DARK("themeDark");

    private String css;

    ColorTheme(String css) {
        this.css = css;
    }

    public String getCssPath() {
        return "css/" + css + ".css";
    }

}

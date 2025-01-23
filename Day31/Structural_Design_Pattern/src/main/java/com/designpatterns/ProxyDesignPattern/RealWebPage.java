package com.designpatterns.ProxyDesignPattern;

/**
 * The type Real web page.
 */
class RealWebPage implements WebPage {
    private String url;

    /**
     * Instantiates a new Real web page.
     *
     * @param url the url
     */
    public RealWebPage(String url) {
        this.url = url;
        loadWebPage();
    }

    private void loadWebPage() {
        System.out.println("Loading webpage from URL: " + url);
    }

    public void display() {
        System.out.println("Displaying webpage: " + url);
    }
}

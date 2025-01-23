package com.designpatterns.ProxyDesignPattern;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        WebPage page1 = new WebPageProxy("https://example.com/page1");
        WebPage page2 = new WebPageProxy("https://example.com/page2");

        // WebPage is loaded and cached for the first time
        page1.display();

        // WebPage is served from cache, no need to load again
        page1.display();

        // New WebPage is loaded and cached
        page2.display();

        // WebPage is served from cache
        page2.display();
    }
}

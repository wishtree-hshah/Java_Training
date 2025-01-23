package com.designpatterns.ProxyDesignPattern;

/**
 * The type Web page proxy.
 */
class WebPageProxy implements WebPage {
    private RealWebPage realWebPage;
    private String url;
    private boolean isCached = false;

    /**
     * Instantiates a new Web page proxy.
     *
     * @param url the url
     */
    public WebPageProxy(String url) {
        this.url = url;
    }

    public void display() {
        if (!isCached) {
            realWebPage = new RealWebPage(url);
            isCached = true;
        }
        realWebPage.display();
    }
}

package com.designpatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Newsletter.
 */
class Newsletter {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestArticle;

    /**
     * Subscribe.
     *
     * @param observer the observer
     */
    void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    /**
     * Unsubscribe.
     *
     * @param observer the observer
     */
    void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    /**
     * Publish.
     *
     * @param article the article
     */
    void publish(String article) {
        latestArticle = article;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestArticle);
        }
    }
}

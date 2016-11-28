package com.doublesp.coherence.interfaces.domain;

import com.doublesp.coherence.viewmodels.Idea;
import com.doublesp.coherence.viewmodels.Plan;

import rx.Observer;

/**
 * Created by pinyaoting on 11/10/16.
 */

public interface IdeaInteractorInterface {

    void addIdea(String content);

    void acceptSuggestedIdeaAtPos(int pos);

    void updateIdea(int pos, String content);

    void crossoutIdea(int pos);

    void uncrossoutIdea(int pos);

    void removeIdea(int pos);

    void getSuggestions(String keyword);

    void subscribeIdeaStateChange(Observer<Integer> observer);

    void subscribeSuggestionStateChange(Observer<Integer> observer);

    int getIdeaCount();

    int getSuggestionCount();

    Idea getIdeaAtPos(int pos);

    Plan getPlan();

}

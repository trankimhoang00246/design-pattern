package com.example.demo.observer;

import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class SubjectList {
    //@OneToMany
    private List<NotifySend> observerList = new ArrayList<NotifySend>();

    public void add(NotifySend notifySend) {
        observerList.add(notifySend);
    }

    public void delete(NotifySend notifySend) {
        observerList.remove(notifySend);
    }

    public void NotifyForClient(SubjectList subjectList,Object object) {
        observerList.forEach(observer -> {
            observer.Notify(subjectList, object);
        });
    }
}

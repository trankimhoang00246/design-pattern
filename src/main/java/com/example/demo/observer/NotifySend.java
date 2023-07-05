package com.example.demo.observer;

public abstract class NotifySend {
    protected SubjectList subjectList;
    public abstract void Notify(SubjectList subjectList,Object object);
}

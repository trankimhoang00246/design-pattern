package com.example.demo.observer.app;

import com.example.demo.observer.NotifySend;
import com.example.demo.observer.SubjectList;
import com.example.demo.observer.VideoData;

public class YoutubeNotify extends NotifySend {
    public YoutubeNotify(SubjectList subjectList) {
        this.subjectList = subjectList;
        subjectList.add(this);

    }

    @Override
    public void Notify(SubjectList subjectList,Object object) {
        if (subjectList.getClass().equals(VideoData.class)) {
            VideoData videoData = (VideoData) subjectList;
            System.out.println("Youtube " + videoData.toString() + "\n");
        }
    }
}

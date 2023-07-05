package com.example.demo;

import com.example.demo.observer.VideoData;
import com.example.demo.observer.app.FacebookNotify;
import com.example.demo.observer.app.YoutubeNotify;
import junit.framework.TestCase;

public class TestObserver extends TestCase {
    public void testNotify() {

        VideoData videoData = new VideoData(1L, "First video", "An mi tom sieu to");

        new FacebookNotify(videoData);
        YoutubeNotify youtubeNotify = new YoutubeNotify(videoData);

        videoData.setName("Hi hi");
    }
}

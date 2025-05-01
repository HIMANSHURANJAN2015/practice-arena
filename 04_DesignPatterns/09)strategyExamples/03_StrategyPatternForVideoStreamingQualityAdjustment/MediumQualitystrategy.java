package com.assignment.question;

public class MediumQualitystrategy implements QualityAdjustmentStrategy {
    public VideoQuality supportsType(){
        return VideoQuality.MEDIUM;
    }

    public Video adjust(Video video){
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}
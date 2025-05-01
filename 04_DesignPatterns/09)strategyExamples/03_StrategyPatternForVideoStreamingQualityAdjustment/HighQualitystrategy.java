package com.assignment.question;

public class HighQualitystrategy implements QualityAdjustmentStrategy{
    public VideoQuality supportsType(){
        return VideoQuality.HIGH;
    }

    public Video adjust(Video video){
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video; 
    }
    
}

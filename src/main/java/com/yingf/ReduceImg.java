package com.yingf;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

public class ReduceImg  {
    public static void main(String[] args) {
        reduceImgByScale("C:/Users/Public/Pictures/Sample Pictures/U+旅行/贵州苗寨.jpg");
    }
    //按比例进行压缩
    public static void  reduceImgByScale(String srcImg){
        try {
//            Thumbnails.of("D://图片压缩//horse.png")
//                    .scale(0.5f)
//                    .toFile("D://图片压缩//horse3.png");
            Thumbnails.of(srcImg)
                    .scale(1f)
                    .outputQuality(0.25f)
                    .toFile("C:/Users/Public/Pictures/Sample Pictures/U+旅行/贵州苗寨1.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

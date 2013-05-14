package com.youxiachai.image;

import android.graphics.Bitmap;

import com.androidquery.AQuery;
import com.androidquery.callback.ImageOptions;


/**
 * @author youxiachai
 * @date   2013-4-27
 */
public class ImageOptionUtils {
	public static ImageOptions getSimpleImageOption(){
		ImageOptions io = new ImageOptions();
		io.animation = AQuery.FADE_IN_NETWORK;
		return io;
	}
	
	public static ImageOptions getPresetOption(Bitmap bitmap, int targetWidth){
		ImageOptions io = new ImageOptions();
		io.preset = bitmap;
		io.animation = AQuery.FADE_IN_NETWORK;
		io.targetWidth = targetWidth;
		return io;
	}
}

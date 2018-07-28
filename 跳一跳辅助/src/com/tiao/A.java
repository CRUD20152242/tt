package com.tiao;

import java.io.IOException;

public class A {
	public static void main(String[] args) {
		
		
		try {
				Runtime t =  Runtime.getRuntime();
				t.exec("adb shell /system/bin/screencap -p /sdcard/aa/a.png");
				t.exec("adb pull /sdcard/aa/a.png F:/resource/ͼƬ/b.png");
				Thread.sleep(1000);
				t.exec("adb shell input swipe 100 100 100 100 700");
				
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}

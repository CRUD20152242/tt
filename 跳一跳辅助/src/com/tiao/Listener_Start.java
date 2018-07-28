package com.tiao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Listener_Start implements ActionListener {

	MainUI mainui;

	@Override
	public void actionPerformed(ActionEvent e) {
		while(true) {
			// Ωÿ∆¡
			mainui.adb_Shell_Util.execCmd("adb shell /system/bin/screencap -p /sdcard/aa/tiaoyitiao.png");
			mainui.adb_Shell_Util.execCmd("adb pull /sdcard/aa/tiaoyitiao.png " + Path_Util.getCurrURL() + "tiaoyitiao.png");

			// œ‘ æÕº∆¨
			ImageIcon i1 = new ImageIcon(Path_Util.getCurrURL() + "tiaoyitiao.png");
			mainui.icon.setIcon(i1);

			int distance = new Image_Util().getRgb(Path_Util.getCurrURL() + "tiaoyitiao.png",
					Path_Util.getCurrURL() + "tiaoyitiao.png");

			// jump
			int press_time = (int) (distance * 1.3);
			if(press_time <200) {
				press_time = 200;
			}
			System.out.println(distance);

			String cmd = "adb shell input swipe 100 500 100 500 " + press_time;
			System.out.println(cmd);
			mainui.adb_Shell_Util.execCmd(cmd);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		

	}

	public MainUI getMainui() {
		return mainui;
	}

	public void setMainui(MainUI mainui) {
		this.mainui = mainui;
	}

}

package com.demo.common;

import java.awt.Frame;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 推箱子项目工具类
 * @author Administrator
 *
 */
public class Util {
	
	/**
	 * 在界面窗口上创建图片
	 * @param frame  窗口对象
	 * @param imgUrl 图片地址
	 * @param x		  图片左上角x坐标
	 * @param y		  图片左上角x坐标
	 * @param width  图片的长度
	 * @param height 图片的宽度
	 * @return lab Jlabel对象
	 */
	public static JLabel CreateImg(Frame frame,String imgUrl,int x,int y,int width,int height) {
		
		//创建图片
		Icon i = new ImageIcon(imgUrl);
		//使用JLabel组件模拟人物
		JLabel lab = new JLabel(i);
		//设置人物大小位置
		lab.setBounds(x, y, width, height);
		//把人物放到窗体里
		frame.add(lab);
		return lab;
	}
}

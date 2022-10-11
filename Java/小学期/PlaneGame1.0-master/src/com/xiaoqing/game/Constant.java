/*
 * 
 * Create by_xiaoqing on 2018-04-05
 * 
 */
package com.xiaoqing.game;

import java.util.Random;

/**
 * 
 * 此类存放常量
 *
 */
public final class Constant {
	private Constant(){}
	/**
	 * 游戏窗口大小
	 */
	public static final int GAME_WIDTH=640;
	public static final int GAME_HEIGHT=590;
	/**
	 * 飞机步长
	 */
	public static final double PLANE_STEP=3.0;
	public static final double ARMY_STEP=2.0;
	/**
	 * 子弹步长
	 */
	public static final int BULLET_STEP=4;
	/**
	 * 默认子弹数目
	 */
	static Random r = new Random();
	static int i1 = r.nextInt(80); // 生成[0,80]区间的整数
	static int i2 = r.nextInt(30); // 生成[0,80]区间的整数
	public static int DEFAULT_PLANE_BC=i1;//我方飞机子弹
	public static int DEFAULT_ARMY_BC=i2;//地方飞机子弹
}

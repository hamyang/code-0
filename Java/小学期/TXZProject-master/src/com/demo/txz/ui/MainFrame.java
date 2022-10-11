package com.demo.txz.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.demo.common.Util;

/**
 * 用作显示的主窗体 需要基础Frame类
 * 
 * @author Administrator
 *
 */
public class MainFrame extends Frame implements KeyListener {
	
	JLabel lab_wolf = null, lab_bg =null;
	List<JLabel> listTreeLabl = null;
	List<JLabel> listSheepLabel = null;
	public MainFrame() {
		
		//做笼子
		target();
		//做灰太狼（人物）
		
		 lab_wolf = WolfInit();
		//做懒洋洋（箱子）
		 listSheepLabel = sheepInit();
		//做树木（障碍）
		 listTreeLabl = treeinit();
		// 制作一个背景 ，并将背景添加到窗体中
		 lab_bg = backgroundInit();
		// 设置整个窗体
		setMainFrameUI();
		// 使窗口监督用户是不是按了键盘
		this.addKeyListener(this);
		
	}
	
	// 场景数据的模拟
	// 1代表障碍 0代表空地 2表示狼  3表示箱子（羊）4表示笼子
	int[][] datas = {
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1},
			{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 4, 1},
			{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 4, 1},
			{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 4, 1},
			{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
			{1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
	};
	int wolfX = 2; // 人物在数组datas中的行号
	int wolfY = 3; // 人物在数组datas中的列号
	int[] sheepXs = {3,5,7};
	int[] sheepYs = {3,3,3};
	int[][] sheeps = {{sheepXs[0],sheepYs[0]},{sheepXs[1],sheepYs[1]},{sheepXs[2],sheepYs[2]}};
	
	/**
	 * 推箱子障碍初始化
	 * @return 返回JLabel对象list集合
	 */
	private List<JLabel> treeinit() {
		
		JLabel tree_lab = null;
		List<JLabel> listTreeLabl = new ArrayList<JLabel>();
		int treeNum = 0;
		for (int i = 0; i < datas.length; i ++) {
			for(int j = 0; j < datas[i].length; j ++) {
				// 障碍的初始化
				if(datas[i][j] == 1) {
					tree_lab = Util.CreateImg(this, "tree.png", 12 + 50 * j, 36 + 50 * i, 50, 50);
					listTreeLabl.add(tree_lab);
				}
			}
		}
		return listTreeLabl;
	}

	/**
	 * 笼子初始化
	 */
	private void target() {
		for(int i = 0; i < datas.length; i ++) {
			for (int j = 0; j<datas[i].length; j ++) {
				if(datas[i][j] == 4) {
					Util.CreateImg(this, "target.png", (50 * j) + 12, (50 * i) + 36, 50, 50);
				}
			}
		}
	}

	/**
	 * 推箱子 箱子的初始化
	 * @return 返回箱子对象数组
	 */
	private List<JLabel> sheepInit() {
		
		List<JLabel> listSheepLabl = new ArrayList<JLabel>();
		JLabel sheep_lab = null;
		datas[sheepXs[0]][sheepYs[0]] = 3;
		datas[sheepXs[1]][sheepYs[1]] = 3;
		datas[sheepXs[2]][sheepYs[2]] = 3;
		for(int i = 0; i < datas.length; i ++) {
			for (int j = 0; j<datas[i].length; j ++) {
				if(datas[i][j] == 3) {
					sheep_lab = Util.CreateImg(this, "sheep.png", (50 * j) + 12, (50 * i) + 36, 50, 50);
					listSheepLabl.add(sheep_lab);
				}
			}
		}	

			
		return listSheepLabl;

	}

	/**
	 * 推箱子人物初始化
	 * @return
	 */
	private JLabel WolfInit() {
		//把人物数据添加到数组中
		datas[wolfX][wolfY] = 2;
		for(int i = 0; i < datas.length; i ++) {
			for (int j = 0; j<datas[i].length; j ++) {
				if(datas[i][j] == 2) {
			        lab_wolf = Util.CreateImg(this, "Wolf-zm.png", (50 * j) + 12, (50 * i) + 36, 50, 50);
				}
			}
		}
		return lab_wolf;
	}

	/**
	 * 设置主窗体界面显示效果
	 */
	private void setMainFrameUI() {

		// 设置窗体布局为自动布局
		this.setLayout(null);
		// 设置窗口标题
		this.setTitle("推箱子 v1.0");
		// this.setBackground(Color.gray);
		// 设置窗口位置
		this.setLocation(150, 50);
		// 设置窗口尺寸
		this.setSize(800+24, 600+68);
		// 设置窗口显示出来
		this.setVisible(true);
		//设置窗口不能放大
		this.setResizable(false);
	}

	/**
	 * 背景初始化
	 * 
	 * @return 返回背景lab
	 */
	private JLabel backgroundInit() {

		JLabel lab_bg = Util.CreateImg(this, "floor.png", 12, 36, 800, 600);
		return lab_bg;

	}

	@Override
	public void keyPressed(KeyEvent e) {

		// esc 退出程序
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		// 人物上下左右移动
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			Icon i = new ImageIcon("wolf-right.png");
			lab_wolf.setIcon(i);
			if(datas[wolfX][wolfY + 1] != 1) {
				wolfY = wolfY + 1;
			}
			
			/* 如果人物的右边是箱子，箱子随着人物右移
			 * 如果箱子碰到障碍物则不能移动
			 * */
			for(JLabel sheep : listSheepLabel) {
				if(lab_wolf.getX() + 50 == sheep.getX() &&lab_wolf.getY() == sheep.getY() ) {
					System.out.println("0k");
					sheep.setBounds(sheep.getX() + 50, sheep.getY(), sheep.getWidth(), sheep.getHeight());
				}
			}
			lab_wolf.setBounds(12 + 50 * wolfY, 36 + 50 * wolfX, lab_wolf.getWidth(), lab_wolf.getHeight());
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			Icon i = new ImageIcon("wolf-left.png");
			lab_wolf.setIcon(i);
			if(datas[wolfX][wolfY - 1] != 1) {
				wolfY = wolfY - 1;
			}
			/* 如果人物的左边是箱子，箱子随着人物左移
			 * 如果箱子碰到障碍物则不能移动
			 * */
		
					for(JLabel sheep : listSheepLabel) {
							if(lab_wolf.getX()-50 == sheep.getX() &&lab_wolf.getY() == sheep.getY() ) {
								sheep.setBounds(sheep.getX() - 50, sheep.getY(), sheep.getWidth(), sheep.getHeight());
							}
					}
			lab_wolf.setBounds(12 + 50*wolfY, 36 + 50 * wolfX, lab_wolf.getWidth(), lab_wolf.getHeight());
		}
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			Icon i = new ImageIcon("wolf-bm.png");
			lab_wolf.setIcon(i);
			if(datas[wolfX - 1][wolfY] != 1) {
				wolfX = wolfX - 1;
			}
			/* 如果人物的上边是箱子，箱子随着人物上移
			 * 如果箱子碰到障碍物则不能移动
			 * */
			for(JLabel sheep : listSheepLabel) {
				if(lab_wolf.getX() == sheep.getX() &&lab_wolf.getY() - 50 == sheep.getY() ) {
					sheep.setBounds(sheep.getX(), sheep.getY() - 50, sheep.getWidth(), sheep.getHeight());
				}
			}
			lab_wolf.setBounds(12 + 50*wolfY, 36 + 50 * wolfX, lab_wolf.getWidth(), lab_wolf.getHeight());
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			Icon i = new ImageIcon("wolf-zm.png");
			lab_wolf.setIcon(i);
			if(datas[wolfX + 1][wolfY] != 1) {
				wolfX = wolfX + 1;
			}
			
			/* 如果人物的下边是箱子，箱子随着人物下移
			 * 如果箱子碰到障碍物则不能移动
			 * */
			
			for(JLabel sheep : listSheepLabel) {
				if(lab_wolf.getX() == sheep.getX() &&lab_wolf.getY() + 50 == sheep.getY()) {
					sheep.setBounds(sheep.getX(), sheep.getY() + 50, sheep.getWidth(), sheep.getHeight());
				}
			}	
			
			lab_wolf.setBounds(12 + 50*wolfY, 36 + 50 * wolfX, lab_wolf.getWidth(), lab_wolf.getHeight());
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

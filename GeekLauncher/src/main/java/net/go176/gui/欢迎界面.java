package net.go176.gui;

import net.go176.Folder.ResourceManger;
import net.go176.工具包.TimerAndTaskUsage;

import javax.swing.*;
import java.awt.*;
import java.io.Closeable;

public class 欢迎界面 {
    public static void 欢迎界面() {
        //下载资源
        ResourceManger.检查文件夹是否存在();
        ResourceManger.检查该资源是否存在("jky.png", "https://lantern-oss.oss-accelerate.aliyuncs.com/jianke/image/jky.png");
        ResourceManger.检查该资源是否存在("geekmc.png", "https://lantern-oss.oss-accelerate.aliyuncs.com/jianke/image/geekmc.png");


        JFrame 欢迎首页 = new JFrame("");
        欢迎首页.setLayout(null);
        int Locwid = 界面.scrSize.width / 2;
        int Lochei = 界面.scrSize.height / 2;
        欢迎首页.setSize(Locwid, Lochei);
        Toolkit kit = Toolkit.getDefaultToolkit();    // 定义工具包
        Dimension screenSize = kit.getScreenSize();   // 获取屏幕的尺寸
        int screenWidth = screenSize.width/2;         // 获取屏幕的宽
        int screenHeight = screenSize.height/2;       // 获取屏幕的高
        int height = 欢迎首页.getHeight();
        int width = 欢迎首页.getWidth();
        欢迎首页.setLocation(screenWidth-width/2, screenHeight-height/2);
        欢迎首页.add(new JLabel(new ImageIcon("C:\\Windows\\YuanMeng\\Resource\\geekmc.png")));
        欢迎首页.show(true);
        欢迎首页.setVisible(true);
        欢迎首页.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon 载入 = new ImageIcon("C:\\Windows\\YuanMeng\\Resource\\jky.png");
        JLabel imgLabel = new JLabel(载入);
        欢迎首页.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
        imgLabel.setBounds(50,60,载入.getIconWidth(), 载入.getIconHeight());
//        Container cp = 欢迎首页.getContentPane();
//        cp.setLayout(new BorderLayout());
        JButton 测试 = new JButton("我就是个测试");//创建按钮
//        cp.add(but,"North");//将按钮添加入窗口的内容面板
//        ((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。
//        欢迎首页.setSize(500,300);
//        欢迎首页.setVisible(true);


    }
}

package net.go176.工具包;

import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTaskUsage {
	private Timer timer=null;
	private TimerTask task=null;
	private int time=100;
	public void setTime(int time) {//时长设置
		this.time=time;
	}
	public void startTime() {
		timer = new Timer();
		task = new TimerTask() {
			public void run() {
//				System.out.println(""+time); //后期写conf.ini debug
				time--;
				if(time>0) //如果time没减完就递归执行此方法。
				startTime();
			}
		};
		timer.schedule(task, 1000);//设置延时数值，和任务。
	}
}
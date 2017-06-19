
public class LiSi implements Observer{

	@Override
	public void update(String context) {
		System.out.println("李斯:观察到韩非子活动，开始向老板汇报");
		this.reportToQinShihuang(context);
	}
	
	private void reportToQinShihuang(String reportcontent) {
		System.out.println("报告,韩非子有活动:"+reportcontent);
	}
}

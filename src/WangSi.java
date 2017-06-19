
public class WangSi implements Observer{

	private final static String TAG = WangSi.class.getSimpleName();
	
	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println(TAG+"观察到韩非子有变化");
		report(context);
	}
	
	private void report(String context) {
		System.out.println("报告韩非子的状态:"+context);
	}
}

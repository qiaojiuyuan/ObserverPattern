/**
 * 被观察者接口
 * @author qiaojy
 *
 */
public interface Observable {

	/**
	 * 增加一个观察者
	 * @param observable
	 */
	public void addObserver(Observer observable);
	
	/**
	 * 删除一个观察者
	 * @param observable
	 */
	public void deleteObserver(Observer observable);
	
	/**
	 * 通知观察者
	 * @param context
	 */
	public void notifyObserviers(String context);
}

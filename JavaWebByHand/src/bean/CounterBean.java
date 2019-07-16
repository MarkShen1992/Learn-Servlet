//=================== CounterBean.java =================
package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CounterBean implements Serializable {
	private int count = 0;

	public CounterBean() {
	}

	public int getCount() {
		count ++;
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}

package milkteashop;

import java.util.Calendar;

public abstract class Ingredient {
	String name;
	Calendar productDay;
	int day;//保质期
	@Override
	public String toString() {
		return "Ingredient [配料名：" + name + ", 生产日期：" + productDay + ", 保质期：" + day + "]";
	}
}



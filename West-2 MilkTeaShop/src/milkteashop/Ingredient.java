package milkteashop;

import java.util.Calendar;

public abstract class Ingredient {
	String name;
	Calendar productDay;
	int day;//������
	@Override
	public String toString() {
		return "Ingredient [��������" + name + ", �������ڣ�" + productDay + ", �����ڣ�" + day + "]";
	}
}



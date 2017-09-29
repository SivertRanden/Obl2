package tags;

import java.io.IOException;
import java.util.Calendar;
import java.util.TreeMap;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TestTag extends SimpleTagSupport{
	
	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	private String copyright = 	"&copy;";
	
	//Default
	private int year = 2008;
	//map
	static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		String since = toRoman(year);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		String current = toRoman(currentYear);
		copyright += " " + since + " - " + current + " ";
		
		out.print(copyright);
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	private final static String toRoman(int numb) {
		int temp = map.floorKey(numb);
		if (numb == 1) {
			return map.get(numb);
		}
		return map.get(temp) + toRoman(numb-1);
	}
	
}


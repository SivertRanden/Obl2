package tags;

import java.io.IOException;
import model.Description;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DescLength extends SimpleTagSupport {
	private Description desc;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.print(shorten(desc.getText()));
	}

	public void setDesc(Description desc) {
		this.desc = desc;
	}
	
	//Method to shorten the description
	private String shorten(String text) {
		String shortened = "";
		
		if (text.length() > 10) {
			shortened = text.substring(0, 10);
			shortened += " ...";
		} else
			shortened = text;
		
		return shortened;
	}
	
	
}

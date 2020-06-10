package umlDiagramImplementation;

import java.util.ArrayList;

public class HTMLElement extends HTMLTag{

	private String tagName;
	private String endTag;
	private String startTag;
	@Override
	public void setEndTag(String endTag) {
		this.endTag = endTag;
		
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	public HTMLElement(String tagName) {
		super();
		this.tagName = tagName;
	}

	@Override
	public void setStartTag(String startTag) {
		this.startTag = startTag;
		
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag + " " + tagBody + " " + endTag);
		
	}



}

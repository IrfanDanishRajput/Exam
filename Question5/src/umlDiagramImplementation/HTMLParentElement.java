package umlDiagramImplementation;


public class HTMLParentElement extends HTMLTag{
	private String startTag;
	private String tagName;
	private String endTag;
	
	@Override
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HTMLTag htmlTag : super.getChildern()) {
			htmlTag.generateHtml();
		}
		System.out.println(endTag);
	}
	
	public HTMLParentElement(String tagName) {
		super();
		this.tagName = tagName;
	}
	
	@Override
	public void setStartTag(String startTag) {
		this.startTag  = startTag;
		
	}

	@Override
	public String getTagName() {
		return tagName;
	}

		
}
	

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
		for (HTMLTag ht : super.getChildern()) {
			ht.generateHtml();
		}
		System.out.println(endTag);
	}
	
	public HTMLParentElement(String tagName) {
		super();
		this.tagName = tagName;
	}
	
	
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStartTag(String startTag) {
		this.startTag  = startTag;
		
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTagName() {
		return tagName;
	}

		
}
	

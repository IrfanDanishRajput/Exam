package umlDiagramImplementation;

import java.util.ArrayList;
public abstract class HTMLTag {
	
	protected String tagBody;
	protected ArrayList<HTMLTag> childerns = new ArrayList<HTMLTag>();
	
	public abstract void generateHtml();
	
	
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	
	public abstract void setEndTag(String endTag);
	
	
	public abstract void setStartTag(String startTag);
	
	public void addChildTag(HTMLTag ht) {
		childerns.add(ht);
	}
	public void removeChildTag(HTMLTag ht) {
		childerns.remove(ht);
	}
	
	public abstract String getTagName();
	
	public ArrayList<HTMLTag> getChildern(){
		return childerns;
	}
	
	

}

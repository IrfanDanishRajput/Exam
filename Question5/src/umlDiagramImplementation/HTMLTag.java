package umlDiagramImplementation;

import java.util.ArrayList;
public abstract class HTMLTag {
	
	protected String tagBody;
	protected ArrayList<HTMLTag> childerns = new ArrayList<HTMLTag>();
	
	/**This method will generate the html and prints it out on the screen*/
	public abstract void generateHtml();
	
	//this is a setter and will set the body tag value to the tagBody data member
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	
	/**the inherited class will provide the implementation of this method to set the endtag value*/
	public abstract void setEndTag(String endTag);
	
	
	public abstract void setStartTag(String startTag);
	
	/**removing childern from the array list*/
		public void removeChildTag(HTMLTag ht) {
			childerns.remove(ht);
		}
	
	/** adding childern to the array list*/
	public void addChildTag(HTMLTag ht) {
		childerns.add(ht);
	}
	
	
	/**the inherited class will provide the implementation of this method to get the tagname*/
	public abstract String getTagName();
	
	
	/** this method will return the arraylist of childerns*/
	public ArrayList<HTMLTag> getChildern(){
		return childerns;
	}
	
	

}

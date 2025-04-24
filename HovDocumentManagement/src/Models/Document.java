package Models;

public class Document {
	private String docName; 
	private Integer docSize;
	private String statueDoc; 
	
	public Document(String docName, int docSize, String statueDoc){
		this.docName = docName; 
		this.docSize = docSize; 
		this.statueDoc = statueDoc; 
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public int getDocSize() {
		return docSize;
	}

	public void setDocSize(int docSize) {
		this.docSize = docSize;
	}

	public String getStatueDoc() {
		return statueDoc;
	}

	public void setStatueDoc(String statueDoc) {
		this.statueDoc = statueDoc;
	}
	
	
}

package Model;

public class Document {
    private String nameDoc;
    private double sizeDoc;
    private String status;

    public Document(String nameDoc, double sizeDoc) {
        this.nameDoc = nameDoc;
        this.sizeDoc = sizeDoc;
        this.status = "Draft";
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public double getSizeDoc() {
        return sizeDoc;
    }

    public void setSizeDoc(double sizeDoc) {
        this.sizeDoc = sizeDoc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


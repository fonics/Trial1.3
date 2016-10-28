

public class product {

    private final String idproduct;
    private String type;
    private String manfact;
    private String prodate;
    private String expdate;

    public product(String idproduct) {
        this.idproduct = idproduct;
    }

    public void settype (String type) {
    	this.type = type;
    	}
    public void setmanfact (String manfact) {
    	this.manfact = manfact;
    	}
    public void setprodate (String prodate) {
    	this.prodate = prodate;
    	}
    public void setexpdate (String expdate) {
    	this.expdate = expdate;
    	}
    public String getidproduct() {
    	return(this.idproduct);
    	}
    public String gettype() {
    	return(this.type);
    	}
    public String getmanfact() {
    	return(this.manfact);
    	}
    public String getprodate() {
    	return(this.prodate);
    	}
    public String getexpdate() {
    	return(this.expdate);
    	}
}

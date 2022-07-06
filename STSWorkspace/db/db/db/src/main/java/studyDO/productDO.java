package studyDO;

public class productDO {

	private int id;
	private String pname;
	private int pcost;
	// jo data table madhunn yeil tyala obj banavayche pn 1 ch obj banel 
	public productDO(int id, String pname, int pcost) {
		super();
		this.id = id;
		this.pname = pname;
		this.pcost = pcost;
	}
	public productDO() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "productDO [id=" + id + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
}

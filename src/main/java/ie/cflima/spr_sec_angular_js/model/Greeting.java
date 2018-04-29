package ie.cflima.spr_sec_angular_js.model;

public class Greeting {
	
	private String id;
	
	private String msg;
	
	public Greeting() {
		super();
	}

	public Greeting(String id, String mensagem) {
		super();
		this.id = id;
		this.msg = mensagem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String mensagem) {
		this.msg = mensagem;
	}
	
	

}

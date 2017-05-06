package pe.com.bbva.harec.model;

import java.util.List;

public class RespuestaChatbot {
	private String type;
	private String info;
	private List<Value> value;
	private String scope;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public List<Value> getValue() {
		return value;
	}
	public void setValue(List<Value> value) {
		this.value = value;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
}

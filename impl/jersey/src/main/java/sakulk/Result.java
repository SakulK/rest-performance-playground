package sakulk;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {
	private int result;

	public Result() {}

	public Result(int result) {
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
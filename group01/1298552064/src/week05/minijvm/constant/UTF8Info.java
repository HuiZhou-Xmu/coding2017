package week05.minijvm.constant;

public class UTF8Info extends ConstantInfo{
	private int type = ConstantInfo.UTF8_INFO;
	private int length;
	private String value;
	
	public UTF8Info(ConstantPool constantPool){
		super(constantPool);
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String toString() {
		return "UTF8Info [type=" + type + ", length=" + length + ", value=" + value + "]";
	}
}

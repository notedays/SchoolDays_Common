package com.himaginus.common.packet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class RequestPacket implements Externalizable{
	private static final long serialVersionUID = 1L;
	
	// # Codes
	public final static int TEST = 0;
	public final static int REGIST = 1;
	
	// # 변수들
	private int code;
	private String context;
	
	public RequestPacket() {}
	public RequestPacket(int code, String context) {
		this.code = code;
		this.context = context;
	};
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(code);
		out.writeUTF(context);
		out.flush();
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		code = in.readInt();
		context = in.readUTF();
	}
	
	// # Getter / Setter ========================================================
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
}

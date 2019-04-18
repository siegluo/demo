package com.example.demo.design.prototype.example.daily2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * <h3>概要:</h3><p>DailyModel</p>
 * <h3>功能:</h3><p>工作日报模型</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
@SuppressWarnings("serial")
public class DailyModel implements Serializable {
	
	private String author;
	private String content;
	private AttachmentModel attachment;

	/**
	 * 使用序列化技术实现深克隆
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws OptionalDataException
	 */
    public DailyModel deepClone() throws Exception{
    	//将对象写入流中
    	ByteArrayOutputStream bao = new ByteArrayOutputStream();
    	ObjectOutputStream oos = new ObjectOutputStream(bao);
    	oos.writeObject(this);

    	//将对象从流中取出
    	ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
    	ObjectInputStream ois = new ObjectInputStream(bis);
    	return (DailyModel)ois.readObject();
    }

    // GET 和  SET 方法
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public AttachmentModel getAttachment() {
		return attachment;
	}

	public void setAttachment(AttachmentModel attachment) {
		this.attachment = attachment;
	}
}

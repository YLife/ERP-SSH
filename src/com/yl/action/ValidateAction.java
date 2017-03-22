package com.yl.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class ValidateAction {
	
	private String code;
	
	public String execute(){
		//����ͼ��
    	int width = 200;
    	int height = 60;
    	BufferedImage img = new BufferedImage(width, height,
    			BufferedImage.TYPE_INT_RGB);
    	int r, g, b, x, y;
    	//����
    	Graphics gic = img.getGraphics();
    	//�����α���
    	r = (int) (Math.random() * 256);
    	g = (int) (Math.random() * 256);
    	b = (int) (Math.random() * 256);
    	gic.setColor(new Color(r, g, b));
    	gic.fillRect(0, 0, width, height);
    	//��500�����ŵ�
    	for (int i = 0; i < 500; i++) {
    		r = (int) (Math.random() * 256);
    		g = (int) (Math.random() * 256);
    		b = (int) (Math.random() * 256);
    		x = (int) (Math.random() * width);
    		y = (int) (Math.random() * height);
    		gic.setColor(new Color(r, g, b));
    		gic.fillRect(x, y, 2, 2);
    	}
    	//д��
    	String strings = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    	String code = "";
    	for (int i = 0; i < 4; i++) {
    		int num = (int) (Math.random() * strings.length());
    		code += strings.charAt(num);
    	}
    	r = (int) (Math.random() * 256);
    	g = (int) (Math.random() * 256);
    	b = (int) (Math.random() * 256);
    	gic.setColor(new Color(r, g, b));
    	gic.setFont(new Font("Arial", Font.BOLD, 40));
    	gic.drawString(code, 50, 45);;
    	//ʹ��session��ס�ַ�
   		ActionContext context = ActionContext.getContext();
   		Map<String, Object> session = context.getSession();
   		HttpServletResponse response = ServletActionContext.getResponse();
   		session.put("code", code);
    	//�ͷ���Դ
    	gic.dispose();
    	//����ͼ��
    	try {
			ImageIO.write(img, "jpg", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}

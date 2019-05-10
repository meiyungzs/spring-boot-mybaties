package com.qfjy.bean;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.afterturn.easypoi.excel.annotation.Excel;

@Entity
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = -5454161855505652041L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id",orderNum="0")
    private Integer id;

    @Column(name = "name")
    @Excel(name = "姓名",orderNum="1")
    private String name;

    @Column(name = "email")
    @Excel(name="邮箱",orderNum="2")
    private String email;

    @Column(name = "telphone")
    @Excel(name="电话",orderNum="3")
    private String telphone;

    @Column(name ="province")
    @Excel(name ="省份",orderNum="4")
    private String province;
    
    @Column(name= "city")
    @Excel(name="城市",orderNum="5")
    private String city;

    @Column(name ="zone")
    @Excel(name="地区",orderNum="6")
    private String zone;

    @Column(name="createdate")
    @Excel(name = "创建日期" ,orderNum = "7",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    @Column(name="status")
    @Excel(name="状态",orderNum="8")
    private Integer status;
    
    @Column(name="rid")
    @Excel(name="rid",orderNum="9")
    private Integer rid;

    @Column(name= "wid")
    @Excel(name="wid",orderNum="10")
    private Integer wid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"id\":\"");
		builder.append(id);
		builder.append("\", \"name\":\"");
		builder.append(name);
		builder.append("\", \"email\":\"");
		builder.append(email);
		builder.append("\", \"telphone\":\"");
		builder.append(telphone);
		builder.append("\", \"province\":\"");
		builder.append(province);
		builder.append("\", \"city\":\"");
		builder.append(city);
		builder.append("\", \"zone\":\"");
		builder.append(zone);
		builder.append("\", \"createdate\":\"");
		builder.append(createdate);
		builder.append("\", \"status\":\"");
		builder.append(status);
		builder.append("\", \"rid\":\"");
		builder.append(rid);
		builder.append("\", \"wid\":\"");
		builder.append(wid);
		builder.append("\"}");
		return builder.toString();
	}
    
    
}
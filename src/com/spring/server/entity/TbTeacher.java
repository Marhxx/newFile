package com.spring.server.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.jmx.snmp.Timestamp;

/**
 * Teacher entity.
 */
@Entity
@Table(name = "tb_teacher")
public class TbTeacher {
	private Long ttId;  //教师表主键Id
	private String ttName; //教师名称
	private String ttPhone;//手机号码
	private Integer ttSex;//性别 1:男 0:女
	private String ttBirth;//出生日期
	private Integer ttProvinceId;//省id
	private Integer ttCityId;//市id
	private Integer ttRegionId;//区id
	private String ttAddress;//地址
	private String ttCourses;//课程
	private Timestamp ttAddtime;//添加时间
	private Long ttAdduser;//添加人
	private String ttPhoto;//头像
	private String ttCardNum;//身份证号码
	private String ttInDate;//入职日期
	private Integer ttMarriage;//婚姻状况 1:已婚 0:未婚
	private String ttPolitical;//政治面貌
	private String ttTeacherNum;//教师证号码
	private String ttMail;//电子邮箱
	private String ttLoginUser;//登录用户名
	private String ttLoginPass;//登录密码
	private Integer ttStatus;//状态 1:正常 2:离职 3:休假 0:删除
	private String ttNumber;//职工编号
	private String ttContactPerson;//紧急联系人
	private String ttContactPhone;//手机号码
	private String ttMailPass;//
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "tt_id")
	public Long getTtId() {
		return ttId;
	}
	public void setTtId(Long ttId) {
		this.ttId = ttId;
	}
	@Column(name = "tt_name")
	public String getTtName() {
		return ttName;
	}
	public void setTtName(String ttName) {
		this.ttName = ttName;
	}
	@Column(name = "tt_phone")
	public String getTtPhone() {
		return ttPhone;
	}
	public void setTtPhone(String ttPhone) {
		this.ttPhone = ttPhone;
	}
	@Column(name = "tt_sex")
	public Integer getTtSex() {
		return ttSex;
	}
	public void setTtSex(Integer ttSex) {
		this.ttSex = ttSex;
	}
	@Column(name = "tt_birth")
	public String getTtBirth() {
		return ttBirth;
	}
	public void setTtBirth(String ttBirth) {
		this.ttBirth = ttBirth;
	}
	@Column(name = "tt_province_id")
	public Integer getTtProvinceId() {
		return ttProvinceId;
	}
	public void setTtProvinceId(Integer ttProvinceId) {
		this.ttProvinceId = ttProvinceId;
	}
	@Column(name = "tt_city_id")
	public Integer getTtCityId() {
		return ttCityId;
	}
	public void setTtCityId(Integer ttCityId) {
		this.ttCityId = ttCityId;
	}
	@Column(name = "tt_region_id")
	public Integer getTtRegionId() {
		return ttRegionId;
	}
	public void setTtRegionId(Integer ttRegionId) {
		this.ttRegionId = ttRegionId;
	}
	@Column(name = "tt_address")
	public String getTtAddress() {
		return ttAddress;
	}
	public void setTtAddress(String ttAddress) {
		this.ttAddress = ttAddress;
	}
	@Column(name = "tt_courses")
	public String getTtCourses() {
		return ttCourses;
	}
	public void setTtCourses(String ttCourses) {
		this.ttCourses = ttCourses;
	}
	@Column(name = "tt_addtime")
	public Timestamp getTtAddtime() {
		return ttAddtime;
	}
	public void setTtAddtime(Timestamp ttAddtime) {
		this.ttAddtime = ttAddtime;
	}
	@Column(name = "tt_adduser")
	public Long getTtAdduser() {
		return ttAdduser;
	}
	public void setTtAdduser(Long ttAdduser) {
		this.ttAdduser = ttAdduser;
	}
	@Column(name = "tt_photo")
	public String getTtPhoto() {
		return ttPhoto;
	}
	public void setTtPhoto(String ttPhoto) {
		this.ttPhoto = ttPhoto;
	}
	@Column(name = "tt_card_num")
	public String getTtCardNum() {
		return ttCardNum;
	}
	public void setTtCardNum(String ttCardNum) {
		this.ttCardNum = ttCardNum;
	}
	@Column(name = "tt_in_date")
	public String getTtInDate() {
		return ttInDate;
	}
	public void setTtInDate(String ttInDate) {
		this.ttInDate = ttInDate;
	}
	@Column(name = "tt_marriage")
	public Integer getTtMarriage() {
		return ttMarriage;
	}
	public void setTtMarriage(Integer ttMarriage) {
		this.ttMarriage = ttMarriage;
	}
	@Column(name = "tt_political")
	public String getTtPolitical() {
		return ttPolitical;
	}
	public void setTtPolitical(String ttPolitical) {
		this.ttPolitical = ttPolitical;
	}
	@Column(name = "tt_teacher_num")
	public String getTtTeacherNum() {
		return ttTeacherNum;
	}
	public void setTtTeacherNum(String ttTeacherNum) {
		this.ttTeacherNum = ttTeacherNum;
	}
	@Column(name = "tt_mail")
	public String getTtMail() {
		return ttMail;
	}
	public void setTtMail(String ttMail) {
		this.ttMail = ttMail;
	}
	@Column(name = "tt_login_user")
	public String getTtLoginUser() {
		return ttLoginUser;
	}
	public void setTtLoginUser(String ttLoginUser) {
		this.ttLoginUser = ttLoginUser;
	}
	@Column(name = "tt_login_pass")
	public String getTtLoginPass() {
		return ttLoginPass;
	}
	public void setTtLoginPass(String ttLoginPass) {
		this.ttLoginPass = ttLoginPass;
	}
	@Column(name = "tt_status")
	public Integer getTtStatus() {
		return ttStatus;
	}
	public void setTtStatus(Integer ttStatus) {
		this.ttStatus = ttStatus;
	}
	@Column(name = "tt_number")
	public String getTtNumber() {
		return ttNumber;
	}
	public void setTtNumber(String ttNumber) {
		this.ttNumber = ttNumber;
	}
	@Column(name = "tt_contact_person")
	public String getTtContactPerson() {
		return ttContactPerson;
	}
	public void setTtContactPerson(String ttContactPerson) {
		this.ttContactPerson = ttContactPerson;
	}
	@Column(name = "tt_contact_phone")
	public String getTtContactPhone() {
		return ttContactPhone;
	}
	public void setTtContactPhone(String ttContactPhone) {
		this.ttContactPhone = ttContactPhone;
	}
	@Column(name = "tt_mail_pass")
	public String getTtMailPass() {
		return ttMailPass;
	}
	public void setTtMailPass(String ttMailPass) {
		this.ttMailPass = ttMailPass;
	}
	public TbTeacher(Long ttId, String ttName, String ttPhone, Integer ttSex, String ttBirth, Integer ttProvinceId,
			Integer ttCityId, Integer ttRegionId, String ttAddress, String ttCourses, Timestamp ttAddtime,
			Long ttAdduser, String ttPhoto, String ttCardNum, String ttInDate, Integer ttMarriage, String ttPolitical,
			String ttTeacherNum, String ttMail, String ttLoginUser, String ttLoginPass, Integer ttStatus,
			String ttNumber, String ttContactPerson, String ttContactPhone, String ttMailPass) {
		super();
		this.ttId = ttId;
		this.ttName = ttName;
		this.ttPhone = ttPhone;
		this.ttSex = ttSex;
		this.ttBirth = ttBirth;
		this.ttProvinceId = ttProvinceId;
		this.ttCityId = ttCityId;
		this.ttRegionId = ttRegionId;
		this.ttAddress = ttAddress;
		this.ttCourses = ttCourses;
		this.ttAddtime = ttAddtime;
		this.ttAdduser = ttAdduser;
		this.ttPhoto = ttPhoto;
		this.ttCardNum = ttCardNum;
		this.ttInDate = ttInDate;
		this.ttMarriage = ttMarriage;
		this.ttPolitical = ttPolitical;
		this.ttTeacherNum = ttTeacherNum;
		this.ttMail = ttMail;
		this.ttLoginUser = ttLoginUser;
		this.ttLoginPass = ttLoginPass;
		this.ttStatus = ttStatus;
		this.ttNumber = ttNumber;
		this.ttContactPerson = ttContactPerson;
		this.ttContactPhone = ttContactPhone;
		this.ttMailPass = ttMailPass;
	}
	public TbTeacher() {
		super();
	}
	
	
}

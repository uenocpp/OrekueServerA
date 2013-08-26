package jp.magusa.orekue.model;

public class User {
	private long _id;
	private long time_stamp;
	private long deleted_time;
	private String device_id;
	private String account_name;
	//private String hashed_password;
	private String name;
	private String icon;
	private long title_id;
	private long prefix_id;
	private long param_study;
	private long param_exercise;
	private long param_communication;
	private long param_fashion;
	private long param_society;
	private long param_art;
	public long getId() {
		return _id;
	}
	public void setId(long _id) {
		this._id = _id;
	}
	public long getTimeStamp() {
		return time_stamp;
	}
	public void setTimeStamp(long time_stamp) {
		this.time_stamp = time_stamp;
	}
	public long getDeletedTime() {
		return deleted_time;
	}
	public void setDeletedTime(long deleted_time) {
		this.deleted_time = deleted_time;
	}
	public String getDeviceId() {
		return device_id;
	}
	public void setDeviceId(String device_id) {
		this.device_id = device_id;
	}
	public String getAccountName() {
		return account_name;
	}
	public void setAccountName(String account_name) {
		this.account_name = account_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return iconのファイル名を返す
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * @param iconのファイル名を引数にとる
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public long getTitleId() {
		return title_id;
	}
	public void setTitleId(long title_id) {
		this.title_id = title_id;
	}
	public long getPrefixId() {
		return prefix_id;
	}
	public void setPrefixId(long prefix_id) {
		this.prefix_id = prefix_id;
	}
	public long getParamStudy() {
		return param_study;
	}
	public void setParamStudy(long param_study) {
		this.param_study = param_study;
	}
	public long getParamExercise() {
		return param_exercise;
	}
	public void setParamExercise(long param_exercise) {
		this.param_exercise = param_exercise;
	}
	public long getParamCommunication() {
		return param_communication;
	}
	public void setParamCommunication(long param_communication) {
		this.param_communication = param_communication;
	}
	public long getParamFashion() {
		return param_fashion;
	}
	public void setParamFashion(long param_fashion) {
		this.param_fashion = param_fashion;
	}
	public long getParamSociety() {
		return param_society;
	}
	public void setParamSociety(long param_society) {
		this.param_society = param_society;
	}
	public long getParamArt() {
		return param_art;
	}
	public void setParamArt(long param_art) {
		this.param_art = param_art;
	}
}

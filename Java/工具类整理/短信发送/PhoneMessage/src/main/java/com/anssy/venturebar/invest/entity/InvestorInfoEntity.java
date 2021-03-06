/**
 * 湖北安式软件有限公司
 * Hubei Anssy Software Co., Ltd.
 * FILENAME     :  InvestorInfoEntity.java
 * PACKAGE      :  com.anssy.venturebar.invest.entity
 * CREATE DATE  :  2016-8-10
 * AUTHOR       :  make it
 * MODIFIED BY  :
 * DESCRIPTION  :
 */
package com.anssy.venturebar.invest.entity;

import com.anssy.webcore.core.entity.IdEntity;

import java.util.List;

/**
 * @author make it
 * @version SVN #V1# #2016-8-10#
 *          投资_投资人信息
 */
public class InvestorInfoEntity extends IdEntity {

    private static final long serialVersionUID = 3851399185473651132L;

    /**
     * 图片
     */
    private String image;
    private List<String> urls;
    /**
     * 姓名
     */
    private String name;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 职位
     */
    private String post;
    /**
     * 投资主体 (BODY)
     */
    private Long body;
    private String bodyName;
    /**
     * 投资领域
     */
    private String field;
    private String fieldName;
    /**
     * 省ID
     */
    private Long provinceId;
    private String province;
    /**
     * 市ID
     */
    private Long cityId;
    private String city;
    /**
     * 区县ID
     */
    private Long areaId;
    private String area;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * geohash
     */
    private String geohash;
    /**
     * 浏览量
     */
    private Long pv;
    /**
     * 点赞数
     */
    private Long praise;
    /**
     * 权重 默认排序
     */
    private Long weight;
    /**
     * 状态 (STATE 0-待审核,1-正常,2-过期,3-锁定)
     */
    private int state;
    /**
     * 距离
     */
    private double distance;

    private Integer sort;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBody() {
        return body;
    }

    public void setBody(Long body) {
        this.body = body;
    }

    public String getBodyName() {
        return bodyName;
    }

    public void setBodyName(String bodyName) {
        this.bodyName = bodyName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Long getPraise() {
        return praise;
    }

    public void setPraise(Long praise) {
        this.praise = praise;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double lat1, double lng1) {
        double dis = getDistance();
        if (dis == 0) {
            double lat2 = Double.parseDouble(getLatitude());
            double lng2 = Double.parseDouble(getLongitude());
            dis = calculateDistance(lat1, lng1, lat2, lng2);
        }
        this.distance = dis;
    }

    /**
     * 排序方法
     */
    public Integer getSort() {
        sort = Integer.parseInt(new java.text.DecimalFormat("0")
                .format(getDistance()));
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 计算距离的方法(单位m)
     */
    private double calculateDistance(double lat1, double lng1, double lat2,
                                     double lng2) {
        double theta = lng1 - lng2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        return dist * 60 * 1.1515 * 1.609344 * 1000;
    }

    // 将角度转换为弧度
    private static double deg2rad(double degree) {
        return degree / 180 * Math.PI;
    }

    // 将弧度转换为角度
    private static double rad2deg(double radian) {
        return radian * 180 / Math.PI;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

}
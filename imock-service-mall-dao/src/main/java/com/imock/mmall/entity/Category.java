package com.imock.mmall.entity;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {
    /**
     *类别Id
     */
    private Integer id;

    /**
     *父类别id当id=0时说明是根节点,一级类别
     */
    private Integer parentId;

    /**
     *类别名称
     */
    private String name;

    /**
     *类别状态1-正常,2-已废弃
     */
    private Boolean status;

    /**
     *排序编号,同类展示顺序,数值相等则自然排序
     */
    private Integer sortOrder;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *更新时间
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mmall_category
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     *类别Id
     */
    public Integer getId() {
        return id;
    }

    /**
     *类别Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *父类别id当id=0时说明是根节点,一级类别
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     *父类别id当id=0时说明是根节点,一级类别
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     *类别名称
     */
    public String getName() {
        return name;
    }

    /**
     *类别名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *类别状态1-正常,2-已废弃
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *类别状态1-正常,2-已废弃
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     *排序编号,同类展示顺序,数值相等则自然排序
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     *排序编号,同类展示顺序,数值相等则自然排序
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     *创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
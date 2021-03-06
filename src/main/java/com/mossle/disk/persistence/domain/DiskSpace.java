package com.mossle.disk.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DiskSpace .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DISK_SPACE")
public class DiskSpace implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private DiskRule diskRule;

    /** null. */
    private String catalog;

    /** null. */
    private String type;

    /** null. */
    private String name;

    /** null. */
    private String description;

    /** null. */
    private String creator;

    /** null. */
    private Date createTime;

    /** null. */
    private String status;

    /** null. */
    private Integer priority;

    /** null. */
    private Integer quota;

    /** . */
    private Set<DiskInfo> diskInfos = new HashSet<DiskInfo>(0);

    /** . */
    private Set<DiskMember> diskMembers = new HashSet<DiskMember>(0);

    public DiskSpace() {
    }

    public DiskSpace(Long id) {
        this.id = id;
    }

    public DiskSpace(Long id, DiskRule diskRule, String catalog, String type,
            String name, String description, String creator, Date createTime,
            String status, Integer priority, Integer quota,
            Set<DiskInfo> diskInfos, Set<DiskMember> diskMembers) {
        this.id = id;
        this.diskRule = diskRule;
        this.catalog = catalog;
        this.type = type;
        this.name = name;
        this.description = description;
        this.creator = creator;
        this.createTime = createTime;
        this.status = status;
        this.priority = priority;
        this.quota = quota;
        this.diskInfos = diskInfos;
        this.diskMembers = diskMembers;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RULE_ID")
    public DiskRule getDiskRule() {
        return this.diskRule;
    }

    /**
     * @param diskRule
     *            null.
     */
    public void setDiskRule(DiskRule diskRule) {
        this.diskRule = diskRule;
    }

    /** @return null. */
    @Column(name = "CATALOG", length = 50)
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @param catalog
     *            null.
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            null.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            null.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** @return null. */
    @Column(name = "QUOTA")
    public Integer getQuota() {
        return this.quota;
    }

    /**
     * @param quota
     *            null.
     */
    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diskSpace")
    public Set<DiskInfo> getDiskInfos() {
        return this.diskInfos;
    }

    /**
     * @param diskInfos
     *            .
     */
    public void setDiskInfos(Set<DiskInfo> diskInfos) {
        this.diskInfos = diskInfos;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diskSpace")
    public Set<DiskMember> getDiskMembers() {
        return this.diskMembers;
    }

    /**
     * @param diskMembers
     *            .
     */
    public void setDiskMembers(Set<DiskMember> diskMembers) {
        this.diskMembers = diskMembers;
    }
}

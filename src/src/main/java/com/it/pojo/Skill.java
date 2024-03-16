package com.it.pojo;

import java.io.Serializable;

public class Skill implements Serializable {
    /**
     * This field corresponds to the database column skill.skill_id
     */
    private Integer skillId;

    /**
     * This field corresponds to the database column skill.resume_id
     */
    private Integer resumeId;

    /**
     * This field corresponds to the database column skill.skill_name
     */
    private String skillName;

    /**
     * This field corresponds to the database column skill.skill_desc
     */
    private String skillDesc;

    /**
     * This field corresponds to the database column skill.status
     */
    private Integer status;

    /**
     * This field corresponds to the database column skill.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column skill.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table skill
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column skill.skill_id
     *
     * @return the value of skill.skill_id
     */
    public Integer getSkillId() {
        return skillId;
    }

    /**
     * This method sets the value of the database column skill.skill_id
     *
     * @param skillId the value for skill.skill_id
     */
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    /**
     * This method returns the value of the database column skill.resume_id
     *
     * @return the value of skill.resume_id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * This method sets the value of the database column skill.resume_id
     *
     * @param resumeId the value for skill.resume_id
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method returns the value of the database column skill.skill_name
     *
     * @return the value of skill.skill_name
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * This method sets the value of the database column skill.skill_name
     *
     * @param skillName the value for skill.skill_name
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName == null ? null : skillName.trim();
    }

    /**
     * This method returns the value of the database column skill.skill_desc
     *
     * @return the value of skill.skill_desc
     */
    public String getSkillDesc() {
        return skillDesc;
    }

    /**
     * This method sets the value of the database column skill.skill_desc
     *
     * @param skillDesc the value for skill.skill_desc
     */
    public void setSkillDesc(String skillDesc) {
        this.skillDesc = skillDesc == null ? null : skillDesc.trim();
    }

    /**
     * This method returns the value of the database column skill.status
     *
     * @return the value of skill.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column skill.status
     *
     * @param status the value for skill.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column skill.other1
     *
     * @return the value of skill.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column skill.other1
     *
     * @param other1 the value for skill.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method returns the value of the database column skill.other2
     *
     * @return the value of skill.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method sets the value of the database column skill.other2
     *
     * @param other2 the value for skill.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method corresponds to the database table skill
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skillId=").append(skillId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", skillName=").append(skillName);
        sb.append(", skillDesc=").append(skillDesc);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
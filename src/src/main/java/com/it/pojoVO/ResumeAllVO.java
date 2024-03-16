package com.it.pojoVO;

import com.it.pojo.*;

import java.util.List;

public class ResumeAllVO {
    private Resume resume;
    private List<ProjectExperience> projectExperienceList;
    private List<Skill> skillList;
    private List<Honor> honorList;

    public ResumeAllVO(Resume resume, List<ProjectExperience> projectExperienceList, List<Skill> skillList, List<Honor> honorList) {
        this.resume = resume;
        this.projectExperienceList = projectExperienceList;
        this.skillList = skillList;
        this.honorList = honorList;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }


    public List<ProjectExperience> getProjectExperienceList() {
        return projectExperienceList;
    }

    public void setProjectExperienceList(List<ProjectExperience> projectExperienceList) {
        this.projectExperienceList = projectExperienceList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Honor> getHonorList() {
        return honorList;
    }

    public void setHonorList(List<Honor> honorList) {
        this.honorList = honorList;
    }

    @Override
    public String toString() {
        return "ResumeAllVO{" +
                "resume=" + resume +
                ", projectExperienceList=" + projectExperienceList +
                ", skillList=" + skillList +
                ", honorList=" + honorList +
                '}';
    }
}

package com.it.pojoVO;

import com.it.pojo.CompanyAdmin;
import com.it.pojo.Job;

public class JobComAdminVO {
    private Job job;
    private CompanyAdmin companyAdmin;

    public JobComAdminVO(Job job, CompanyAdmin companyAdmin) {
        this.job = job;
        this.companyAdmin = companyAdmin;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public CompanyAdmin getCompanyAdmin() {
        return companyAdmin;
    }

    public void setCompanyAdmin(CompanyAdmin companyAdmin) {
        this.companyAdmin = companyAdmin;
    }

    @Override
    public String toString() {
        return "JobComAdminVO{" +
                "job=" + job +
                ", companyAdmin=" + companyAdmin +
                '}';
    }
}

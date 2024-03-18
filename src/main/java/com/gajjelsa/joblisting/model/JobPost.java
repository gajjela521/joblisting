package com.gajjelsa.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection="JobPost")
public class JobPost {

    private String desc;
    private String profile;
    private int exp;
    private String[] techs;
    private String[] visas;
    private String[] jobType;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public String[] getVisas() {
        return visas;
    }

    public void setVisas(String[] visas) {
        this.visas = visas;
    }

    public String[] getJobType() {
        return jobType;
    }

    public void setJobType(String[] jobType) {
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "desc='" + desc + '\'' +
                ", profile='" + profile + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                ", visas=" + Arrays.toString(visas) +
                ", jobType=" + Arrays.toString(jobType) +
                '}';
    }
}

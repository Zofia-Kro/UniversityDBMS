package com.UniDBMS.Users;

/**
 * represents a lecturer
 * inherits from person class
 * information like module, module Code, qualification
 */
public class Lecturer extends Person {
    protected String module;
    private String moduleCode;
    private String qualifications;

    public Lecturer(){
        super();
        module="unknown";
        moduleCode="None";
        qualifications="None";
    }
    public Lecturer(String module, String moduleCode, String qualifications){
        this.module=module;
        this.moduleCode=moduleCode;
        this.qualifications=qualifications;
    }
    public String getModule(){
        return module;
    }
    public String getModuleCode(){
        return moduleCode;
    }
    public String getQualifications(){
        return qualifications;
    }
    public void setModule(String module){
        this.module=module;
    }
    public void setModuleCode(String moduleCode){
        this.moduleCode=moduleCode;
    }
    public void setQualifications(String qualifications){
        this.qualifications=qualifications;
    }
}

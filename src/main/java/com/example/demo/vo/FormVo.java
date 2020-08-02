package com.example.demo.vo;

public class FormVo {
    //用户标识，number(16)，唯一标识
    private String cConsId;

    //客户标识，number(16)，唯一标识
    private String custId;

    //用电查询号,varchar2(32),用户通过该号码查询自己用电数据
    private String custQueryNo;

    //停电标志,varchar2(8),反应是否停电
    private String poweroffCode;


    //立户日期,Date,档案创建日
    private String buildDate;

    //检查周期,number(5),单位为月
    private String chkCycle;


    public String getcConsId() {
        return cConsId;
    }

    public void setcConsId(String cConsId) {
        this.cConsId = cConsId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustQueryNo() {
        return custQueryNo;
    }

    public void setCustQueryNo(String custQueryNo) {
        this.custQueryNo = custQueryNo;
    }

    public String getPoweroffCode() {
        return poweroffCode;
    }

    public void setPoweroffCode(String poweroffCode) {
        this.poweroffCode = poweroffCode;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public String getChkCycle() {
        return chkCycle;
    }

    public void setChkCycle(String chkCycle) {
        this.chkCycle = chkCycle;
    }

    public FormVo(String cConsId, String custId, String custQueryNo, String poweroffCode, String buildDate, String chkCycle) {
        this.cConsId = cConsId;
        this.custId = custId;
        this.custQueryNo = custQueryNo;
        this.poweroffCode = poweroffCode;
        this.buildDate = buildDate;
        this.chkCycle = chkCycle;
        if (cConsId.equals("")){
            this.cConsId = null;
        }
        if (custId.equals("")){
            this.custId = null;
        }
        if (custQueryNo.equals("")){
            this.custQueryNo = null;
        }
        if (buildDate.equals("")){
            this.buildDate = null;
        }
        if (chkCycle.equals("")){
            this.chkCycle = null;
        }
    }
}

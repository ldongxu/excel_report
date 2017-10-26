package com.report.domain;

import com.report.common.utils.ExcelCell;

/**
 * 普通员工
 * Created by 刘东旭 on 2017/10/23.
 */
public class Staff extends BaseBean{
    @ExcelCell(index = 1)
    private String identifier;//编号
    @ExcelCell(index = 2)
    private String name;//姓名
    @ExcelCell(index = 3)
    private String department;//部门
    @ExcelCell(index = 4)
    private String office;//处室
    @ExcelCell(index = 5)
    private String performanceLevel;//绩效回溯等级
    @ExcelCell(index = 6)
    private String education;//学历
    @ExcelCell(index = 7)
    private Double workYears;//工作年限
    @ExcelCell(index = 8)
    private Double industryYears;//行业经验
    @ExcelCell(index = 9)
    private Double professionalYears;//专业经验
    @ExcelCell(index = 10)
    private Double managementYears;//管理经验
    @ExcelCell(index = 11)
    private Double conditionDepartmentRanking;//基础条件部门内排名
    @ExcelCell(index = 12)
    private Double conditionOfficeRanking;//基础条件处室排名
    @ExcelCell(index = 13)
    private Integer abilityScore;//基础能力总分
    @ExcelCell(index = 14)
    private Double abilityDepartmentRanking;//基础能力部门内排名
    @ExcelCell(index = 15)
    private Double abilityOfficeRanking;//基础能力处室排名
    @ExcelCell(index = 16)
    private Double cognitionScore;//认知特征总分
    @ExcelCell(index = 17)
    private Double cognitionDepartmentRanking;//认知特征部门内排名
    @ExcelCell(index = 18)
    private Double cognitionOfficeRanking;//认知特征处室排名
    @ExcelCell(index = 19)
    private Double potentialLevel;//潜质等级
    @ExcelCell(index = 20)
    private Integer potentialScore;//潜质总分
    @ExcelCell(index = 21)
    private Double potentialDepartmentRanking;//潜质部门内排名
    @ExcelCell(index = 22)
    private Double potentialOfficeRanking;//潜质处室内排名
    @ExcelCell(index = 23)
    private Integer interval;//总区间
    @ExcelCell(index = 24)
    private Integer jingye;//敬业
    @ExcelCell(index = 25)
    private Integer jingyeyoushibiaoji;
    @ExcelCell(index = 26)
    private Integer jingyedaifazhanbiaoji;
    @ExcelCell(index = 27)
    private Integer jingyea;
    @ExcelCell(index = 28)
    private Integer jingyeb;
    @ExcelCell(index = 29)
    private Integer jingyec;
    @ExcelCell(index = 30)
    private Integer jingyed;
    @ExcelCell(index = 31)
    private Integer zhixing;
    @ExcelCell(index = 32)
    private Integer zhixingyoushibiaoji;
    @ExcelCell(index = 33)
    private Integer zhixingdaifazhanbiaoji;
    @ExcelCell(index = 34)
    private Integer zhixinga;
    @ExcelCell(index = 35)
    private Integer zhixingb;
    @ExcelCell(index = 36)
    private Integer zhixingc;
    @ExcelCell(index = 37)
    private Integer zhixingd;
    @ExcelCell(index = 38)
    private Integer kehudaoxiang;
    @ExcelCell(index = 39)
    private Integer kehudaoxiangysbj;
    @ExcelCell(index = 40)
    private Integer kehudaoxiangdfzbj;
    @ExcelCell(index = 41)
    private Integer kehudaoxianga;
    @ExcelCell(index = 42)
    private Integer kehudaoxiangb;
    @ExcelCell(index = 43)
    private Integer kehudaoxiangc;
    @ExcelCell(index = 44)
    private Integer kehudaoxiangd;
    @ExcelCell(index = 45)
    private Integer zhiduyishi;
    @ExcelCell(index = 46)
    private Integer zhiduyishiyoushibiaoji;
    @ExcelCell(index = 47)
    private Integer zhiduyishidaifazhanbiaoji;
    @ExcelCell(index = 48)
    private Integer zhiduyishia;
    @ExcelCell(index = 49)
    private Integer zhiduyishib;
    @ExcelCell(index = 50)
    private Integer zhiduyishic;
    @ExcelCell(index = 51)
    private Integer zhiduyishid;
    @ExcelCell(index = 52)
    private Integer jixiaodaoxiang;
    @ExcelCell(index = 53)
    private Integer jixiaodaoxiangyoushibiaoji;
    @ExcelCell(index = 54)
    private Integer jixiaodaoxiangdaifazhanbiaoji;
    @ExcelCell(index = 55)
    private Integer jixiaodaoxianga;
    @ExcelCell(index = 56)
    private Integer jixiaodaoxiangb;
    @ExcelCell(index = 57)
    private Integer jixiaodaoxiangc;
    @ExcelCell(index = 58)
    private Integer jixiaodaoxiangd;
    @ExcelCell(index = 59)
    private Integer guanxijianli;
    @ExcelCell(index = 60)
    private Integer guanxijianliyoushibiaoji;
    @ExcelCell(index = 61)
    private Integer guanxijianlidaifazhanbiaoji;
    @ExcelCell(index = 62)
    private Integer guanxijianlia;
    @ExcelCell(index = 63)
    private Integer guanxijianlib;
    @ExcelCell(index = 64)
    private Integer guanxijianlic;
    @ExcelCell(index = 65)
    private Integer guanxijianlid;
    @ExcelCell(index = 66)
    private Integer ziyuanzhenghe;
    @ExcelCell(index = 67)
    private Integer ziyuanzhengheyoushibiaoji;
    @ExcelCell(index = 68)
    private Integer ziyuanzhenghedaifazhanbiaoji;
    @ExcelCell(index = 69)
    private Integer ziyuanzhenghea;
    @ExcelCell(index = 70)
    private Integer ziyuanzhengheb;
    @ExcelCell(index = 71)
    private Integer ziyuanzhenghec;
    @ExcelCell(index = 72)
    private Integer ziyuanzhenghed;
    @ExcelCell(index = 73)
    private Integer xingdongli;
    @ExcelCell(index = 74)
    private Integer xingdongliyoushibiaoji;
    @ExcelCell(index = 75)
    private Integer xingdonglidaifazhanbiaoji;
    @ExcelCell(index = 76)
    private Integer xingdonglia;
    @ExcelCell(index = 77)
    private Integer xingdonglib;
    @ExcelCell(index = 78)
    private Integer xingdonglic;
    @ExcelCell(index = 79)
    private Integer xingdonglid;
    @ExcelCell(index = 80)
    private Integer shengrenliScore;
    @ExcelCell(index = 81)
    private Double shengrenliDepartmentRanking;
    @ExcelCell(index = 82)
    private Double shengrenliOfficeRanking;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public void setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Double getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Double workYears) {
        this.workYears = workYears;
    }

    public Double getIndustryYears() {
        return industryYears;
    }

    public void setIndustryYears(Double industryYears) {
        this.industryYears = industryYears;
    }

    public Double getProfessionalYears() {
        return professionalYears;
    }

    public void setProfessionalYears(Double professionalYears) {
        this.professionalYears = professionalYears;
    }

    public Double getManagementYears() {
        return managementYears;
    }

    public void setManagementYears(Double managementYears) {
        this.managementYears = managementYears;
    }

    public Double getConditionDepartmentRanking() {
        return conditionDepartmentRanking;
    }

    public void setConditionDepartmentRanking(Double conditionDepartmentRanking) {
        this.conditionDepartmentRanking = conditionDepartmentRanking;
    }

    public Double getConditionOfficeRanking() {
        return conditionOfficeRanking;
    }

    public void setConditionOfficeRanking(Double conditionOfficeRanking) {
        this.conditionOfficeRanking = conditionOfficeRanking;
    }

    public Integer getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(Integer abilityScore) {
        this.abilityScore = abilityScore;
    }

    public Double getAbilityDepartmentRanking() {
        return abilityDepartmentRanking;
    }

    public void setAbilityDepartmentRanking(Double abilityDepartmentRanking) {
        this.abilityDepartmentRanking = abilityDepartmentRanking;
    }

    public Double getAbilityOfficeRanking() {
        return abilityOfficeRanking;
    }

    public void setAbilityOfficeRanking(Double abilityOfficeRanking) {
        this.abilityOfficeRanking = abilityOfficeRanking;
    }

    public Double getCognitionScore() {
        return cognitionScore;
    }

    public void setCognitionScore(Double cognitionScore) {
        this.cognitionScore = cognitionScore;
    }

    public Double getCognitionDepartmentRanking() {
        return cognitionDepartmentRanking;
    }

    public void setCognitionDepartmentRanking(Double cognitionDepartmentRanking) {
        this.cognitionDepartmentRanking = cognitionDepartmentRanking;
    }

    public Double getCognitionOfficeRanking() {
        return cognitionOfficeRanking;
    }

    public void setCognitionOfficeRanking(Double cognitionOfficeRanking) {
        this.cognitionOfficeRanking = cognitionOfficeRanking;
    }

    public Double getPotentialLevel() {
        return potentialLevel;
    }

    public void setPotentialLevel(Double potentialLevel) {
        this.potentialLevel = potentialLevel;
    }

    public Integer getPotentialScore() {
        return potentialScore;
    }

    public void setPotentialScore(Integer potentialScore) {
        this.potentialScore = potentialScore;
    }

    public Double getPotentialDepartmentRanking() {
        return potentialDepartmentRanking;
    }

    public void setPotentialDepartmentRanking(Double potentialDepartmentRanking) {
        this.potentialDepartmentRanking = potentialDepartmentRanking;
    }

    public Double getPotentialOfficeRanking() {
        return potentialOfficeRanking;
    }

    public void setPotentialOfficeRanking(Double potentialOfficeRanking) {
        this.potentialOfficeRanking = potentialOfficeRanking;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getJingye() {
        return jingye;
    }

    public void setJingye(Integer jingye) {
        this.jingye = jingye;
    }

    public Integer getJingyeyoushibiaoji() {
        return jingyeyoushibiaoji;
    }

    public void setJingyeyoushibiaoji(Integer jingyeyoushibiaoji) {
        this.jingyeyoushibiaoji = jingyeyoushibiaoji;
    }

    public Integer getJingyedaifazhanbiaoji() {
        return jingyedaifazhanbiaoji;
    }

    public void setJingyedaifazhanbiaoji(Integer jingyedaifazhanbiaoji) {
        this.jingyedaifazhanbiaoji = jingyedaifazhanbiaoji;
    }

    public Integer getJingyea() {
        return jingyea;
    }

    public void setJingyea(Integer jingyea) {
        this.jingyea = jingyea;
    }

    public Integer getJingyeb() {
        return jingyeb;
    }

    public void setJingyeb(Integer jingyeb) {
        this.jingyeb = jingyeb;
    }

    public Integer getJingyec() {
        return jingyec;
    }

    public void setJingyec(Integer jingyec) {
        this.jingyec = jingyec;
    }

    public Integer getJingyed() {
        return jingyed;
    }

    public void setJingyed(Integer jingyed) {
        this.jingyed = jingyed;
    }

    public Integer getZhixing() {
        return zhixing;
    }

    public void setZhixing(Integer zhixing) {
        this.zhixing = zhixing;
    }

    public Integer getZhixingyoushibiaoji() {
        return zhixingyoushibiaoji;
    }

    public void setZhixingyoushibiaoji(Integer zhixingyoushibiaoji) {
        this.zhixingyoushibiaoji = zhixingyoushibiaoji;
    }

    public Integer getZhixingdaifazhanbiaoji() {
        return zhixingdaifazhanbiaoji;
    }

    public void setZhixingdaifazhanbiaoji(Integer zhixingdaifazhanbiaoji) {
        this.zhixingdaifazhanbiaoji = zhixingdaifazhanbiaoji;
    }

    public Integer getZhixinga() {
        return zhixinga;
    }

    public void setZhixinga(Integer zhixinga) {
        this.zhixinga = zhixinga;
    }

    public Integer getZhixingb() {
        return zhixingb;
    }

    public void setZhixingb(Integer zhixingb) {
        this.zhixingb = zhixingb;
    }

    public Integer getZhixingc() {
        return zhixingc;
    }

    public void setZhixingc(Integer zhixingc) {
        this.zhixingc = zhixingc;
    }

    public Integer getZhixingd() {
        return zhixingd;
    }

    public void setZhixingd(Integer zhixingd) {
        this.zhixingd = zhixingd;
    }

    public Integer getKehudaoxiang() {
        return kehudaoxiang;
    }

    public void setKehudaoxiang(Integer kehudaoxiang) {
        this.kehudaoxiang = kehudaoxiang;
    }

    public Integer getKehudaoxiangysbj() {
        return kehudaoxiangysbj;
    }

    public void setKehudaoxiangysbj(Integer kehudaoxiangysbj) {
        this.kehudaoxiangysbj = kehudaoxiangysbj;
    }

    public Integer getKehudaoxiangdfzbj() {
        return kehudaoxiangdfzbj;
    }

    public void setKehudaoxiangdfzbj(Integer kehudaoxiangdfzbj) {
        this.kehudaoxiangdfzbj = kehudaoxiangdfzbj;
    }

    public Integer getKehudaoxianga() {
        return kehudaoxianga;
    }

    public void setKehudaoxianga(Integer kehudaoxianga) {
        this.kehudaoxianga = kehudaoxianga;
    }

    public Integer getKehudaoxiangb() {
        return kehudaoxiangb;
    }

    public void setKehudaoxiangb(Integer kehudaoxiangb) {
        this.kehudaoxiangb = kehudaoxiangb;
    }

    public Integer getKehudaoxiangc() {
        return kehudaoxiangc;
    }

    public void setKehudaoxiangc(Integer kehudaoxiangc) {
        this.kehudaoxiangc = kehudaoxiangc;
    }

    public Integer getKehudaoxiangd() {
        return kehudaoxiangd;
    }

    public void setKehudaoxiangd(Integer kehudaoxiangd) {
        this.kehudaoxiangd = kehudaoxiangd;
    }

    public Integer getZhiduyishi() {
        return zhiduyishi;
    }

    public void setZhiduyishi(Integer zhiduyishi) {
        this.zhiduyishi = zhiduyishi;
    }

    public Integer getZhiduyishiyoushibiaoji() {
        return zhiduyishiyoushibiaoji;
    }

    public void setZhiduyishiyoushibiaoji(Integer zhiduyishiyoushibiaoji) {
        this.zhiduyishiyoushibiaoji = zhiduyishiyoushibiaoji;
    }

    public Integer getZhiduyishidaifazhanbiaoji() {
        return zhiduyishidaifazhanbiaoji;
    }

    public void setZhiduyishidaifazhanbiaoji(Integer zhiduyishidaifazhanbiaoji) {
        this.zhiduyishidaifazhanbiaoji = zhiduyishidaifazhanbiaoji;
    }

    public Integer getZhiduyishia() {
        return zhiduyishia;
    }

    public void setZhiduyishia(Integer zhiduyishia) {
        this.zhiduyishia = zhiduyishia;
    }

    public Integer getZhiduyishib() {
        return zhiduyishib;
    }

    public void setZhiduyishib(Integer zhiduyishib) {
        this.zhiduyishib = zhiduyishib;
    }

    public Integer getZhiduyishic() {
        return zhiduyishic;
    }

    public void setZhiduyishic(Integer zhiduyishic) {
        this.zhiduyishic = zhiduyishic;
    }

    public Integer getZhiduyishid() {
        return zhiduyishid;
    }

    public void setZhiduyishid(Integer zhiduyishid) {
        this.zhiduyishid = zhiduyishid;
    }

    public Integer getJixiaodaoxiang() {
        return jixiaodaoxiang;
    }

    public void setJixiaodaoxiang(Integer jixiaodaoxiang) {
        this.jixiaodaoxiang = jixiaodaoxiang;
    }

    public Integer getJixiaodaoxiangyoushibiaoji() {
        return jixiaodaoxiangyoushibiaoji;
    }

    public void setJixiaodaoxiangyoushibiaoji(Integer jixiaodaoxiangyoushibiaoji) {
        this.jixiaodaoxiangyoushibiaoji = jixiaodaoxiangyoushibiaoji;
    }

    public Integer getJixiaodaoxiangdaifazhanbiaoji() {
        return jixiaodaoxiangdaifazhanbiaoji;
    }

    public void setJixiaodaoxiangdaifazhanbiaoji(Integer jixiaodaoxiangdaifazhanbiaoji) {
        this.jixiaodaoxiangdaifazhanbiaoji = jixiaodaoxiangdaifazhanbiaoji;
    }

    public Integer getJixiaodaoxianga() {
        return jixiaodaoxianga;
    }

    public void setJixiaodaoxianga(Integer jixiaodaoxianga) {
        this.jixiaodaoxianga = jixiaodaoxianga;
    }

    public Integer getJixiaodaoxiangb() {
        return jixiaodaoxiangb;
    }

    public void setJixiaodaoxiangb(Integer jixiaodaoxiangb) {
        this.jixiaodaoxiangb = jixiaodaoxiangb;
    }

    public Integer getJixiaodaoxiangc() {
        return jixiaodaoxiangc;
    }

    public void setJixiaodaoxiangc(Integer jixiaodaoxiangc) {
        this.jixiaodaoxiangc = jixiaodaoxiangc;
    }

    public Integer getJixiaodaoxiangd() {
        return jixiaodaoxiangd;
    }

    public void setJixiaodaoxiangd(Integer jixiaodaoxiangd) {
        this.jixiaodaoxiangd = jixiaodaoxiangd;
    }

    public Integer getGuanxijianli() {
        return guanxijianli;
    }

    public void setGuanxijianli(Integer guanxijianli) {
        this.guanxijianli = guanxijianli;
    }

    public Integer getGuanxijianliyoushibiaoji() {
        return guanxijianliyoushibiaoji;
    }

    public void setGuanxijianliyoushibiaoji(Integer guanxijianliyoushibiaoji) {
        this.guanxijianliyoushibiaoji = guanxijianliyoushibiaoji;
    }

    public Integer getGuanxijianlidaifazhanbiaoji() {
        return guanxijianlidaifazhanbiaoji;
    }

    public void setGuanxijianlidaifazhanbiaoji(Integer guanxijianlidaifazhanbiaoji) {
        this.guanxijianlidaifazhanbiaoji = guanxijianlidaifazhanbiaoji;
    }

    public Integer getGuanxijianlia() {
        return guanxijianlia;
    }

    public void setGuanxijianlia(Integer guanxijianlia) {
        this.guanxijianlia = guanxijianlia;
    }

    public Integer getGuanxijianlib() {
        return guanxijianlib;
    }

    public void setGuanxijianlib(Integer guanxijianlib) {
        this.guanxijianlib = guanxijianlib;
    }

    public Integer getGuanxijianlic() {
        return guanxijianlic;
    }

    public void setGuanxijianlic(Integer guanxijianlic) {
        this.guanxijianlic = guanxijianlic;
    }

    public Integer getGuanxijianlid() {
        return guanxijianlid;
    }

    public void setGuanxijianlid(Integer guanxijianlid) {
        this.guanxijianlid = guanxijianlid;
    }

    public Integer getZiyuanzhenghe() {
        return ziyuanzhenghe;
    }

    public void setZiyuanzhenghe(Integer ziyuanzhenghe) {
        this.ziyuanzhenghe = ziyuanzhenghe;
    }

    public Integer getZiyuanzhengheyoushibiaoji() {
        return ziyuanzhengheyoushibiaoji;
    }

    public void setZiyuanzhengheyoushibiaoji(Integer ziyuanzhengheyoushibiaoji) {
        this.ziyuanzhengheyoushibiaoji = ziyuanzhengheyoushibiaoji;
    }

    public Integer getZiyuanzhenghedaifazhanbiaoji() {
        return ziyuanzhenghedaifazhanbiaoji;
    }

    public void setZiyuanzhenghedaifazhanbiaoji(Integer ziyuanzhenghedaifazhanbiaoji) {
        this.ziyuanzhenghedaifazhanbiaoji = ziyuanzhenghedaifazhanbiaoji;
    }

    public Integer getZiyuanzhenghea() {
        return ziyuanzhenghea;
    }

    public void setZiyuanzhenghea(Integer ziyuanzhenghea) {
        this.ziyuanzhenghea = ziyuanzhenghea;
    }

    public Integer getZiyuanzhengheb() {
        return ziyuanzhengheb;
    }

    public void setZiyuanzhengheb(Integer ziyuanzhengheb) {
        this.ziyuanzhengheb = ziyuanzhengheb;
    }

    public Integer getZiyuanzhenghec() {
        return ziyuanzhenghec;
    }

    public void setZiyuanzhenghec(Integer ziyuanzhenghec) {
        this.ziyuanzhenghec = ziyuanzhenghec;
    }

    public Integer getZiyuanzhenghed() {
        return ziyuanzhenghed;
    }

    public void setZiyuanzhenghed(Integer ziyuanzhenghed) {
        this.ziyuanzhenghed = ziyuanzhenghed;
    }

    public Integer getXingdongli() {
        return xingdongli;
    }

    public void setXingdongli(Integer xingdongli) {
        this.xingdongli = xingdongli;
    }

    public Integer getXingdongliyoushibiaoji() {
        return xingdongliyoushibiaoji;
    }

    public void setXingdongliyoushibiaoji(Integer xingdongliyoushibiaoji) {
        this.xingdongliyoushibiaoji = xingdongliyoushibiaoji;
    }

    public Integer getXingdonglidaifazhanbiaoji() {
        return xingdonglidaifazhanbiaoji;
    }

    public void setXingdonglidaifazhanbiaoji(Integer xingdonglidaifazhanbiaoji) {
        this.xingdonglidaifazhanbiaoji = xingdonglidaifazhanbiaoji;
    }

    public Integer getXingdonglia() {
        return xingdonglia;
    }

    public void setXingdonglia(Integer xingdonglia) {
        this.xingdonglia = xingdonglia;
    }

    public Integer getXingdonglib() {
        return xingdonglib;
    }

    public void setXingdonglib(Integer xingdonglib) {
        this.xingdonglib = xingdonglib;
    }

    public Integer getXingdonglic() {
        return xingdonglic;
    }

    public void setXingdonglic(Integer xingdonglic) {
        this.xingdonglic = xingdonglic;
    }

    public Integer getXingdonglid() {
        return xingdonglid;
    }

    public void setXingdonglid(Integer xingdonglid) {
        this.xingdonglid = xingdonglid;
    }

    public Integer getShengrenliScore() {
        return shengrenliScore;
    }

    public void setShengrenliScore(Integer shengrenliScore) {
        this.shengrenliScore = shengrenliScore;
    }

    public Double getShengrenliDepartmentRanking() {
        return shengrenliDepartmentRanking;
    }

    public void setShengrenliDepartmentRanking(Double shengrenliDepartmentRanking) {
        this.shengrenliDepartmentRanking = shengrenliDepartmentRanking;
    }

    public Double getShengrenliOfficeRanking() {
        return shengrenliOfficeRanking;
    }

    public void setShengrenliOfficeRanking(Double shengrenliOfficeRanking) {
        this.shengrenliOfficeRanking = shengrenliOfficeRanking;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", office='" + office + '\'' +
                ", performanceLevel='" + performanceLevel + '\'' +
                ", education='" + education + '\'' +
                ", workYears=" + workYears +
                ", industryYears=" + industryYears +
                ", professionalYears=" + professionalYears +
                ", managementYears=" + managementYears +
                ", conditionDepartmentRanking=" + conditionDepartmentRanking +
                ", conditionOfficeRanking=" + conditionOfficeRanking +
                ", abilityScore=" + abilityScore +
                ", abilityDepartmentRanking=" + abilityDepartmentRanking +
                ", abilityOfficeRanking=" + abilityOfficeRanking +
                ", cognitionScore=" + cognitionScore +
                ", cognitionDepartmentRanking=" + cognitionDepartmentRanking +
                ", cognitionOfficeRanking=" + cognitionOfficeRanking +
                ", potentialLevel=" + potentialLevel +
                ", potentialScore=" + potentialScore +
                ", potentialDepartmentRanking=" + potentialDepartmentRanking +
                ", potentialOfficeRanking=" + potentialOfficeRanking +
                ", interval=" + interval +
                ", jingye=" + jingye +
                ", jingyeyoushibiaoji=" + jingyeyoushibiaoji +
                ", jingyedaifazhanbiaoji=" + jingyedaifazhanbiaoji +
                ", jingyea=" + jingyea +
                ", jingyeb=" + jingyeb +
                ", jingyec=" + jingyec +
                ", jingyed=" + jingyed +
                ", zhixing=" + zhixing +
                ", zhixingyoushibiaoji=" + zhixingyoushibiaoji +
                ", zhixingdaifazhanbiaoji=" + zhixingdaifazhanbiaoji +
                ", zhixinga=" + zhixinga +
                ", zhixingb=" + zhixingb +
                ", zhixingc=" + zhixingc +
                ", zhixingd=" + zhixingd +
                ", kehudaoxiang=" + kehudaoxiang +
                ", kehudaoxiangysbj=" + kehudaoxiangysbj +
                ", kehudaoxiangdfzbj=" + kehudaoxiangdfzbj +
                ", kehudaoxianga=" + kehudaoxianga +
                ", kehudaoxiangb=" + kehudaoxiangb +
                ", kehudaoxiangc=" + kehudaoxiangc +
                ", kehudaoxiangd=" + kehudaoxiangd +
                ", zhiduyishi=" + zhiduyishi +
                ", zhiduyishiyoushibiaoji=" + zhiduyishiyoushibiaoji +
                ", zhiduyishidaifazhanbiaoji=" + zhiduyishidaifazhanbiaoji +
                ", zhiduyishia=" + zhiduyishia +
                ", zhiduyishib=" + zhiduyishib +
                ", zhiduyishic=" + zhiduyishic +
                ", zhiduyishid=" + zhiduyishid +
                ", jixiaodaoxiang=" + jixiaodaoxiang +
                ", jixiaodaoxiangyoushibiaoji=" + jixiaodaoxiangyoushibiaoji +
                ", jixiaodaoxiangdaifazhanbiaoji=" + jixiaodaoxiangdaifazhanbiaoji +
                ", jixiaodaoxianga=" + jixiaodaoxianga +
                ", jixiaodaoxiangb=" + jixiaodaoxiangb +
                ", jixiaodaoxiangc=" + jixiaodaoxiangc +
                ", jixiaodaoxiangd=" + jixiaodaoxiangd +
                ", guanxijianli=" + guanxijianli +
                ", guanxijianliyoushibiaoji=" + guanxijianliyoushibiaoji +
                ", guanxijianlidaifazhanbiaoji=" + guanxijianlidaifazhanbiaoji +
                ", guanxijianlia=" + guanxijianlia +
                ", guanxijianlib=" + guanxijianlib +
                ", guanxijianlic=" + guanxijianlic +
                ", guanxijianlid=" + guanxijianlid +
                ", ziyuanzhenghe=" + ziyuanzhenghe +
                ", ziyuanzhengheyoushibiaoji=" + ziyuanzhengheyoushibiaoji +
                ", ziyuanzhenghedaifazhanbiaoji=" + ziyuanzhenghedaifazhanbiaoji +
                ", ziyuanzhenghea=" + ziyuanzhenghea +
                ", ziyuanzhengheb=" + ziyuanzhengheb +
                ", ziyuanzhenghec=" + ziyuanzhenghec +
                ", ziyuanzhenghed=" + ziyuanzhenghed +
                ", xingdongli=" + xingdongli +
                ", xingdongliyoushibiaoji=" + xingdongliyoushibiaoji +
                ", xingdonglidaifazhanbiaoji=" + xingdonglidaifazhanbiaoji +
                ", xingdonglia=" + xingdonglia +
                ", xingdonglib=" + xingdonglib +
                ", xingdonglic=" + xingdonglic +
                ", xingdonglid=" + xingdonglid +
                ", shengrenliScore=" + shengrenliScore +
                ", shengrenliDepartmentRanking=" + shengrenliDepartmentRanking +
                ", shengrenliOfficeRanking=" + shengrenliOfficeRanking +
                '}';
    }
}

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
    private Double abilityScore;//基础能力总分
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
    private Double potentialScore;//潜质总分
    @ExcelCell(index = 21)
    private Double potentialDepartmentRanking;//潜质部门内排名
    @ExcelCell(index = 22)
    private Double potentialOfficeRanking;//潜质处室内排名
    @ExcelCell(index = 23)
    private Double interval;//总区间
    @ExcelCell(index = 24)
    private Double jingye;//敬业
    @ExcelCell(index = 25)
    private Double jingyeyoushibiaoji;
    @ExcelCell(index = 26)
    private Double jingyedaifazhanbiaoji;
    @ExcelCell(index = 27)
    private Double jingyea;
    @ExcelCell(index = 28)
    private Double jingyeb;
    @ExcelCell(index = 29)
    private Double jingyec;
    @ExcelCell(index = 30)
    private Double jingyed;
    @ExcelCell(index = 31)
    private Double zhixing;
    @ExcelCell(index = 32)
    private Double zhixingyoushibiaoji;
    @ExcelCell(index = 33)
    private Double zhixingdaifazhanbiaoji;
    @ExcelCell(index = 34)
    private Double zhixinga;
    @ExcelCell(index = 35)
    private Double zhixingb;
    @ExcelCell(index = 36)
    private Double zhixingc;
    @ExcelCell(index = 37)
    private Double zhixingd;
    @ExcelCell(index = 38)
    private Double kehudaoxiang;
    @ExcelCell(index = 39)
    private Double kehudaoxiangysbj;
    @ExcelCell(index = 40)
    private Double kehudaoxiangdfzbj;
    @ExcelCell(index = 41)
    private Double kehudaoxianga;
    @ExcelCell(index = 42)
    private Double kehudaoxiangb;
    @ExcelCell(index = 43)
    private Double kehudaoxiangc;
    @ExcelCell(index = 44)
    private Double kehudaoxiangd;
    @ExcelCell(index = 45)
    private Double zhiduyishi;
    @ExcelCell(index = 46)
    private Double zhiduyishiyoushibiaoji;
    @ExcelCell(index = 47)
    private Double zhiduyishidaifazhanbiaoji;
    @ExcelCell(index = 48)
    private Double zhiduyishia;
    @ExcelCell(index = 49)
    private Double zhiduyishib;
    @ExcelCell(index = 50)
    private Double zhiduyishic;
    @ExcelCell(index = 51)
    private Double zhiduyishid;
    @ExcelCell(index = 52)
    private Double jixiaodaoxiang;
    @ExcelCell(index = 53)
    private Double jixiaodaoxiangyoushibiaoji;
    @ExcelCell(index = 54)
    private Double jixiaodaoxiangdaifazhanbiaoji;
    @ExcelCell(index = 55)
    private Double jixiaodaoxianga;
    @ExcelCell(index = 56)
    private Double jixiaodaoxiangb;
    @ExcelCell(index = 57)
    private Double jixiaodaoxiangc;
    @ExcelCell(index = 58)
    private Double jixiaodaoxiangd;
    @ExcelCell(index = 59)
    private Double guanxijianli;
    @ExcelCell(index = 60)
    private Double guanxijianliyoushibiaoji;
    @ExcelCell(index = 61)
    private Double guanxijianlidaifazhanbiaoji;
    @ExcelCell(index = 62)
    private Double guanxijianlia;
    @ExcelCell(index = 63)
    private Double guanxijianlib;
    @ExcelCell(index = 64)
    private Double guanxijianlic;
    @ExcelCell(index = 65)
    private Double guanxijianlid;
    @ExcelCell(index = 66)
    private Double ziyuanzhenghe;
    @ExcelCell(index = 67)
    private Double ziyuanzhengheyoushibiaoji;
    @ExcelCell(index = 68)
    private Double ziyuanzhenghedaifazhanbiaoji;
    @ExcelCell(index = 69)
    private Double ziyuanzhenghea;
    @ExcelCell(index = 70)
    private Double ziyuanzhengheb;
    @ExcelCell(index = 71)
    private Double ziyuanzhenghec;
    @ExcelCell(index = 72)
    private Double ziyuanzhenghed;
    @ExcelCell(index = 73)
    private Double xingdongli;
    @ExcelCell(index = 74)
    private Double xingdongliyoushibiaoji;
    @ExcelCell(index = 75)
    private Double xingdonglidaifazhanbiaoji;
    @ExcelCell(index = 76)
    private Double xingdonglia;
    @ExcelCell(index = 77)
    private Double xingdonglib;
    @ExcelCell(index = 78)
    private Double xingdonglic;
    @ExcelCell(index = 79)
    private Double xingdonglid;
    @ExcelCell(index = 80)
    private Double shengrenliScore;
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

    public Double getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(Double abilityScore) {
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

    public Double getPotentialScore() {
        return potentialScore;
    }

    public void setPotentialScore(Double potentialScore) {
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

    public Double getInterval() {
        return interval;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public Double getJingye() {
        return jingye;
    }

    public void setJingye(Double jingye) {
        this.jingye = jingye;
    }

    public Double getJingyeyoushibiaoji() {
        return jingyeyoushibiaoji;
    }

    public void setJingyeyoushibiaoji(Double jingyeyoushibiaoji) {
        this.jingyeyoushibiaoji = jingyeyoushibiaoji;
    }

    public Double getJingyedaifazhanbiaoji() {
        return jingyedaifazhanbiaoji;
    }

    public void setJingyedaifazhanbiaoji(Double jingyedaifazhanbiaoji) {
        this.jingyedaifazhanbiaoji = jingyedaifazhanbiaoji;
    }

    public Double getJingyea() {
        return jingyea;
    }

    public void setJingyea(Double jingyea) {
        this.jingyea = jingyea;
    }

    public Double getJingyeb() {
        return jingyeb;
    }

    public void setJingyeb(Double jingyeb) {
        this.jingyeb = jingyeb;
    }

    public Double getJingyec() {
        return jingyec;
    }

    public void setJingyec(Double jingyec) {
        this.jingyec = jingyec;
    }

    public Double getJingyed() {
        return jingyed;
    }

    public void setJingyed(Double jingyed) {
        this.jingyed = jingyed;
    }

    public Double getZhixing() {
        return zhixing;
    }

    public void setZhixing(Double zhixing) {
        this.zhixing = zhixing;
    }

    public Double getZhixingyoushibiaoji() {
        return zhixingyoushibiaoji;
    }

    public void setZhixingyoushibiaoji(Double zhixingyoushibiaoji) {
        this.zhixingyoushibiaoji = zhixingyoushibiaoji;
    }

    public Double getZhixingdaifazhanbiaoji() {
        return zhixingdaifazhanbiaoji;
    }

    public void setZhixingdaifazhanbiaoji(Double zhixingdaifazhanbiaoji) {
        this.zhixingdaifazhanbiaoji = zhixingdaifazhanbiaoji;
    }

    public Double getZhixinga() {
        return zhixinga;
    }

    public void setZhixinga(Double zhixinga) {
        this.zhixinga = zhixinga;
    }

    public Double getZhixingb() {
        return zhixingb;
    }

    public void setZhixingb(Double zhixingb) {
        this.zhixingb = zhixingb;
    }

    public Double getZhixingc() {
        return zhixingc;
    }

    public void setZhixingc(Double zhixingc) {
        this.zhixingc = zhixingc;
    }

    public Double getZhixingd() {
        return zhixingd;
    }

    public void setZhixingd(Double zhixingd) {
        this.zhixingd = zhixingd;
    }

    public Double getKehudaoxiang() {
        return kehudaoxiang;
    }

    public void setKehudaoxiang(Double kehudaoxiang) {
        this.kehudaoxiang = kehudaoxiang;
    }

    public Double getKehudaoxiangysbj() {
        return kehudaoxiangysbj;
    }

    public void setKehudaoxiangysbj(Double kehudaoxiangysbj) {
        this.kehudaoxiangysbj = kehudaoxiangysbj;
    }

    public Double getKehudaoxiangdfzbj() {
        return kehudaoxiangdfzbj;
    }

    public void setKehudaoxiangdfzbj(Double kehudaoxiangdfzbj) {
        this.kehudaoxiangdfzbj = kehudaoxiangdfzbj;
    }

    public Double getKehudaoxianga() {
        return kehudaoxianga;
    }

    public void setKehudaoxianga(Double kehudaoxianga) {
        this.kehudaoxianga = kehudaoxianga;
    }

    public Double getKehudaoxiangb() {
        return kehudaoxiangb;
    }

    public void setKehudaoxiangb(Double kehudaoxiangb) {
        this.kehudaoxiangb = kehudaoxiangb;
    }

    public Double getKehudaoxiangc() {
        return kehudaoxiangc;
    }

    public void setKehudaoxiangc(Double kehudaoxiangc) {
        this.kehudaoxiangc = kehudaoxiangc;
    }

    public Double getKehudaoxiangd() {
        return kehudaoxiangd;
    }

    public void setKehudaoxiangd(Double kehudaoxiangd) {
        this.kehudaoxiangd = kehudaoxiangd;
    }

    public Double getZhiduyishi() {
        return zhiduyishi;
    }

    public void setZhiduyishi(Double zhiduyishi) {
        this.zhiduyishi = zhiduyishi;
    }

    public Double getZhiduyishiyoushibiaoji() {
        return zhiduyishiyoushibiaoji;
    }

    public void setZhiduyishiyoushibiaoji(Double zhiduyishiyoushibiaoji) {
        this.zhiduyishiyoushibiaoji = zhiduyishiyoushibiaoji;
    }

    public Double getZhiduyishidaifazhanbiaoji() {
        return zhiduyishidaifazhanbiaoji;
    }

    public void setZhiduyishidaifazhanbiaoji(Double zhiduyishidaifazhanbiaoji) {
        this.zhiduyishidaifazhanbiaoji = zhiduyishidaifazhanbiaoji;
    }

    public Double getZhiduyishia() {
        return zhiduyishia;
    }

    public void setZhiduyishia(Double zhiduyishia) {
        this.zhiduyishia = zhiduyishia;
    }

    public Double getZhiduyishib() {
        return zhiduyishib;
    }

    public void setZhiduyishib(Double zhiduyishib) {
        this.zhiduyishib = zhiduyishib;
    }

    public Double getZhiduyishic() {
        return zhiduyishic;
    }

    public void setZhiduyishic(Double zhiduyishic) {
        this.zhiduyishic = zhiduyishic;
    }

    public Double getZhiduyishid() {
        return zhiduyishid;
    }

    public void setZhiduyishid(Double zhiduyishid) {
        this.zhiduyishid = zhiduyishid;
    }

    public Double getJixiaodaoxiang() {
        return jixiaodaoxiang;
    }

    public void setJixiaodaoxiang(Double jixiaodaoxiang) {
        this.jixiaodaoxiang = jixiaodaoxiang;
    }

    public Double getJixiaodaoxiangyoushibiaoji() {
        return jixiaodaoxiangyoushibiaoji;
    }

    public void setJixiaodaoxiangyoushibiaoji(Double jixiaodaoxiangyoushibiaoji) {
        this.jixiaodaoxiangyoushibiaoji = jixiaodaoxiangyoushibiaoji;
    }

    public Double getJixiaodaoxiangdaifazhanbiaoji() {
        return jixiaodaoxiangdaifazhanbiaoji;
    }

    public void setJixiaodaoxiangdaifazhanbiaoji(Double jixiaodaoxiangdaifazhanbiaoji) {
        this.jixiaodaoxiangdaifazhanbiaoji = jixiaodaoxiangdaifazhanbiaoji;
    }

    public Double getJixiaodaoxianga() {
        return jixiaodaoxianga;
    }

    public void setJixiaodaoxianga(Double jixiaodaoxianga) {
        this.jixiaodaoxianga = jixiaodaoxianga;
    }

    public Double getJixiaodaoxiangb() {
        return jixiaodaoxiangb;
    }

    public void setJixiaodaoxiangb(Double jixiaodaoxiangb) {
        this.jixiaodaoxiangb = jixiaodaoxiangb;
    }

    public Double getJixiaodaoxiangc() {
        return jixiaodaoxiangc;
    }

    public void setJixiaodaoxiangc(Double jixiaodaoxiangc) {
        this.jixiaodaoxiangc = jixiaodaoxiangc;
    }

    public Double getJixiaodaoxiangd() {
        return jixiaodaoxiangd;
    }

    public void setJixiaodaoxiangd(Double jixiaodaoxiangd) {
        this.jixiaodaoxiangd = jixiaodaoxiangd;
    }

    public Double getGuanxijianli() {
        return guanxijianli;
    }

    public void setGuanxijianli(Double guanxijianli) {
        this.guanxijianli = guanxijianli;
    }

    public Double getGuanxijianliyoushibiaoji() {
        return guanxijianliyoushibiaoji;
    }

    public void setGuanxijianliyoushibiaoji(Double guanxijianliyoushibiaoji) {
        this.guanxijianliyoushibiaoji = guanxijianliyoushibiaoji;
    }

    public Double getGuanxijianlidaifazhanbiaoji() {
        return guanxijianlidaifazhanbiaoji;
    }

    public void setGuanxijianlidaifazhanbiaoji(Double guanxijianlidaifazhanbiaoji) {
        this.guanxijianlidaifazhanbiaoji = guanxijianlidaifazhanbiaoji;
    }

    public Double getGuanxijianlia() {
        return guanxijianlia;
    }

    public void setGuanxijianlia(Double guanxijianlia) {
        this.guanxijianlia = guanxijianlia;
    }

    public Double getGuanxijianlib() {
        return guanxijianlib;
    }

    public void setGuanxijianlib(Double guanxijianlib) {
        this.guanxijianlib = guanxijianlib;
    }

    public Double getGuanxijianlic() {
        return guanxijianlic;
    }

    public void setGuanxijianlic(Double guanxijianlic) {
        this.guanxijianlic = guanxijianlic;
    }

    public Double getGuanxijianlid() {
        return guanxijianlid;
    }

    public void setGuanxijianlid(Double guanxijianlid) {
        this.guanxijianlid = guanxijianlid;
    }

    public Double getZiyuanzhenghe() {
        return ziyuanzhenghe;
    }

    public void setZiyuanzhenghe(Double ziyuanzhenghe) {
        this.ziyuanzhenghe = ziyuanzhenghe;
    }

    public Double getZiyuanzhengheyoushibiaoji() {
        return ziyuanzhengheyoushibiaoji;
    }

    public void setZiyuanzhengheyoushibiaoji(Double ziyuanzhengheyoushibiaoji) {
        this.ziyuanzhengheyoushibiaoji = ziyuanzhengheyoushibiaoji;
    }

    public Double getZiyuanzhenghedaifazhanbiaoji() {
        return ziyuanzhenghedaifazhanbiaoji;
    }

    public void setZiyuanzhenghedaifazhanbiaoji(Double ziyuanzhenghedaifazhanbiaoji) {
        this.ziyuanzhenghedaifazhanbiaoji = ziyuanzhenghedaifazhanbiaoji;
    }

    public Double getZiyuanzhenghea() {
        return ziyuanzhenghea;
    }

    public void setZiyuanzhenghea(Double ziyuanzhenghea) {
        this.ziyuanzhenghea = ziyuanzhenghea;
    }

    public Double getZiyuanzhengheb() {
        return ziyuanzhengheb;
    }

    public void setZiyuanzhengheb(Double ziyuanzhengheb) {
        this.ziyuanzhengheb = ziyuanzhengheb;
    }

    public Double getZiyuanzhenghec() {
        return ziyuanzhenghec;
    }

    public void setZiyuanzhenghec(Double ziyuanzhenghec) {
        this.ziyuanzhenghec = ziyuanzhenghec;
    }

    public Double getZiyuanzhenghed() {
        return ziyuanzhenghed;
    }

    public void setZiyuanzhenghed(Double ziyuanzhenghed) {
        this.ziyuanzhenghed = ziyuanzhenghed;
    }

    public Double getXingdongli() {
        return xingdongli;
    }

    public void setXingdongli(Double xingdongli) {
        this.xingdongli = xingdongli;
    }

    public Double getXingdongliyoushibiaoji() {
        return xingdongliyoushibiaoji;
    }

    public void setXingdongliyoushibiaoji(Double xingdongliyoushibiaoji) {
        this.xingdongliyoushibiaoji = xingdongliyoushibiaoji;
    }

    public Double getXingdonglidaifazhanbiaoji() {
        return xingdonglidaifazhanbiaoji;
    }

    public void setXingdonglidaifazhanbiaoji(Double xingdonglidaifazhanbiaoji) {
        this.xingdonglidaifazhanbiaoji = xingdonglidaifazhanbiaoji;
    }

    public Double getXingdonglia() {
        return xingdonglia;
    }

    public void setXingdonglia(Double xingdonglia) {
        this.xingdonglia = xingdonglia;
    }

    public Double getXingdonglib() {
        return xingdonglib;
    }

    public void setXingdonglib(Double xingdonglib) {
        this.xingdonglib = xingdonglib;
    }

    public Double getXingdonglic() {
        return xingdonglic;
    }

    public void setXingdonglic(Double xingdonglic) {
        this.xingdonglic = xingdonglic;
    }

    public Double getXingdonglid() {
        return xingdonglid;
    }

    public void setXingdonglid(Double xingdonglid) {
        this.xingdonglid = xingdonglid;
    }

    public Double getShengrenliScore() {
        return shengrenliScore;
    }

    public void setShengrenliScore(Double shengrenliScore) {
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

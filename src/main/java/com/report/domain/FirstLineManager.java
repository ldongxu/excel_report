package com.report.domain;

import com.report.common.utils.ExcelCell;
import org.apache.commons.collections.DoubleOrderedMap;

/**
 * 基层管理
 * Created by 刘东旭 on 2017/10/23.
 */
public class FirstLineManager extends BaseBean{
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
    private Double jichutiaojianjicengguanliRanking;//基础条件基层管理排名
    @ExcelCell(index = 12)
    private Double abilityScore;//基础能力总分
    @ExcelCell(index = 13)
    private Double abilityRanking;//基础能力序列排名
    @ExcelCell(index = 14)
    private Double cognitionScore;//认知特征总分
    @ExcelCell(index = 15)
    private Double cognitionRanking;//认知特征基层管理排名
    @ExcelCell(index = 16)
    private Double potentialLevel;//潜质等级
    @ExcelCell(index = 17)
    private Double potentialScore;//潜质总分
    @ExcelCell(index = 18)
    private Double potentialRanking;//潜质基层管理排名
    @ExcelCell(index = 19)
    private Double interval;//总区间
    @ExcelCell(index = 20)
    private Double jingye;//敬业
    @ExcelCell(index = 21)
    private Double jingyeyoushibiaoji;
    @ExcelCell(index = 22)
    private Double jingyedaifazhanbiaoji;
    @ExcelCell(index = 23)
    private Double jingyea;
    @ExcelCell(index = 24)
    private Double jingyeb;
    @ExcelCell(index = 25)
    private Double jingyec;
    @ExcelCell(index = 26)
    private Double jingyed;
    @ExcelCell(index = 27)
    private Double zhixing;
    @ExcelCell(index = 28)
    private Double zhixingyoushibiaoji;
    @ExcelCell(index = 33)
    private Double zhixingdaifazhanbiaoji;
    @ExcelCell(index = 29)
    private Double zhixinga;
    @ExcelCell(index = 30)
    private Double zhixingb;
    @ExcelCell(index = 31)
    private Double zhixingc;
    @ExcelCell(index = 32)
    private Double zhixingd;
    @ExcelCell(index = 33)
    private Double kehudaoxiang;
    @ExcelCell(index = 34)
    private Double kehudaoxiangysbj;
    @ExcelCell(index = 35)
    private Double kehudaoxiangdfzbj;
    @ExcelCell(index = 36)
    private Double kehudaoxianga;
    @ExcelCell(index = 37)
    private Double kehudaoxiangb;
    @ExcelCell(index = 38)
    private Double kehudaoxiangc;
    @ExcelCell(index = 39)
    private Double kehudaoxiangd;
    @ExcelCell(index = 40)
    private Double zhiduyishi;
    @ExcelCell(index = 41)
    private Double zhiduyishiyoushibiaoji;
    @ExcelCell(index = 42)
    private Double zhiduyishidaifazhanbiaoji;
    @ExcelCell(index = 43)
    private Double zhiduyishia;
    @ExcelCell(index = 44)
    private Double zhiduyishib;
    @ExcelCell(index = 45)
    private Double zhiduyishic;
    @ExcelCell(index = 46)
    private Double zhiduyishid;
    @ExcelCell(index = 47)
    private Double shichangdaoxiang;
    @ExcelCell(index = 48)
    private Double shichangdaoxiangyoushibiaoji;
    @ExcelCell(index = 49)
    private Double shichangdaoxiangdaifazhanbiaoji;
    @ExcelCell(index = 50)
    private Double shichangdaoxianga;
    @ExcelCell(index = 51)
    private Double shichangdaoxiangb;
    @ExcelCell(index = 52)
    private Double shichangdaoxiangc;
    @ExcelCell(index = 53)
    private Double shichangdaoxiangd;
    @ExcelCell(index = 54)
    private Double goutongxietiao;
    @ExcelCell(index = 55)
    private Double goutongxietiaoyoushibiaoji;
    @ExcelCell(index = 56)
    private Double goutongxietiaodaifazhanbiaoji;
    @ExcelCell(index = 57)
    private Double goutongxietiaoa;
    @ExcelCell(index = 58)
    private Double goutongxietiaob;
    @ExcelCell(index = 59)
    private Double goutongxietiaoc;
    @ExcelCell(index = 60)
    private Double goutongxietiaod;
    @ExcelCell(index = 61)
    private Double qianyanzhuizong;
    @ExcelCell(index = 62)
    private Double qianyanzhuizongyoushibiaoji;
    @ExcelCell(index = 63)
    private Double qianyanzhuizongdaifazhanbiaoji;
    @ExcelCell(index = 64)
    private Double qianyanzhuizonga;
    @ExcelCell(index = 65)
    private Double qianyanzhuizongb;
    @ExcelCell(index = 66)
    private Double qianyanzhuizongc;
    @ExcelCell(index = 67)
    private Double qianyanzhuizongd;
    @ExcelCell(index = 68)
    private Double xitongsiwei;
    @ExcelCell(index = 69)
    private Double xitongsiweiyoushibiaoji;
    @ExcelCell(index = 70)
    private Double xitongsiweidaifazhanbiaoji;
    @ExcelCell(index = 71)
    private Double xitongsiweia;
    @ExcelCell(index = 72)
    private Double xitongsiweib;
    @ExcelCell(index = 73)
    private Double xitongsiweic;
    @ExcelCell(index = 74)
    private Double xitongsiweid;
    @ExcelCell(index = 75)
    private Double zhidaoyujiankong;
    @ExcelCell(index = 76)
    private Double zhidaoyujiankongyoushibiaoji;
    @ExcelCell(index = 77)
    private Double zhidaoyujiankongfazhanbiaoji;
    @ExcelCell(index = 78)
    private Double zhidaoyujiankonga;
    @ExcelCell(index = 79)
    private Double zhidaoyujiankongb;
    @ExcelCell(index = 80)
    private Double zhidaoyujiankongc;
    @ExcelCell(index = 81)
    private Double zhidaoyujiankongd;
    @ExcelCell(index = 82)
    private Double jili;
    @ExcelCell(index = 83)
    private Double jiliyoushibiaoji;
    @ExcelCell(index = 84)
    private Double jilidaifazhanbiaoji;
    @ExcelCell(index = 85)
    private Double jilia;
    @ExcelCell(index = 86)
    private Double jilib;
    @ExcelCell(index = 87)
    private Double jilic;
    @ExcelCell(index = 88)
    private Double jilid;
    @ExcelCell(index = 89)
    private Double shengrenliScore;
    @ExcelCell(index = 90)
    private Double shengrenliRanking;//胜任力基层管理排名
    @ExcelCell(index = 91)
    private Double jingyeAverage;
    @ExcelCell(index = 92)
    private Double zhixingAverage;
    @ExcelCell(index = 93)
    private Double kehuweizhongxinAverage;
    @ExcelCell(index = 94)
    private Double zhiduyishiAverage;
    @ExcelCell(index = 95)
    private Double shichangdaoxiangAverage;
    @ExcelCell(index = 96)
    private Double goutongxietiaoAverage;
    @ExcelCell(index = 97)
    private Double qianyanzhuizongAverage;
    @ExcelCell(index = 98)
    private Double xitongsiweiAverage;
    @ExcelCell(index = 99)
    private Double zhidaoyujiankongAverage;
    @ExcelCell(index = 100)
    private Double jiliAverage;

    private Integer sequence;//人员序列

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

    public Double getJichutiaojianjicengguanliRanking() {
        return jichutiaojianjicengguanliRanking;
    }

    public void setJichutiaojianjicengguanliRanking(Double jichutiaojianjicengguanliRanking) {
        this.jichutiaojianjicengguanliRanking = jichutiaojianjicengguanliRanking;
    }

    public Double getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(Double abilityScore) {
        this.abilityScore = abilityScore;
    }

    public Double getAbilityRanking() {
        return abilityRanking;
    }

    public void setAbilityRanking(Double abilityRanking) {
        this.abilityRanking = abilityRanking;
    }

    public Double getCognitionScore() {
        return cognitionScore;
    }

    public void setCognitionScore(Double cognitionScore) {
        this.cognitionScore = cognitionScore;
    }

    public Double getCognitionRanking() {
        return cognitionRanking;
    }

    public void setCognitionRanking(Double cognitionRanking) {
        this.cognitionRanking = cognitionRanking;
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

    public Double getPotentialRanking() {
        return potentialRanking;
    }

    public void setPotentialRanking(Double potentialRanking) {
        this.potentialRanking = potentialRanking;
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

    public Double getShichangdaoxiang() {
        return shichangdaoxiang;
    }

    public void setShichangdaoxiang(Double shichangdaoxiang) {
        this.shichangdaoxiang = shichangdaoxiang;
    }

    public Double getShichangdaoxiangyoushibiaoji() {
        return shichangdaoxiangyoushibiaoji;
    }

    public void setShichangdaoxiangyoushibiaoji(Double shichangdaoxiangyoushibiaoji) {
        this.shichangdaoxiangyoushibiaoji = shichangdaoxiangyoushibiaoji;
    }

    public Double getShichangdaoxiangdaifazhanbiaoji() {
        return shichangdaoxiangdaifazhanbiaoji;
    }

    public void setShichangdaoxiangdaifazhanbiaoji(Double shichangdaoxiangdaifazhanbiaoji) {
        this.shichangdaoxiangdaifazhanbiaoji = shichangdaoxiangdaifazhanbiaoji;
    }

    public Double getShichangdaoxianga() {
        return shichangdaoxianga;
    }

    public void setShichangdaoxianga(Double shichangdaoxianga) {
        this.shichangdaoxianga = shichangdaoxianga;
    }

    public Double getShichangdaoxiangb() {
        return shichangdaoxiangb;
    }

    public void setShichangdaoxiangb(Double shichangdaoxiangb) {
        this.shichangdaoxiangb = shichangdaoxiangb;
    }

    public Double getShichangdaoxiangc() {
        return shichangdaoxiangc;
    }

    public void setShichangdaoxiangc(Double shichangdaoxiangc) {
        this.shichangdaoxiangc = shichangdaoxiangc;
    }

    public Double getShichangdaoxiangd() {
        return shichangdaoxiangd;
    }

    public void setShichangdaoxiangd(Double shichangdaoxiangd) {
        this.shichangdaoxiangd = shichangdaoxiangd;
    }

    public Double getGoutongxietiao() {
        return goutongxietiao;
    }

    public void setGoutongxietiao(Double goutongxietiao) {
        this.goutongxietiao = goutongxietiao;
    }

    public Double getGoutongxietiaoyoushibiaoji() {
        return goutongxietiaoyoushibiaoji;
    }

    public void setGoutongxietiaoyoushibiaoji(Double goutongxietiaoyoushibiaoji) {
        this.goutongxietiaoyoushibiaoji = goutongxietiaoyoushibiaoji;
    }

    public Double getGoutongxietiaodaifazhanbiaoji() {
        return goutongxietiaodaifazhanbiaoji;
    }

    public void setGoutongxietiaodaifazhanbiaoji(Double goutongxietiaodaifazhanbiaoji) {
        this.goutongxietiaodaifazhanbiaoji = goutongxietiaodaifazhanbiaoji;
    }

    public Double getGoutongxietiaoa() {
        return goutongxietiaoa;
    }

    public void setGoutongxietiaoa(Double goutongxietiaoa) {
        this.goutongxietiaoa = goutongxietiaoa;
    }

    public Double getGoutongxietiaob() {
        return goutongxietiaob;
    }

    public void setGoutongxietiaob(Double goutongxietiaob) {
        this.goutongxietiaob = goutongxietiaob;
    }

    public Double getGoutongxietiaoc() {
        return goutongxietiaoc;
    }

    public void setGoutongxietiaoc(Double goutongxietiaoc) {
        this.goutongxietiaoc = goutongxietiaoc;
    }

    public Double getGoutongxietiaod() {
        return goutongxietiaod;
    }

    public void setGoutongxietiaod(Double goutongxietiaod) {
        this.goutongxietiaod = goutongxietiaod;
    }

    public Double getQianyanzhuizong() {
        return qianyanzhuizong;
    }

    public void setQianyanzhuizong(Double qianyanzhuizong) {
        this.qianyanzhuizong = qianyanzhuizong;
    }

    public Double getQianyanzhuizongyoushibiaoji() {
        return qianyanzhuizongyoushibiaoji;
    }

    public void setQianyanzhuizongyoushibiaoji(Double qianyanzhuizongyoushibiaoji) {
        this.qianyanzhuizongyoushibiaoji = qianyanzhuizongyoushibiaoji;
    }

    public Double getQianyanzhuizongdaifazhanbiaoji() {
        return qianyanzhuizongdaifazhanbiaoji;
    }

    public void setQianyanzhuizongdaifazhanbiaoji(Double qianyanzhuizongdaifazhanbiaoji) {
        this.qianyanzhuizongdaifazhanbiaoji = qianyanzhuizongdaifazhanbiaoji;
    }

    public Double getQianyanzhuizonga() {
        return qianyanzhuizonga;
    }

    public void setQianyanzhuizonga(Double qianyanzhuizonga) {
        this.qianyanzhuizonga = qianyanzhuizonga;
    }

    public Double getQianyanzhuizongb() {
        return qianyanzhuizongb;
    }

    public void setQianyanzhuizongb(Double qianyanzhuizongb) {
        this.qianyanzhuizongb = qianyanzhuizongb;
    }

    public Double getQianyanzhuizongc() {
        return qianyanzhuizongc;
    }

    public void setQianyanzhuizongc(Double qianyanzhuizongc) {
        this.qianyanzhuizongc = qianyanzhuizongc;
    }

    public Double getQianyanzhuizongd() {
        return qianyanzhuizongd;
    }

    public void setQianyanzhuizongd(Double qianyanzhuizongd) {
        this.qianyanzhuizongd = qianyanzhuizongd;
    }

    public Double getXitongsiwei() {
        return xitongsiwei;
    }

    public void setXitongsiwei(Double xitongsiwei) {
        this.xitongsiwei = xitongsiwei;
    }

    public Double getXitongsiweiyoushibiaoji() {
        return xitongsiweiyoushibiaoji;
    }

    public void setXitongsiweiyoushibiaoji(Double xitongsiweiyoushibiaoji) {
        this.xitongsiweiyoushibiaoji = xitongsiweiyoushibiaoji;
    }

    public Double getXitongsiweidaifazhanbiaoji() {
        return xitongsiweidaifazhanbiaoji;
    }

    public void setXitongsiweidaifazhanbiaoji(Double xitongsiweidaifazhanbiaoji) {
        this.xitongsiweidaifazhanbiaoji = xitongsiweidaifazhanbiaoji;
    }

    public Double getXitongsiweia() {
        return xitongsiweia;
    }

    public void setXitongsiweia(Double xitongsiweia) {
        this.xitongsiweia = xitongsiweia;
    }

    public Double getXitongsiweib() {
        return xitongsiweib;
    }

    public void setXitongsiweib(Double xitongsiweib) {
        this.xitongsiweib = xitongsiweib;
    }

    public Double getXitongsiweic() {
        return xitongsiweic;
    }

    public void setXitongsiweic(Double xitongsiweic) {
        this.xitongsiweic = xitongsiweic;
    }

    public Double getXitongsiweid() {
        return xitongsiweid;
    }

    public void setXitongsiweid(Double xitongsiweid) {
        this.xitongsiweid = xitongsiweid;
    }

    public Double getZhidaoyujiankong() {
        return zhidaoyujiankong;
    }

    public void setZhidaoyujiankong(Double zhidaoyujiankong) {
        this.zhidaoyujiankong = zhidaoyujiankong;
    }

    public Double getZhidaoyujiankongyoushibiaoji() {
        return zhidaoyujiankongyoushibiaoji;
    }

    public void setZhidaoyujiankongyoushibiaoji(Double zhidaoyujiankongyoushibiaoji) {
        this.zhidaoyujiankongyoushibiaoji = zhidaoyujiankongyoushibiaoji;
    }

    public Double getZhidaoyujiankongfazhanbiaoji() {
        return zhidaoyujiankongfazhanbiaoji;
    }

    public void setZhidaoyujiankongfazhanbiaoji(Double zhidaoyujiankongfazhanbiaoji) {
        this.zhidaoyujiankongfazhanbiaoji = zhidaoyujiankongfazhanbiaoji;
    }

    public Double getZhidaoyujiankonga() {
        return zhidaoyujiankonga;
    }

    public void setZhidaoyujiankonga(Double zhidaoyujiankonga) {
        this.zhidaoyujiankonga = zhidaoyujiankonga;
    }

    public Double getZhidaoyujiankongb() {
        return zhidaoyujiankongb;
    }

    public void setZhidaoyujiankongb(Double zhidaoyujiankongb) {
        this.zhidaoyujiankongb = zhidaoyujiankongb;
    }

    public Double getZhidaoyujiankongc() {
        return zhidaoyujiankongc;
    }

    public void setZhidaoyujiankongc(Double zhidaoyujiankongc) {
        this.zhidaoyujiankongc = zhidaoyujiankongc;
    }

    public Double getZhidaoyujiankongd() {
        return zhidaoyujiankongd;
    }

    public void setZhidaoyujiankongd(Double zhidaoyujiankongd) {
        this.zhidaoyujiankongd = zhidaoyujiankongd;
    }

    public Double getJili() {
        return jili;
    }

    public void setJili(Double jili) {
        this.jili = jili;
    }

    public Double getJiliyoushibiaoji() {
        return jiliyoushibiaoji;
    }

    public void setJiliyoushibiaoji(Double jiliyoushibiaoji) {
        this.jiliyoushibiaoji = jiliyoushibiaoji;
    }

    public Double getJilidaifazhanbiaoji() {
        return jilidaifazhanbiaoji;
    }

    public void setJilidaifazhanbiaoji(Double jilidaifazhanbiaoji) {
        this.jilidaifazhanbiaoji = jilidaifazhanbiaoji;
    }

    public Double getJilia() {
        return jilia;
    }

    public void setJilia(Double jilia) {
        this.jilia = jilia;
    }

    public Double getJilib() {
        return jilib;
    }

    public void setJilib(Double jilib) {
        this.jilib = jilib;
    }

    public Double getJilic() {
        return jilic;
    }

    public void setJilic(Double jilic) {
        this.jilic = jilic;
    }

    public Double getJilid() {
        return jilid;
    }

    public void setJilid(Double jilid) {
        this.jilid = jilid;
    }

    public Double getShengrenliScore() {
        return shengrenliScore;
    }

    public void setShengrenliScore(Double shengrenliScore) {
        this.shengrenliScore = shengrenliScore;
    }

    public Double getShengrenliRanking() {
        return shengrenliRanking;
    }

    public void setShengrenliRanking(Double shengrenliRanking) {
        this.shengrenliRanking = shengrenliRanking;
    }

    public Double getJingyeAverage() {
        return jingyeAverage;
    }

    public void setJingyeAverage(Double jingyeAverage) {
        this.jingyeAverage = jingyeAverage;
    }

    public Double getZhixingAverage() {
        return zhixingAverage;
    }

    public void setZhixingAverage(Double zhixingAverage) {
        this.zhixingAverage = zhixingAverage;
    }

    public Double getKehuweizhongxinAverage() {
        return kehuweizhongxinAverage;
    }

    public void setKehuweizhongxinAverage(Double kehuweizhongxinAverage) {
        this.kehuweizhongxinAverage = kehuweizhongxinAverage;
    }

    public Double getZhiduyishiAverage() {
        return zhiduyishiAverage;
    }

    public void setZhiduyishiAverage(Double zhiduyishiAverage) {
        this.zhiduyishiAverage = zhiduyishiAverage;
    }

    public Double getShichangdaoxiangAverage() {
        return shichangdaoxiangAverage;
    }

    public void setShichangdaoxiangAverage(Double shichangdaoxiangAverage) {
        this.shichangdaoxiangAverage = shichangdaoxiangAverage;
    }

    public Double getGoutongxietiaoAverage() {
        return goutongxietiaoAverage;
    }

    public void setGoutongxietiaoAverage(Double goutongxietiaoAverage) {
        this.goutongxietiaoAverage = goutongxietiaoAverage;
    }

    public Double getQianyanzhuizongAverage() {
        return qianyanzhuizongAverage;
    }

    public void setQianyanzhuizongAverage(Double qianyanzhuizongAverage) {
        this.qianyanzhuizongAverage = qianyanzhuizongAverage;
    }

    public Double getXitongsiweiAverage() {
        return xitongsiweiAverage;
    }

    public void setXitongsiweiAverage(Double xitongsiweiAverage) {
        this.xitongsiweiAverage = xitongsiweiAverage;
    }

    public Double getZhidaoyujiankongAverage() {
        return zhidaoyujiankongAverage;
    }

    public void setZhidaoyujiankongAverage(Double zhidaoyujiankongAverage) {
        this.zhidaoyujiankongAverage = zhidaoyujiankongAverage;
    }

    public Double getJiliAverage() {
        return jiliAverage;
    }

    public void setJiliAverage(Double jiliAverage) {
        this.jiliAverage = jiliAverage;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "FirstLineManager{" +
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
                ", jichutiaojianjicengguanliRanking=" + jichutiaojianjicengguanliRanking +
                ", abilityScore=" + abilityScore +
                ", abilityRanking=" + abilityRanking +
                ", cognitionScore=" + cognitionScore +
                ", cognitionRanking=" + cognitionRanking +
                ", potentialLevel=" + potentialLevel +
                ", potentialScore=" + potentialScore +
                ", potentialRanking=" + potentialRanking +
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
                ", shichangdaoxiang=" + shichangdaoxiang +
                ", shichangdaoxiangyoushibiaoji=" + shichangdaoxiangyoushibiaoji +
                ", shichangdaoxiangdaifazhanbiaoji=" + shichangdaoxiangdaifazhanbiaoji +
                ", shichangdaoxianga=" + shichangdaoxianga +
                ", shichangdaoxiangb=" + shichangdaoxiangb +
                ", shichangdaoxiangc=" + shichangdaoxiangc +
                ", shichangdaoxiangd=" + shichangdaoxiangd +
                ", goutongxietiao=" + goutongxietiao +
                ", goutongxietiaoyoushibiaoji=" + goutongxietiaoyoushibiaoji +
                ", goutongxietiaodaifazhanbiaoji=" + goutongxietiaodaifazhanbiaoji +
                ", goutongxietiaoa=" + goutongxietiaoa +
                ", goutongxietiaob=" + goutongxietiaob +
                ", goutongxietiaoc=" + goutongxietiaoc +
                ", goutongxietiaod=" + goutongxietiaod +
                ", qianyanzhuizong=" + qianyanzhuizong +
                ", qianyanzhuizongyoushibiaoji=" + qianyanzhuizongyoushibiaoji +
                ", qianyanzhuizongdaifazhanbiaoji=" + qianyanzhuizongdaifazhanbiaoji +
                ", qianyanzhuizonga=" + qianyanzhuizonga +
                ", qianyanzhuizongb=" + qianyanzhuizongb +
                ", qianyanzhuizongc=" + qianyanzhuizongc +
                ", qianyanzhuizongd=" + qianyanzhuizongd +
                ", xitongsiwei=" + xitongsiwei +
                ", xitongsiweiyoushibiaoji=" + xitongsiweiyoushibiaoji +
                ", xitongsiweidaifazhanbiaoji=" + xitongsiweidaifazhanbiaoji +
                ", xitongsiweia=" + xitongsiweia +
                ", xitongsiweib=" + xitongsiweib +
                ", xitongsiweic=" + xitongsiweic +
                ", xitongsiweid=" + xitongsiweid +
                ", zhidaoyujiankong=" + zhidaoyujiankong +
                ", zhidaoyujiankongyoushibiaoji=" + zhidaoyujiankongyoushibiaoji +
                ", zhidaoyujiankongfazhanbiaoji=" + zhidaoyujiankongfazhanbiaoji +
                ", zhidaoyujiankonga=" + zhidaoyujiankonga +
                ", zhidaoyujiankongb=" + zhidaoyujiankongb +
                ", zhidaoyujiankongc=" + zhidaoyujiankongc +
                ", zhidaoyujiankongd=" + zhidaoyujiankongd +
                ", jili=" + jili +
                ", jiliyoushibiaoji=" + jiliyoushibiaoji +
                ", jilidaifazhanbiaoji=" + jilidaifazhanbiaoji +
                ", jilia=" + jilia +
                ", jilib=" + jilib +
                ", jilic=" + jilic +
                ", jilid=" + jilid +
                ", shengrenliScore=" + shengrenliScore +
                ", shengrenliRanking=" + shengrenliRanking +
                ", jingyeAverage=" + jingyeAverage +
                ", zhixingAverage=" + zhixingAverage +
                ", kehuweizhongxinAverage=" + kehuweizhongxinAverage +
                ", zhiduyishiAverage=" + zhiduyishiAverage +
                ", shichangdaoxiangAverage=" + shichangdaoxiangAverage +
                ", goutongxietiaoAverage=" + goutongxietiaoAverage +
                ", qianyanzhuizongAverage=" + qianyanzhuizongAverage +
                ", xitongsiweiAverage=" + xitongsiweiAverage +
                ", zhidaoyujiankongAverage=" + zhidaoyujiankongAverage +
                ", jiliAverage=" + jiliAverage +
                ", sequence=" + sequence +
                '}';
    }
}

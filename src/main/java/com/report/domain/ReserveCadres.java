package com.report.domain;

import com.report.common.utils.ExcelCell;

/**
 * 后备干部
 * Created by 刘东旭 on 2017/10/23.
 */
public class ReserveCadres extends BaseBean{
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
    private Double potentialLevel;//潜质等级
    @ExcelCell(index = 12)
    private Double potentialScore;//潜质总分
    @ExcelCell(index = 13)
    private Double potentialReserveRanking;//潜质后备干部内排名
    @ExcelCell(index = 14)
    private Double interval;//总区间
    @ExcelCell(index = 15)
    private Double hongguansiwei;
    @ExcelCell(index = 16)
    private Double hongguansiweiyoushibiaoji;
    @ExcelCell(index = 17)
    private Double hongguansiweidaifazhanbiaoji;
    @ExcelCell(index = 18)
    private Double xinxifenxi;
    @ExcelCell(index = 19)
    private Double xinxifenxiyoushibiaoji;
    @ExcelCell(index = 20)
    private Double xinxifenxidaifazhanbiaoji;
    @ExcelCell(index = 21)
    private Double caozuojingyan;
    @ExcelCell(index = 22)
    private Double caozuojingyanyoushibiaoji;
    @ExcelCell(index = 23)
    private Double caozuojingyandaifazhanbiaoji;
    @ExcelCell(index = 24)
    private Double zhixingjihua;
    @ExcelCell(index = 25)
    private Double zhixingjihuayoushibiaoji;
    @ExcelCell(index = 26)
    private Double zhixingjihuadaifazhanbiaoji;
    @ExcelCell(index = 27)
    private Double tuidongtaren;
    @ExcelCell(index = 28)
    private Double tuidongtarenyoushibiaoji;
    @ExcelCell(index = 29)
    private Double tuidongtarendaifazhanbiaoji;
    @ExcelCell(index = 30)
    private Double renjijiaowang;
    @ExcelCell(index = 31)
    private Double renjijiaowangyoushibiaoji;
    @ExcelCell(index = 32)
    private Double renjijiaowangdaifazhanbiaoji;
    @ExcelCell(index = 33)
    private Double renjilijie;
    @ExcelCell(index = 34)
    private Double renjilijieyoushibiaoji;
    @ExcelCell(index = 35)
    private Double renjilijiedaifazhanbiaoji;
    @ExcelCell(index = 36)
    private Double zhidaotaren;
    @ExcelCell(index = 37)
    private Double zhidaotarenyoushibiaoji;
    @ExcelCell(index = 38)
    private Double zhidaotarendaifazhanbiaoji;
    @ExcelCell(index = 39)
    private Double zhidaoyujiankongyoushi;
    @ExcelCell(index = 40)
    private Double zhidaoyujiankongyoushibiaoji;
    @ExcelCell(index = 41)
    private Double zhidaoyujiankongdaifazhanbiaoji;
    @ExcelCell(index = 42)
    private Double zhidaoyujiankonga;
    @ExcelCell(index = 43)
    private Double zhidaoyujiankongb;
    @ExcelCell(index = 44)
    private Double zhidaoyujiankongc;
    @ExcelCell(index = 45)
    private Double zhidaoyujiankongd;
    @ExcelCell(index = 46)
    private Double jili;
    @ExcelCell(index = 47)
    private Double jiliyoushibiaoji;
    @ExcelCell(index = 48)
    private Double jilidaifazhanbiaoji;
    @ExcelCell(index = 49)
    private Double jilia;
    @ExcelCell(index = 50)
    private Double jilib;
    @ExcelCell(index = 51)
    private Double jilic;
    @ExcelCell(index = 52)
    private Double jilid;
    @ExcelCell(index = 53)
    private Double peiyangtaren;
    @ExcelCell(index = 54)
    private Double peiyangtarenyoushibiaoji;
    @ExcelCell(index = 55)
    private Double peiyangtarenfazhanbiaoji;
    @ExcelCell(index = 56)
    private Double peiyangtarena;
    @ExcelCell(index = 57)
    private Double peiyangtarenb;
    @ExcelCell(index = 58)
    private Double peiyangtarenc;
    @ExcelCell(index = 59)
    private Double peiyangtarend;
    @ExcelCell(index = 60)
    private Double goutongxietiao;
    @ExcelCell(index = 61)
    private Double goutongxietiaoyoushibiaoji;
    @ExcelCell(index = 62)
    private Double goutongxietiaodaifazhanbiaoji;
    @ExcelCell(index = 63)
    private Double goutongxietiaoa;
    @ExcelCell(index = 64)
    private Double goutongxietiaob;
    @ExcelCell(index = 65)
    private Double goutongxietiaoc;
    @ExcelCell(index = 66)
    private Double goutongxietiaod;
    @ExcelCell(index = 67)
    private Double zhidugoujianyouhua;
    @ExcelCell(index = 68)
    private Double zhidugoujianyouhuayoushibiaoji;
    @ExcelCell(index = 69)
    private Double zhidugoujianyouhuadaifazhanbiaoji;
    @ExcelCell(index = 70)
    private Double zhidugoujianyouhuaa;
    @ExcelCell(index = 71)
    private Double zhidugoujianyouhuab;
    @ExcelCell(index = 72)
    private Double zhidugoujianyouhuac;
    @ExcelCell(index = 73)
    private Double zhidugoujianyouhuad;
    @ExcelCell(index = 74)
    private Double quanjuguannian;
    @ExcelCell(index = 75)
    private Double quanjuguannianyoushibiaoji;
    @ExcelCell(index = 76)
    private Double quanjuguanniandaifazhanbiaoji;
    @ExcelCell(index = 77)
    private Double quanjuguanniana;
    @ExcelCell(index = 78)
    private Double quanjuguannianb;
    @ExcelCell(index = 79)
    private Double quanjuguannianc;
    @ExcelCell(index = 80)
    private Double quanjuguanniand;
    @ExcelCell(index = 81)
    private Double shengrenliScore;
    @ExcelCell(index = 82)
    private Double shengrenliRanking;
    @ExcelCell(index = 83)
    private Double hongguansiweiAverage;
    @ExcelCell(index = 84)
    private Double xinxifenxiAverage;
    @ExcelCell(index = 85)
    private Double caozuotiyanAverage;
    @ExcelCell(index = 86)
    private Double zhixingjihuaAverage;
    @ExcelCell(index = 87)
    private Double tuidongtarenAverage;
    @ExcelCell(index = 88)
    private Double renjijiaowangAverage;
    @ExcelCell(index = 89)
    private Double renjilijieAverage;
    @ExcelCell(index = 90)
    private Double zhidaorarenAverage;

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

    public Double getPotentialReserveRanking() {
        return potentialReserveRanking;
    }

    public void setPotentialReserveRanking(Double potentialReserveRanking) {
        this.potentialReserveRanking = potentialReserveRanking;
    }

    public Double getInterval() {
        return interval;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public Double getHongguansiwei() {
        return hongguansiwei;
    }

    public void setHongguansiwei(Double hongguansiwei) {
        this.hongguansiwei = hongguansiwei;
    }

    public Double getHongguansiweiyoushibiaoji() {
        return hongguansiweiyoushibiaoji;
    }

    public void setHongguansiweiyoushibiaoji(Double hongguansiweiyoushibiaoji) {
        this.hongguansiweiyoushibiaoji = hongguansiweiyoushibiaoji;
    }

    public Double getHongguansiweidaifazhanbiaoji() {
        return hongguansiweidaifazhanbiaoji;
    }

    public void setHongguansiweidaifazhanbiaoji(Double hongguansiweidaifazhanbiaoji) {
        this.hongguansiweidaifazhanbiaoji = hongguansiweidaifazhanbiaoji;
    }

    public Double getXinxifenxi() {
        return xinxifenxi;
    }

    public void setXinxifenxi(Double xinxifenxi) {
        this.xinxifenxi = xinxifenxi;
    }

    public Double getXinxifenxiyoushibiaoji() {
        return xinxifenxiyoushibiaoji;
    }

    public void setXinxifenxiyoushibiaoji(Double xinxifenxiyoushibiaoji) {
        this.xinxifenxiyoushibiaoji = xinxifenxiyoushibiaoji;
    }

    public Double getXinxifenxidaifazhanbiaoji() {
        return xinxifenxidaifazhanbiaoji;
    }

    public void setXinxifenxidaifazhanbiaoji(Double xinxifenxidaifazhanbiaoji) {
        this.xinxifenxidaifazhanbiaoji = xinxifenxidaifazhanbiaoji;
    }

    public Double getCaozuojingyan() {
        return caozuojingyan;
    }

    public void setCaozuojingyan(Double caozuojingyan) {
        this.caozuojingyan = caozuojingyan;
    }

    public Double getCaozuojingyanyoushibiaoji() {
        return caozuojingyanyoushibiaoji;
    }

    public void setCaozuojingyanyoushibiaoji(Double caozuojingyanyoushibiaoji) {
        this.caozuojingyanyoushibiaoji = caozuojingyanyoushibiaoji;
    }

    public Double getCaozuojingyandaifazhanbiaoji() {
        return caozuojingyandaifazhanbiaoji;
    }

    public void setCaozuojingyandaifazhanbiaoji(Double caozuojingyandaifazhanbiaoji) {
        this.caozuojingyandaifazhanbiaoji = caozuojingyandaifazhanbiaoji;
    }

    public Double getZhixingjihua() {
        return zhixingjihua;
    }

    public void setZhixingjihua(Double zhixingjihua) {
        this.zhixingjihua = zhixingjihua;
    }

    public Double getZhixingjihuayoushibiaoji() {
        return zhixingjihuayoushibiaoji;
    }

    public void setZhixingjihuayoushibiaoji(Double zhixingjihuayoushibiaoji) {
        this.zhixingjihuayoushibiaoji = zhixingjihuayoushibiaoji;
    }

    public Double getZhixingjihuadaifazhanbiaoji() {
        return zhixingjihuadaifazhanbiaoji;
    }

    public void setZhixingjihuadaifazhanbiaoji(Double zhixingjihuadaifazhanbiaoji) {
        this.zhixingjihuadaifazhanbiaoji = zhixingjihuadaifazhanbiaoji;
    }

    public Double getTuidongtaren() {
        return tuidongtaren;
    }

    public void setTuidongtaren(Double tuidongtaren) {
        this.tuidongtaren = tuidongtaren;
    }

    public Double getTuidongtarenyoushibiaoji() {
        return tuidongtarenyoushibiaoji;
    }

    public void setTuidongtarenyoushibiaoji(Double tuidongtarenyoushibiaoji) {
        this.tuidongtarenyoushibiaoji = tuidongtarenyoushibiaoji;
    }

    public Double getTuidongtarendaifazhanbiaoji() {
        return tuidongtarendaifazhanbiaoji;
    }

    public void setTuidongtarendaifazhanbiaoji(Double tuidongtarendaifazhanbiaoji) {
        this.tuidongtarendaifazhanbiaoji = tuidongtarendaifazhanbiaoji;
    }

    public Double getRenjijiaowang() {
        return renjijiaowang;
    }

    public void setRenjijiaowang(Double renjijiaowang) {
        this.renjijiaowang = renjijiaowang;
    }

    public Double getRenjijiaowangyoushibiaoji() {
        return renjijiaowangyoushibiaoji;
    }

    public void setRenjijiaowangyoushibiaoji(Double renjijiaowangyoushibiaoji) {
        this.renjijiaowangyoushibiaoji = renjijiaowangyoushibiaoji;
    }

    public Double getRenjijiaowangdaifazhanbiaoji() {
        return renjijiaowangdaifazhanbiaoji;
    }

    public void setRenjijiaowangdaifazhanbiaoji(Double renjijiaowangdaifazhanbiaoji) {
        this.renjijiaowangdaifazhanbiaoji = renjijiaowangdaifazhanbiaoji;
    }

    public Double getRenjilijie() {
        return renjilijie;
    }

    public void setRenjilijie(Double renjilijie) {
        this.renjilijie = renjilijie;
    }

    public Double getRenjilijieyoushibiaoji() {
        return renjilijieyoushibiaoji;
    }

    public void setRenjilijieyoushibiaoji(Double renjilijieyoushibiaoji) {
        this.renjilijieyoushibiaoji = renjilijieyoushibiaoji;
    }

    public Double getRenjilijiedaifazhanbiaoji() {
        return renjilijiedaifazhanbiaoji;
    }

    public void setRenjilijiedaifazhanbiaoji(Double renjilijiedaifazhanbiaoji) {
        this.renjilijiedaifazhanbiaoji = renjilijiedaifazhanbiaoji;
    }

    public Double getZhidaotaren() {
        return zhidaotaren;
    }

    public void setZhidaotaren(Double zhidaotaren) {
        this.zhidaotaren = zhidaotaren;
    }

    public Double getZhidaotarenyoushibiaoji() {
        return zhidaotarenyoushibiaoji;
    }

    public void setZhidaotarenyoushibiaoji(Double zhidaotarenyoushibiaoji) {
        this.zhidaotarenyoushibiaoji = zhidaotarenyoushibiaoji;
    }

    public Double getZhidaotarendaifazhanbiaoji() {
        return zhidaotarendaifazhanbiaoji;
    }

    public void setZhidaotarendaifazhanbiaoji(Double zhidaotarendaifazhanbiaoji) {
        this.zhidaotarendaifazhanbiaoji = zhidaotarendaifazhanbiaoji;
    }

    public Double getZhidaoyujiankongyoushi() {
        return zhidaoyujiankongyoushi;
    }

    public void setZhidaoyujiankongyoushi(Double zhidaoyujiankongyoushi) {
        this.zhidaoyujiankongyoushi = zhidaoyujiankongyoushi;
    }

    public Double getZhidaoyujiankongyoushibiaoji() {
        return zhidaoyujiankongyoushibiaoji;
    }

    public void setZhidaoyujiankongyoushibiaoji(Double zhidaoyujiankongyoushibiaoji) {
        this.zhidaoyujiankongyoushibiaoji = zhidaoyujiankongyoushibiaoji;
    }

    public Double getZhidaoyujiankongdaifazhanbiaoji() {
        return zhidaoyujiankongdaifazhanbiaoji;
    }

    public void setZhidaoyujiankongdaifazhanbiaoji(Double zhidaoyujiankongdaifazhanbiaoji) {
        this.zhidaoyujiankongdaifazhanbiaoji = zhidaoyujiankongdaifazhanbiaoji;
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

    public Double getPeiyangtaren() {
        return peiyangtaren;
    }

    public void setPeiyangtaren(Double peiyangtaren) {
        this.peiyangtaren = peiyangtaren;
    }

    public Double getPeiyangtarenyoushibiaoji() {
        return peiyangtarenyoushibiaoji;
    }

    public void setPeiyangtarenyoushibiaoji(Double peiyangtarenyoushibiaoji) {
        this.peiyangtarenyoushibiaoji = peiyangtarenyoushibiaoji;
    }

    public Double getPeiyangtarenfazhanbiaoji() {
        return peiyangtarenfazhanbiaoji;
    }

    public void setPeiyangtarenfazhanbiaoji(Double peiyangtarenfazhanbiaoji) {
        this.peiyangtarenfazhanbiaoji = peiyangtarenfazhanbiaoji;
    }

    public Double getPeiyangtarena() {
        return peiyangtarena;
    }

    public void setPeiyangtarena(Double peiyangtarena) {
        this.peiyangtarena = peiyangtarena;
    }

    public Double getPeiyangtarenb() {
        return peiyangtarenb;
    }

    public void setPeiyangtarenb(Double peiyangtarenb) {
        this.peiyangtarenb = peiyangtarenb;
    }

    public Double getPeiyangtarenc() {
        return peiyangtarenc;
    }

    public void setPeiyangtarenc(Double peiyangtarenc) {
        this.peiyangtarenc = peiyangtarenc;
    }

    public Double getPeiyangtarend() {
        return peiyangtarend;
    }

    public void setPeiyangtarend(Double peiyangtarend) {
        this.peiyangtarend = peiyangtarend;
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

    public Double getZhidugoujianyouhua() {
        return zhidugoujianyouhua;
    }

    public void setZhidugoujianyouhua(Double zhidugoujianyouhua) {
        this.zhidugoujianyouhua = zhidugoujianyouhua;
    }

    public Double getZhidugoujianyouhuayoushibiaoji() {
        return zhidugoujianyouhuayoushibiaoji;
    }

    public void setZhidugoujianyouhuayoushibiaoji(Double zhidugoujianyouhuayoushibiaoji) {
        this.zhidugoujianyouhuayoushibiaoji = zhidugoujianyouhuayoushibiaoji;
    }

    public Double getZhidugoujianyouhuadaifazhanbiaoji() {
        return zhidugoujianyouhuadaifazhanbiaoji;
    }

    public void setZhidugoujianyouhuadaifazhanbiaoji(Double zhidugoujianyouhuadaifazhanbiaoji) {
        this.zhidugoujianyouhuadaifazhanbiaoji = zhidugoujianyouhuadaifazhanbiaoji;
    }

    public Double getZhidugoujianyouhuaa() {
        return zhidugoujianyouhuaa;
    }

    public void setZhidugoujianyouhuaa(Double zhidugoujianyouhuaa) {
        this.zhidugoujianyouhuaa = zhidugoujianyouhuaa;
    }

    public Double getZhidugoujianyouhuab() {
        return zhidugoujianyouhuab;
    }

    public void setZhidugoujianyouhuab(Double zhidugoujianyouhuab) {
        this.zhidugoujianyouhuab = zhidugoujianyouhuab;
    }

    public Double getZhidugoujianyouhuac() {
        return zhidugoujianyouhuac;
    }

    public void setZhidugoujianyouhuac(Double zhidugoujianyouhuac) {
        this.zhidugoujianyouhuac = zhidugoujianyouhuac;
    }

    public Double getZhidugoujianyouhuad() {
        return zhidugoujianyouhuad;
    }

    public void setZhidugoujianyouhuad(Double zhidugoujianyouhuad) {
        this.zhidugoujianyouhuad = zhidugoujianyouhuad;
    }

    public Double getQuanjuguannian() {
        return quanjuguannian;
    }

    public void setQuanjuguannian(Double quanjuguannian) {
        this.quanjuguannian = quanjuguannian;
    }

    public Double getQuanjuguannianyoushibiaoji() {
        return quanjuguannianyoushibiaoji;
    }

    public void setQuanjuguannianyoushibiaoji(Double quanjuguannianyoushibiaoji) {
        this.quanjuguannianyoushibiaoji = quanjuguannianyoushibiaoji;
    }

    public Double getQuanjuguanniandaifazhanbiaoji() {
        return quanjuguanniandaifazhanbiaoji;
    }

    public void setQuanjuguanniandaifazhanbiaoji(Double quanjuguanniandaifazhanbiaoji) {
        this.quanjuguanniandaifazhanbiaoji = quanjuguanniandaifazhanbiaoji;
    }

    public Double getQuanjuguanniana() {
        return quanjuguanniana;
    }

    public void setQuanjuguanniana(Double quanjuguanniana) {
        this.quanjuguanniana = quanjuguanniana;
    }

    public Double getQuanjuguannianb() {
        return quanjuguannianb;
    }

    public void setQuanjuguannianb(Double quanjuguannianb) {
        this.quanjuguannianb = quanjuguannianb;
    }

    public Double getQuanjuguannianc() {
        return quanjuguannianc;
    }

    public void setQuanjuguannianc(Double quanjuguannianc) {
        this.quanjuguannianc = quanjuguannianc;
    }

    public Double getQuanjuguanniand() {
        return quanjuguanniand;
    }

    public void setQuanjuguanniand(Double quanjuguanniand) {
        this.quanjuguanniand = quanjuguanniand;
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

    public Double getHongguansiweiAverage() {
        return hongguansiweiAverage;
    }

    public void setHongguansiweiAverage(Double hongguansiweiAverage) {
        this.hongguansiweiAverage = hongguansiweiAverage;
    }

    public Double getXinxifenxiAverage() {
        return xinxifenxiAverage;
    }

    public void setXinxifenxiAverage(Double xinxifenxiAverage) {
        this.xinxifenxiAverage = xinxifenxiAverage;
    }

    public Double getCaozuotiyanAverage() {
        return caozuotiyanAverage;
    }

    public void setCaozuotiyanAverage(Double caozuotiyanAverage) {
        this.caozuotiyanAverage = caozuotiyanAverage;
    }

    public Double getZhixingjihuaAverage() {
        return zhixingjihuaAverage;
    }

    public void setZhixingjihuaAverage(Double zhixingjihuaAverage) {
        this.zhixingjihuaAverage = zhixingjihuaAverage;
    }

    public Double getTuidongtarenAverage() {
        return tuidongtarenAverage;
    }

    public void setTuidongtarenAverage(Double tuidongtarenAverage) {
        this.tuidongtarenAverage = tuidongtarenAverage;
    }

    public Double getRenjijiaowangAverage() {
        return renjijiaowangAverage;
    }

    public void setRenjijiaowangAverage(Double renjijiaowangAverage) {
        this.renjijiaowangAverage = renjijiaowangAverage;
    }

    public Double getRenjilijieAverage() {
        return renjilijieAverage;
    }

    public void setRenjilijieAverage(Double renjilijieAverage) {
        this.renjilijieAverage = renjilijieAverage;
    }

    public Double getZhidaorarenAverage() {
        return zhidaorarenAverage;
    }

    public void setZhidaorarenAverage(Double zhidaorarenAverage) {
        this.zhidaorarenAverage = zhidaorarenAverage;
    }

    @Override
    public String toString() {
        return "ReserveCadres{" +
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
                ", potentialLevel=" + potentialLevel +
                ", potentialScore=" + potentialScore +
                ", potentialReserveRanking=" + potentialReserveRanking +
                ", interval=" + interval +
                ", hongguansiwei=" + hongguansiwei +
                ", hongguansiweiyoushibiaoji=" + hongguansiweiyoushibiaoji +
                ", hongguansiweidaifazhanbiaoji=" + hongguansiweidaifazhanbiaoji +
                ", xinxifenxi=" + xinxifenxi +
                ", xinxifenxiyoushibiaoji=" + xinxifenxiyoushibiaoji +
                ", xinxifenxidaifazhanbiaoji=" + xinxifenxidaifazhanbiaoji +
                ", caozuojingyan=" + caozuojingyan +
                ", caozuojingyanyoushibiaoji=" + caozuojingyanyoushibiaoji +
                ", caozuojingyandaifazhanbiaoji=" + caozuojingyandaifazhanbiaoji +
                ", zhixingjihua=" + zhixingjihua +
                ", zhixingjihuayoushibiaoji=" + zhixingjihuayoushibiaoji +
                ", zhixingjihuadaifazhanbiaoji=" + zhixingjihuadaifazhanbiaoji +
                ", tuidongtaren=" + tuidongtaren +
                ", tuidongtarenyoushibiaoji=" + tuidongtarenyoushibiaoji +
                ", tuidongtarendaifazhanbiaoji=" + tuidongtarendaifazhanbiaoji +
                ", renjijiaowang=" + renjijiaowang +
                ", renjijiaowangyoushibiaoji=" + renjijiaowangyoushibiaoji +
                ", renjijiaowangdaifazhanbiaoji=" + renjijiaowangdaifazhanbiaoji +
                ", renjilijie=" + renjilijie +
                ", renjilijieyoushibiaoji=" + renjilijieyoushibiaoji +
                ", renjilijiedaifazhanbiaoji=" + renjilijiedaifazhanbiaoji +
                ", zhidaotaren=" + zhidaotaren +
                ", zhidaotarenyoushibiaoji=" + zhidaotarenyoushibiaoji +
                ", zhidaotarendaifazhanbiaoji=" + zhidaotarendaifazhanbiaoji +
                ", zhidaoyujiankongyoushi=" + zhidaoyujiankongyoushi +
                ", zhidaoyujiankongyoushibiaoji=" + zhidaoyujiankongyoushibiaoji +
                ", zhidaoyujiankongdaifazhanbiaoji=" + zhidaoyujiankongdaifazhanbiaoji +
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
                ", peiyangtaren=" + peiyangtaren +
                ", peiyangtarenyoushibiaoji=" + peiyangtarenyoushibiaoji +
                ", peiyangtarenfazhanbiaoji=" + peiyangtarenfazhanbiaoji +
                ", peiyangtarena=" + peiyangtarena +
                ", peiyangtarenb=" + peiyangtarenb +
                ", peiyangtarenc=" + peiyangtarenc +
                ", peiyangtarend=" + peiyangtarend +
                ", goutongxietiao=" + goutongxietiao +
                ", goutongxietiaoyoushibiaoji=" + goutongxietiaoyoushibiaoji +
                ", goutongxietiaodaifazhanbiaoji=" + goutongxietiaodaifazhanbiaoji +
                ", goutongxietiaoa=" + goutongxietiaoa +
                ", goutongxietiaob=" + goutongxietiaob +
                ", goutongxietiaoc=" + goutongxietiaoc +
                ", goutongxietiaod=" + goutongxietiaod +
                ", zhidugoujianyouhua=" + zhidugoujianyouhua +
                ", zhidugoujianyouhuayoushibiaoji=" + zhidugoujianyouhuayoushibiaoji +
                ", zhidugoujianyouhuadaifazhanbiaoji=" + zhidugoujianyouhuadaifazhanbiaoji +
                ", zhidugoujianyouhuaa=" + zhidugoujianyouhuaa +
                ", zhidugoujianyouhuab=" + zhidugoujianyouhuab +
                ", zhidugoujianyouhuac=" + zhidugoujianyouhuac +
                ", zhidugoujianyouhuad=" + zhidugoujianyouhuad +
                ", quanjuguannian=" + quanjuguannian +
                ", quanjuguannianyoushibiaoji=" + quanjuguannianyoushibiaoji +
                ", quanjuguanniandaifazhanbiaoji=" + quanjuguanniandaifazhanbiaoji +
                ", quanjuguanniana=" + quanjuguanniana +
                ", quanjuguannianb=" + quanjuguannianb +
                ", quanjuguannianc=" + quanjuguannianc +
                ", quanjuguanniand=" + quanjuguanniand +
                ", shengrenliScore=" + shengrenliScore +
                ", shengrenliRanking=" + shengrenliRanking +
                ", hongguansiweiAverage=" + hongguansiweiAverage +
                ", xinxifenxiAverage=" + xinxifenxiAverage +
                ", caozuotiyanAverage=" + caozuotiyanAverage +
                ", zhixingjihuaAverage=" + zhixingjihuaAverage +
                ", tuidongtarenAverage=" + tuidongtarenAverage +
                ", renjijiaowangAverage=" + renjijiaowangAverage +
                ", renjilijieAverage=" + renjilijieAverage +
                ", zhidaorarenAverage=" + zhidaorarenAverage +
                '}';
    }
}

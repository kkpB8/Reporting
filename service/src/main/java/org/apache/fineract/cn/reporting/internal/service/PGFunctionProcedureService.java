package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.*;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PGFunctionProcedureService {
    private final Logger logger;

    @Autowired
    public PGFunctionProcedureService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger
    ) {
        super();
        this.logger = logger;
    }

    /* @Value("${postgresql.driverClass}")
     private String driverClass;
     @Value("${postgresql.database}")
     private String database;*/
    @Value("${postgresql.host}")
    private String host;
    @Value("${postgresql.port}")
    private String port;
    @Value("${postgresql.user}")
    private String user_sp;
    @Value("${postgresql.password}")
    private String password_sp;
    //private String url_sp = "jdbc:postgresql://"+host+":"+port+"/";
    //private final String url_sp = "jdbc:postgresql://43.241.70.101:5432/dynamic_lokos";
    // private final String user_sp = "postgres";
    // private final String password_sp = "Microware@123";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Procedure object
     */
    public List<GeographicalCoverage> fn_getgeographicalcoverage(String loctype, String dto, String dfrom, String sid, String did,
                                                                 String bid, String pid, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<GeographicalCoverage> geographicalCoverageList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getgeographicalcoverage(?,?,?,?,?,?,?)}");
            stmt.setString(1, loctype);
            stmt.setString(2, dto);
            stmt.setString(3, dfrom);
            stmt.setString(4, sid);
            stmt.setString(5, did);
            stmt.setString(6, bid);
            stmt.setString(7, pid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                GeographicalCoverage geographicalCoverage =new GeographicalCoverage();
                geographicalCoverage.setTypeid(rs.getString("typeid"));
                geographicalCoverage.setTypename(rs.getString("typename"));
                geographicalCoverage.setState_id(rs.getString("state_id"));
                geographicalCoverage.setState_name(rs.getString("state_name"));
                geographicalCoverage.setDistrict_id(rs.getString("district_id"));
                geographicalCoverage.setDistrict_name(rs.getString("district_name"));
                geographicalCoverage.setBlock_id(rs.getString("block_id"));
                geographicalCoverage.setBlock_name(rs.getString("block_name"));
                geographicalCoverage.setPanchayat_id(rs.getString("panchayat_id"));
                geographicalCoverage.setPanchayat_name(rs.getString("panchayat_name"));
                geographicalCoverage.setTotaldistrict(rs.getString("totaldistrict"));
                geographicalCoverage.setTotalblock(rs.getString("totalblock"));
                geographicalCoverage.setTotalpanchayat(rs.getString("totalpanchayat"));
                geographicalCoverage.setTotalvillage(rs.getString("totalvillage"));
                geographicalCoverage.setCoveragedistrict(rs.getString("coveragedistrict"));
                geographicalCoverage.setCoverageblock(rs.getString("coverageblock"));
                geographicalCoverage.setCoveragepanchayat(rs.getString("coveragepanchayat"));
                geographicalCoverage.setCoveragevillage(rs.getString("coveragevillage"));
                geographicalCoverage.setPerdistrict(rs.getString("perdistrict"));
                geographicalCoverage.setPerblock(rs.getString("perblock"));
                geographicalCoverage.setPerpanchayat(rs.getString("perpanchayat"));
                geographicalCoverage.setPervillage(rs.getString("pervillage"));
                geographicalCoverageList.add(geographicalCoverage);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getgeographicalcoverage(?,?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getgeographicalcoverage(?,?,?,?,?,?,?) Failed!");
        }
        logger.info("Call Procedure");
        return  geographicalCoverageList;
    }
    public List<CboPromotedResponse> fn_getcbopromoteddata(String loctype, String dto, String dfrom, String sid, String did, String bid, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<CboPromotedResponse> cbopromotedlist = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getcbopromoteddata(?,?,?,?,?,?)}");
            stmt.setString(1, loctype);
            stmt.setString(2, dto);
            stmt.setString(3, dfrom);
            stmt.setString(4, sid);
            stmt.setString(5, did);
            stmt.setString(6, bid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CboPromotedResponse cbopromoteddata =new CboPromotedResponse();
                cbopromoteddata.setSno(rs.getString("sno"));
                cbopromoteddata.setState_id(rs.getString("state_id"));
                cbopromoteddata.setState_name(rs.getString("state_name"));
                cbopromoteddata.setDistrict_id(rs.getString("district_id"));
                cbopromoteddata.setDistrict_name(rs.getString("district_name"));
                cbopromoteddata.setBlock_id(rs.getString("block_id"));
                cbopromoteddata.setBlock_name(rs.getString("block_name"));
                cbopromoteddata.setTotal_clf(rs.getString("total_clf"));
                cbopromoteddata.setTotal_clf_shg(rs.getString("total_clf_shg"));
                cbopromoteddata.setTotal_clf_memebers(rs.getString("total_clf_members"));
                cbopromoteddata.setTotal_shg(rs.getString("total_shg"));;
                cbopromoteddata.setTarget_shg_members(rs.getString("Target_shg_members"));
                cbopromoteddata.setTotal_vo(rs.getString("total_vo"));
                cbopromoteddata.setTotal_vo_shg(rs.getString("total_vo_shg"));
                cbopromoteddata.setTotal_vo_members(rs.getString("total_vo_members"));
                cbopromotedlist.add(cbopromoteddata);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getcbopromoteddata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getcbopromoteddata(?,?,?,?,?,?) Failed!");
        }
        return cbopromotedlist;
    }
    public List<InactiveCbosResponse> fn_InactiveCbofunction(String loctype, String dto, String dfrom, String sid, String did, String bid, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<InactiveCbosResponse> inactiveCboslist = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getinactivecbosdata(?,?,?,?,?,?)}");
            stmt.setString(1, loctype);
            stmt.setString(2, dto);
            stmt.setString(3, dfrom);
            stmt.setString(4, sid);
            stmt.setString(5, did);
            stmt.setString(6, bid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                InactiveCbosResponse inactiveCbosResponse =new InactiveCbosResponse();
                inactiveCbosResponse.setSno(rs.getString("sno"));
                inactiveCbosResponse.setState_id(rs.getString("state_id"));
                inactiveCbosResponse.setState_name(rs.getString("state_name"));
                inactiveCbosResponse.setDistrict_id(rs.getString("district_id"));
                inactiveCbosResponse.setDistrict_name(rs.getString("district_name"));
                inactiveCbosResponse.setBlock_id(rs.getString("block_id"));
                inactiveCbosResponse.setBlock_name(rs.getString("block_name"));
                inactiveCbosResponse.setApproved_shg(rs.getString("approved_shg"));
                inactiveCbosResponse.setInactive_shg(rs.getString("inactive_shg"));
                inactiveCbosResponse.setInactive_shg_members(rs.getString("inactive_shg_members"));
                inactiveCbosResponse.setInactive_vo(rs.getString("inactive_vo"));;
                inactiveCbosResponse.setApproved_vo(rs.getString("approved_vo"));
                inactiveCbosResponse.setInactive_clf(rs.getString("inactive_clf"));
                inactiveCbosResponse.setApproved_clf(rs.getString("approved_clf"));
                inactiveCboslist.add(inactiveCbosResponse);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getinactivecbosdata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getinactivecbosdata(?,?,?,?,?,?) Failed!");
        }
        return inactiveCboslist;
    }
    public  List<SocialMoblizationResponse> fn_getsocialmobilizationdata(String loctype, String dto, String dfrom, String sid, String did,
                                                                         String bid, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<SocialMoblizationResponse> socialMoblizationList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getsocialmobilizationdata(?,?,?,?,?,?)}");
            stmt.setString(1, loctype);
            stmt.setString(2, dto);
            stmt.setString(3, dfrom);
            stmt.setString(4, sid);
            stmt.setString(5, did);
            stmt.setString(6, bid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                SocialMoblizationResponse socialMoblization =new SocialMoblizationResponse();
                socialMoblization.setState_name(rs.getString("state_name"));
                socialMoblization.setState_id(rs.getString("state_id"));
                socialMoblization.setDistrict_id(rs.getString("district_id"));
                socialMoblization.setDistrict_name(rs.getString("district_name"));
                socialMoblization.setBlock_id(rs.getString("block_id"));
                socialMoblization.setBlock_name(rs.getString("block_name"));
                socialMoblization.setTotal_rural_households(rs.getString("total_rural_households"));
                socialMoblization.setTarget_rural_households(rs.getString("target_rural_households"));
                socialMoblization.setHousehold_mobilized(rs.getString("household_mobilized"));
                socialMoblizationList.add(socialMoblization);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getsocialmobilizationdata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getsocialmobilizationdata(?,?,?,?,?,?) Failed!");
        }
        return socialMoblizationList;
    }
    public List<AccountDataResponse> fn_Numberofaccount(String locationtype,String state_id, String district_id,
                                                                           String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<AccountDataResponse> numberofAccountDataResponseList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_numberofaccountdata(?,?,?,?)}");
            stmt.setString(1, locationtype);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AccountDataResponse ofAccountData=new AccountDataResponse();
                ofAccountData.setState_name(rs.getString("state_name"));
                ofAccountData.setState_id(rs.getString("state_id"));
                ofAccountData.setDistrict_id(rs.getString("district_id"));
                ofAccountData.setDistrict_name(rs.getString("district_name"));
                ofAccountData.setBlock_id(rs.getString("block_id"));
                ofAccountData.setBlock_name(rs.getString("block_name"));
                ofAccountData.setNoofshg(rs.getString("noofshg"));
                ofAccountData.setNoofshgwithbank(rs.getString("noofshgwithbank"));
                ofAccountData.setOneac(rs.getString("oneac"));
                ofAccountData.setTwoac(rs.getString("twoac"));
                ofAccountData.setOneac(rs.getString("moreac"));
                numberofAccountDataResponseList.add(ofAccountData);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_numberofaccountdata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_numberofaccountdata(?,?,?,?) Failed!");
        }
        return numberofAccountDataResponseList;
    }
    public List<BankAccountDetailsResponse> fn_bankaccountdetailsdata(String location_type, String state_id, String district_id,
                                                                      String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<BankAccountDetailsResponse> bankAccountDetailsList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_bankaccountdetailsdata(?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BankAccountDetailsResponse bankDetails = new BankAccountDetailsResponse();
                bankDetails.setState_id(rs.getString("state_id"));
                bankDetails.setState_name(rs.getString("state_name"));
                bankDetails.setDistrict_id(rs.getString("district_id"));
                bankDetails.setDistrict_name(rs.getString("district_name"));
                bankDetails.setBlock_id(rs.getString("block_id"));
                bankDetails.setBlock_name(rs.getString("block_name"));
                bankDetails.setNoofshg(rs.getString("noofshg"));
                bankDetails.setNoofshgwithbank(rs.getString("noofshgwithbank"));
                bankDetails.setNoofshgwithoutbank(rs.getString("noofshgwithoutbank"));
                bankDetails.setNoofvos(rs.getString("noofvos"));
                bankDetails.setNoofvoswithbank(rs.getString("noofvoswithbank"));
                bankDetails.setNoofvoswithoutbank(rs.getString("noofvoswithoutbank"));
                bankDetails.setNoofclfs(rs.getString("noofclfs"));
                bankDetails.setNoofclfwithbank(rs.getString("noofclfwithbank"));
                bankDetails.setNoofclfwithoutbank(rs.getString("noofclfwithoutbank"));
                bankAccountDetailsList.add(bankDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_bankaccountdetailsdata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_bankaccountdetailsdata(?,?,?,?) Failed!");
        }
        return bankAccountDetailsList;
    }
    public List<BankWiseCboDataResponse> fn_bankwisecboadata(String location_type, String state_id, String district_id,
                                                                      String block_id, String bank_id,String branch_id,String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<BankWiseCboDataResponse> bankwisedataList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_bankwisecbosdata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            stmt.setString(5,bank_id);
            stmt.setString(6,branch_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BankWiseCboDataResponse bankwisecbo = new BankWiseCboDataResponse();
                bankwisecbo.setSno(rs.getString("sno"));
                bankwisecbo.setState_id(rs.getString("state_id"));
                bankwisecbo.setState_name(rs.getString("state_name"));
                bankwisecbo.setDistrict_id(rs.getString("district_id"));
                bankwisecbo.setDistrict_name(rs.getString("district_name"));
                bankwisecbo.setBlock_id(rs.getString("block_id"));
                bankwisecbo.setBlock_name(rs.getString("block_name"));
                bankwisecbo.setNoofshg(rs.getString("noofshg"));
                bankwisecbo.setNoofvo(rs.getString("noofvo"));
                bankwisecbo.setNoofclf(rs.getString("noofclf"));
               bankwisedataList.add(bankwisecbo);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_bankwisecbosdata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_bankwisecbosdata(?,?,?,?,?,?) Failed!");
        }
        return bankwisedataList;
    }
    public List<MemberBankAccountDetailsResponse> fn_getmemberbankaccountdetailsdata(String location_type, String state_id, String district_id,
                                                                                     String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<MemberBankAccountDetailsResponse> memberBankAccountDetailsList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getmemberbankaccountdetailsdata(?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                MemberBankAccountDetailsResponse mBankDetails = new MemberBankAccountDetailsResponse();
                mBankDetails.setSno(rs.getString("sno"));
                mBankDetails.setState_id(rs.getString("state_id"));
                mBankDetails.setState_name(rs.getString("state_name"));
                mBankDetails.setDistrict_id(rs.getString("district_id"));
                mBankDetails.setDistrict_name(rs.getString("district_name"));
                mBankDetails.setBlock_id(rs.getString("block_id"));
                mBankDetails.setBlock_name(rs.getString("block_name"));
                mBankDetails.setTotal_member(rs.getString("total_member"));
                mBankDetails.setTotal_members_account(rs.getString("total_members_account"));
                mBankDetails.setPer_members_account(rs.getString("per_members_account"));
                mBankDetails.setTotal_members_adhar(rs.getString("total_members_adhar"));
                mBankDetails.setPer_members_adhar(rs.getString("per_members_adhar"));
                mBankDetails.setTotal_members_secc(rs.getString("total_members_secc"));
                mBankDetails.setPer_members_secc(rs.getString("per_members_secc"));
                memberBankAccountDetailsList.add(mBankDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getmemberbankaccountdetailsdata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getmemberbankaccountdetailsdata(?,?,?,?) Failed!");
        }
        return memberBankAccountDetailsList;
    }
    public List<MemberEducationReponse> fn_getmembereducation(String location_type, String state_id, String district_id,
                                                                                     String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<MemberEducationReponse> memberEducationList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getMemberEducationLeveldata(?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                MemberEducationReponse membereducation = new MemberEducationReponse();
                membereducation.setSno(rs.getString("sno"));
                membereducation.setState_id(rs.getString("state_id"));
                membereducation.setState_name(rs.getString("state_name"));
                membereducation.setDistrict_id(rs.getString("district_id"));
                membereducation.setDistrict_name(rs.getString("district_name"));
                membereducation.setBlock_id(rs.getString("block_id"));
                membereducation.setBlock_name(rs.getString("block_name"));
                membereducation.setTotal_shg(rs.getString("Total_shg"));
                membereducation.setTotal_shg_members(rs.getString("Total_shg_members"));
                membereducation.setIlliterate(rs.getString("Illiterate"));
                membereducation.setFunctional(rs.getString("functional"));
                membereducation.setMiddle8(rs.getString("Middle8"));
                membereducation.setPrimary5(rs.getString("Primary5"));
                membereducation.setSecondary12(rs.getString("Secondary12"));
                membereducation.setOther(rs.getString("Other"));
                memberEducationList.add(membereducation);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getMemberEducationLeveldata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getMemberEducationLeveldata(?,?,?,?) Failed!");
        }
        return memberEducationList;
    }
    public List<BankWiseCboAccountResponse> fn_bankwisecbosaccountdata(String location_type, String state_id, String district_id,String block_id, String btid, String bank_id, String branch_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<BankWiseCboAccountResponse> bankWiseCboAccountResponseList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_bankwisecbosaccountdata(?,?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            stmt.setString(5, btid);
            stmt.setString(6, bank_id);
            stmt.setString(7, branch_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BankWiseCboAccountResponse cboBankDetails = new BankWiseCboAccountResponse();
                cboBankDetails.setSno(rs.getString("sno"));
                cboBankDetails.setBanktypeid(rs.getString("banktypeid"));
                cboBankDetails.setBank_type(rs.getString("bank_type"));
                cboBankDetails.setBank_code(rs.getString("bank_code"));
                cboBankDetails.setBank_name(rs.getString("bank_name"));
                cboBankDetails.setBranch_code(rs.getString("branch_code"));
                cboBankDetails.setBranch_name(rs.getString("branch_name"));
                cboBankDetails.setNoofshg(rs.getString("noofshg"));
                cboBankDetails.setNoofvo(rs.getString("noofvo"));
                cboBankDetails.setNoofclf(rs.getString("noofclf"));
                cboBankDetails.setNoof(rs.getString("noof"));
                bankWiseCboAccountResponseList.add(cboBankDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_bankwisecbosaccountdata(?,?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_bankwisecbosaccountdata(?,?,?,?,?,?,?) Failed!");
        }
        return bankWiseCboAccountResponseList;
    }
    public List<ShgLivelyHoodDetailsResponse> fn_getshglivelyhooddetailsdata(String location_type, String state_id, String district_id,
                                                                             String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ShgLivelyHoodDetailsResponse> shgLivelyHoodDetailsList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getshglivelyhooddetailsdata(?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ShgLivelyHoodDetailsResponse shgLivelyHoodDetails = new ShgLivelyHoodDetailsResponse();
                shgLivelyHoodDetails.setSno(rs.getString("sno"));
                shgLivelyHoodDetails.setState_id(rs.getString("state_id"));
                shgLivelyHoodDetails.setState_name(rs.getString("state_name"));
                shgLivelyHoodDetails.setDistrict_id(rs.getString("district_id"));
                shgLivelyHoodDetails.setDistrict_name(rs.getString("district_name"));
                shgLivelyHoodDetails.setBlock_id(rs.getString("block_id"));
                shgLivelyHoodDetails.setBlock_name(rs.getString("block_name"));
                shgLivelyHoodDetails.setTotal_shg(rs.getString("total_shg"));
                shgLivelyHoodDetails.setTotalshglivelthood(rs.getString("totalshglivelthood"));
                shgLivelyHoodDetails.setTotalshglivestock(rs.getString("totalshglivestock"));
                shgLivelyHoodDetails.setTotalshgntfp(rs.getString("totalshgntfp"));
                shgLivelyHoodDetails.setTotalshgagriculture(rs.getString("totalshgagriculture"));
                shgLivelyHoodDetails.setNonfarm(rs.getString("nonfarm"));
                shgLivelyHoodDetailsList.add(shgLivelyHoodDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getshglivelyhooddetailsdata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getshglivelyhooddetailsdata(?,?,?,?) Failed!");
        }
        return shgLivelyHoodDetailsList;
    }

    public List<MemberLivelyHoodResponse> fn_getmemberlivelyhooddetailsdata(String location_type, String state_id, String district_id,
                                                                            String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<MemberLivelyHoodResponse> memberLivelyHoodDetailsList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_getmemberlivelyhooddetailsdata(?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, state_id);
            stmt.setString(3, district_id);
            stmt.setString(4, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                MemberLivelyHoodResponse memberLivelyHoodDetails = new MemberLivelyHoodResponse();
                memberLivelyHoodDetails.setSno(rs.getString("sno"));
                memberLivelyHoodDetails.setState_id(rs.getString("state_id"));
                memberLivelyHoodDetails.setState_name(rs.getString("state_name"));
                memberLivelyHoodDetails.setDistrict_id(rs.getString("district_id"));
                memberLivelyHoodDetails.setDistrict_name(rs.getString("district_name"));
                memberLivelyHoodDetails.setBlock_id(rs.getString("block_id"));
                memberLivelyHoodDetails.setBlock_name(rs.getString("block_name"));
                memberLivelyHoodDetails.setTotal_shg(rs.getString("total_shg"));
                memberLivelyHoodDetails.setTotalshglivelthood(rs.getString("totalshglivelthood"));
                memberLivelyHoodDetails.setTotalshglivestock(rs.getString("totalshglivestock"));
                memberLivelyHoodDetails.setTotalshgntfp(rs.getString("totalshgntfp"));
                memberLivelyHoodDetails.setTotalshgagriculture(rs.getString("totalshgagriculture"));
                memberLivelyHoodDetails.setNonfarm(rs.getString("nonfarm"));
                memberLivelyHoodDetailsList.add(memberLivelyHoodDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_getmemberlivelyhooddetailsdata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_getmemberlivelyhooddetailsdata(?,?,?,?) Failed!");
        }
        return memberLivelyHoodDetailsList;
    }
    public List<ShgByEachTypeResponse> fn_shgbyeachtypedata(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                            String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ShgByEachTypeResponse> shgByEachTypeList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_shgbyeachtypedata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ShgByEachTypeResponse shgByEachTypeDetails = new ShgByEachTypeResponse();
                shgByEachTypeDetails.setState_id(rs.getString("state_id"));
                shgByEachTypeDetails.setState_name(rs.getString("state_name"));
                shgByEachTypeDetails.setDistrict_id(rs.getString("district_id"));
                shgByEachTypeDetails.setDistrict_name(rs.getString("district_name"));
                shgByEachTypeDetails.setBlock_id(rs.getString("block_id"));
                shgByEachTypeDetails.setBlock_name(rs.getString("block_name"));
                shgByEachTypeDetails.setNoofshg(rs.getString("noofshg"));
                shgByEachTypeDetails.setNoofwomanshg(rs.getString("noofwomanshg"));
                shgByEachTypeDetails.setNoofpvtg(rs.getString("noofpvtg"));
                shgByEachTypeDetails.setNoofpwd(rs.getString("noofpwd"));
                shgByEachTypeDetails.setNoofelderly(rs.getString("noofelderly"));
                shgByEachTypeDetails.setNoofothers(rs.getString("noofothers"));
                shgByEachTypeDetails.setTotal(rs.getString("total"));
                shgByEachTypeList.add(shgByEachTypeDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_shgbyeachtypedata(?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_shgbyeachtypedata(?,?,?,?) Failed!");
        }
        return shgByEachTypeList;
    }
    public List<ShgBySocialCategoryResponse> fn_shgbysocialcategory(String category, String location_type, String date_to, String date_from, String state_id, String district_id, String block_id, String p_id,
                                                                    String v_id, String clf_id, String vo_id, String shg_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ShgBySocialCategoryResponse> shgBySCList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_shgbysocialcategory(?,?,?,?,?,?,?,?,?,?,?,?)}");
            stmt.setString(1, category);
            stmt.setString(2, location_type);
            stmt.setString(3, date_to);
            stmt.setString(4, date_from);
            stmt.setString(5, state_id);
            stmt.setString(6, district_id);
            stmt.setString(7, block_id);
            stmt.setString(8, p_id);
            stmt.setString(9, v_id);
            stmt.setString(10, clf_id);
            stmt.setString(11, vo_id);
            stmt.setString(12, shg_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ShgBySocialCategoryResponse shgBySCDetails = new ShgBySocialCategoryResponse();
                shgBySCDetails.setClf_id(rs.getString("clf_id"));
                shgBySCDetails.setClfname(rs.getString("clfname"));
                shgBySCDetails.setVo_id(rs.getString("vo_id"));
                shgBySCDetails.setVoname(rs.getString("voname"));
                shgBySCDetails.setShg_id(rs.getString("shg_id"));
                shgBySCDetails.setShgname(rs.getString("shgname"));
                shgBySCDetails.setState_id(rs.getString("state_id"));
                shgBySCDetails.setState_name(rs.getString("state_name"));
                shgBySCDetails.setDistrict_id(rs.getString("district_id"));
                shgBySCDetails.setDistrict_name(rs.getString("district_name"));
                shgBySCDetails.setBlock_id(rs.getString("block_id"));
                shgBySCDetails.setBlock_name(rs.getString("block_name"));
                shgBySCDetails.setPanchayatid(rs.getString("panchayatid"));
                shgBySCDetails.setPanchayat_name_en(rs.getString("panchayat_name_en"));
                shgBySCDetails.setVillageid(rs.getString("villageid"));
                shgBySCDetails.setVillage_name_en(rs.getString("village_name_en"));
                shgBySCDetails.setNoofshg(rs.getString("noofshg"));
                shgBySCDetails.setNoofmember(rs.getString("noofmember"));
                shgBySCDetails.setNoofshg_sc(rs.getString("noofshg_sc"));
                shgBySCDetails.setNoofmember_sc(rs.getString("noofmember_sc"));
                shgBySCDetails.setNoofshg_st(rs.getString("noofshg_st"));
                shgBySCDetails.setNoofmember_st(rs.getString("noofmember_st"));
                shgBySCDetails.setNoofshg_gen(rs.getString("noofshg_gen"));
                shgBySCDetails.setNoofmember_gen(rs.getString("noofmember_gen"));
                shgBySCDetails.setNoofshg_other(rs.getString("noofshg_other"));
                shgBySCDetails.setNoofmember_other(rs.getString("noofmember_other"));
                shgBySCList.add(shgBySCDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_shgbysocialcategory(?,?,?,?,?,?,?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_shgbysocialcategory(?,?,?,?,?,?,?,?,?,?,?,?) Failed!");
        }
        return shgBySCList;
    }

    public List<ShgInitiativeResponse> fn_shginitiativedata(String location_type, String date_to, String date_from,
                                                            String state_id, String district_id,
                                                            String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ShgInitiativeResponse> shgInitiativeList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_shginitiativedata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ShgInitiativeResponse shgInitiativeDetails = new ShgInitiativeResponse();
                shgInitiativeDetails.setState_id(rs.getString("state_id"));
                shgInitiativeDetails.setState_name(rs.getString("state_name"));
                shgInitiativeDetails.setDistrict_id(rs.getString("district_id"));
                shgInitiativeDetails.setDistrict_name(rs.getString("district_name"));
                shgInitiativeDetails.setBlock_id(rs.getString("block_id"));
                shgInitiativeDetails.setBlock_name(rs.getString("block_name"));
                shgInitiativeDetails.setTotal_shg(rs.getString("total_shg"));
                shgInitiativeDetails.setTotal_members(rs.getString("total_members"));
                shgInitiativeDetails.setCumlshg(rs.getString("cumlshg"));
                shgInitiativeDetails.setCumlmember(rs.getString("cumlmember"));
                shgInitiativeList.add(shgInitiativeDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_shginitiativedata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_shginitiativedata(?,?,?,?,?,?) Failed!");
        }
        return shgInitiativeList;
    }
    public List<ShgByDateResponse> fn_shgbydatedata(String location_type, String date_to, String date_from,
                                                    String state_id, String district_id,
                                                    String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ShgByDateResponse> shgByDateList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_shgbydatedata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ShgByDateResponse shgByDateDetails = new ShgByDateResponse();
                shgByDateDetails.setState_id(rs.getString("state_id"));
                shgByDateDetails.setState_name(rs.getString("state_name"));
                shgByDateDetails.setDistrict_id(rs.getString("district_id"));
                shgByDateDetails.setDistrict_name(rs.getString("district_name"));
                shgByDateDetails.setBlock_id(rs.getString("block_id"));
                shgByDateDetails.setBlock_name(rs.getString("block_name"));
                shgByDateDetails.setNoofshg(rs.getString("noofshg"));
                shgByDateDetails.setThrshg(rs.getString("thrshg"));
                shgByDateDetails.setSixshg(rs.getString("sixshg"));
                shgByDateDetails.setNineshg(rs.getString("nineshg"));
                shgByDateDetails.setOneshg(rs.getString("oneshg"));
                shgByDateDetails.setMoreoneshg(rs.getString("moreoneshg"));
                shgByDateList.add(shgByDateDetails);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_shgbydatedata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_shgbydatedata(?,?,?,?,?,?) Failed!");
        }
        return shgByDateList;
    }



    public List<LeaderLiveliHoodResponse> fn_leaderlivelihoodactivity(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                                      String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<LeaderLiveliHoodResponse> leaderLiveliHoodList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_leaderlivelihoodactivity(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                LeaderLiveliHoodResponse leaderLiveliHoodActi =new LeaderLiveliHoodResponse();
                leaderLiveliHoodActi.setState_id(rs.getString("state_id"));
                leaderLiveliHoodActi.setState_name(rs.getString("state_name"));
                leaderLiveliHoodActi.setDistrict_id(rs.getString("district_id"));
                leaderLiveliHoodActi.setDistrict_name(rs.getString("district_name"));
                leaderLiveliHoodActi.setBlock_id(rs.getString("block_id"));
                leaderLiveliHoodActi.setBlock_name(rs.getString("block_name"));
                leaderLiveliHoodActi.setNoofshg(rs.getString("noofshg"));
                leaderLiveliHoodActi.setNoofleaders(rs.getString("noofleaders"));
                leaderLiveliHoodActi.setAgriactivity(rs.getString("agriactivity"));
                leaderLiveliHoodActi.setHortactivity(rs.getString("hortactivity"));
                leaderLiveliHoodActi.setLivestockrearing(rs.getString("livestockrearing"));
                leaderLiveliHoodActi.setFisheryactivity(rs.getString("fisheryactivity"));
                leaderLiveliHoodActi.setNtfpcollection(rs.getString("ntfpcollection"));
                leaderLiveliHoodActi.setManufctrng(rs.getString("manufctrng"));
                leaderLiveliHoodActi.setTrading(rs.getString("trading"));
                leaderLiveliHoodActi.setServics(rs.getString("servics"));
                leaderLiveliHoodActi.setCustomhiringcenter(rs.getString("customhiringcenter"));
                leaderLiveliHoodActi.setAggregation(rs.getString("aggregation"));
                leaderLiveliHoodActi.setOthers(rs.getString("others"));
                leaderLiveliHoodList.add(leaderLiveliHoodActi);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_leaderlivelihoodactivity(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_leaderlivelihoodactivity(?,?,?,?,?,?) Failed!");
        }
        return leaderLiveliHoodList;
    }


    public List<LeaderEducationResponse> fn_leadereducationdetails(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                                   String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<LeaderEducationResponse> leaderEducationList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_leadereducationdetails(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                LeaderEducationResponse leaderEducation =new LeaderEducationResponse();
                leaderEducation.setState_id(rs.getString("state_id"));
                leaderEducation.setState_name(rs.getString("state_name"));
                leaderEducation.setDistrict_id(rs.getString("district_id"));
                leaderEducation.setDistrict_name(rs.getString("district_name"));
                leaderEducation.setBlock_id(rs.getString("block_id"));
                leaderEducation.setBlock_name(rs.getString("block_name"));
                leaderEducation.setNoofshg(rs.getString("noofshg"));
                leaderEducation.setNoofleaders(rs.getString("noofleaders"));
                leaderEducation.setIlleterate(rs.getString("illeterate"));
                leaderEducation.setFunctionallit(rs.getString("functionallit"));
                leaderEducation.setPrimaryupto5(rs.getString("primaryupto5"));
                leaderEducation.setMiddleupto8(rs.getString("middleupto8"));
                leaderEducation.setSrsec12(rs.getString("srsec12"));
                leaderEducation.setVoctraining(rs.getString("voctraining"));
                leaderEducation.setOthers(rs.getString("others"));
                leaderEducationList.add(leaderEducation);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_leadereducationdetails(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_leadereducationdetails(?,?,?,?,?,?) Failed!");
        }
        return leaderEducationList;
    }

    public List<ClfSubCommityResponse> fn_clfsubcommitydata(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                            String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ClfSubCommityResponse> clfSCList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_clfsubcommitydata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ClfSubCommityResponse clfSC =new ClfSubCommityResponse();
                clfSC.setState_id(rs.getString("state_id"));
                clfSC.setState_name(rs.getString("state_name"));
                clfSC.setDistrict_id(rs.getString("district_id"));
                clfSC.setDistrict_name(rs.getString("district_name"));
                clfSC.setBlock_id(rs.getString("block_id"));
                clfSC.setBlock_name(rs.getString("block_name"));
                clfSC.setNoclfs(rs.getString("noclfs"));
                clfSC.setBanklinkage(rs.getString("banklinkage"));
                clfSC.setAssestver(rs.getString("assestver"));
                clfSC.setLivlihoodprom(rs.getString("livlihoodprom"));
                clfSC.setMonitoring(rs.getString("monitoring"));
                clfSC.setSocialaction(rs.getString("socialaction"));
                clfSC.setSpecial(rs.getString("special"));
                clfSC.setTotal(rs.getString("total"));
                clfSCList.add(clfSC);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_clfsubcommitydata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_clfsubcommitydata(?,?,?,?,?,?) Failed!");
        }
        return clfSCList;
    }

    public List<VoSubCommityResponse> fn_vosubcommitydata(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                          String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<VoSubCommityResponse> voSCList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_vosubcommitydata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                VoSubCommityResponse voSC =new VoSubCommityResponse();
                voSC.setState_id(rs.getString("state_id"));
                voSC.setState_name(rs.getString("state_name"));
                voSC.setDistrict_id(rs.getString("district_id"));
                voSC.setDistrict_name(rs.getString("district_name"));
                voSC.setBlock_id(rs.getString("block_id"));
                voSC.setBlock_name(rs.getString("block_name"));
                voSC.setNovos(rs.getString("novos"));
                voSC.setBanklinkage(rs.getString("banklinkage"));
                voSC.setAssestver(rs.getString("assestver"));
                voSC.setLivlihoodprom(rs.getString("livlihoodprom"));
                voSC.setMonitoring(rs.getString("monitoring"));
                voSC.setSocialaction(rs.getString("socialaction"));
                voSC.setSpecial(rs.getString("special"));
                voSC.setTotal(rs.getString("total"));
                voSCList.add(voSC);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_vosubcommitydata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_vosubcommitydata(?,?,?,?,?,?) Failed!");
        }
        return voSCList;
    }

    public List<ComparativeProgressReportResponse> fn_comparativeprogressreportsdata(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                                                     String block_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<ComparativeProgressReportResponse> compReList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_comparativeprogressreportsdata(?,?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            stmt.setString(6, block_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ComparativeProgressReportResponse compRe =new ComparativeProgressReportResponse();
                compRe.setState_id(rs.getString("state_id"));
                compRe.setState_name(rs.getString("state_name"));
                compRe.setDistrict_id(rs.getString("district_id"));
                compRe.setDistrict_name(rs.getString("district_name"));
                compRe.setBlock_id(rs.getString("block_id"));
                compRe.setBlock_name(rs.getString("block_name"));
                compRe.setPreshg(rs.getString("preshg"));
                compRe.setPremembers(rs.getString("premembers"));
                compRe.setCurrentshg(rs.getString("currentshg"));
                compRe.setCurrentmember(rs.getString("currentmember"));
                compReList.add(compRe);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_comparativeprogressreportsdata(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_comparativeprogressreportsdata(?,?,?,?,?,?) Failed!");
        }
        return compReList;
    }

    public List<BlockSaturationResponse> fn_blocksaturation(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                                                      String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<BlockSaturationResponse> blockSaturationList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_blocksaturation(?,?,?,?,?)}");
            stmt.setString(1, location_type);
            stmt.setString(2, date_to);
            stmt.setString(3, date_from);
            stmt.setString(4, state_id);
            stmt.setString(5, district_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BlockSaturationResponse blockSaturation =new BlockSaturationResponse();
                blockSaturation.setState_id(rs.getString("state_id"));
                blockSaturation.setState_name(rs.getString("state_name"));
                blockSaturation.setDistrict_id(rs.getString("district_id"));
                blockSaturation.setDistrict_name(rs.getString("district_name"));
                blockSaturation.setZeroto3(rs.getString("zeroto3"));
                blockSaturation.setThreeto6(rs.getString("threeto6"));
                blockSaturation.setSixto10(rs.getString("sixto10"));
                blockSaturation.setTenplus(rs.getString("tenplus"));
                blockSaturation.setTotal1(rs.getString("total1"));
                blockSaturation.setZeroto3(rs.getString("zeroto3_2"));
                blockSaturation.setThreeto6_2(rs.getString("threeto6_2"));
                blockSaturation.setSixto10_2(rs.getString("sixto10_2"));
                blockSaturation.setTenplus_2(rs.getString("tenplus_2"));
                blockSaturation.setTotal2(rs.getString("total2"));
                blockSaturationList.add(blockSaturation);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_blocksaturation(?,?,?,?,?,?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_blocksaturation(?,?,?,?,?,?) Failed!");
        }
        return blockSaturationList;
    }

    public List<BankNameDataResponse> fn_getbanknamedata(String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<BankNameDataResponse> BankNameDatalist = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_banknamedata()}");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BankNameDataResponse bankNameDataResponse = new BankNameDataResponse();
                bankNameDataResponse.setBank_code(rs.getString("bank_code"));
                bankNameDataResponse.setBank_name(rs.getString("bank_name"));
                BankNameDatalist.add(bankNameDataResponse);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_banknamedata() Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_banknamedata() Failed!");
        }
        return BankNameDatalist;
    }

    public List<BankBranchNameResponse> fn_getbankbranchnamedata(String bank_code,String cbo_id, String db_name) {
        Connection con;
        CallableStatement stmt = null;
        String url_sp = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        List<BankBranchNameResponse> BankBranchNameDatalist = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url_sp, user_sp, password_sp);
            logger.info("Connected to the PostgreSQL server successfully.");
            stmt = con.prepareCall("{call fn_branchnamedata(?,?)}");
            stmt.setString(1,bank_code);
            stmt.setString(2,cbo_id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BankBranchNameResponse bankNameDataResponse = new BankBranchNameResponse();
                bankNameDataResponse.setBank_branch_code(rs.getString("bank_branch_code"));
                bankNameDataResponse.setBank_branch_name(rs.getString("bank_branch_name"));
                BankBranchNameDatalist.add(bankNameDataResponse);
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Call Procedure fn_branchnamedata(?) Failed!", e.getMessage());
            throw new DatabaseOperationError("Call Procedure fn_branchnamedata(?) Failed!");
        }
        return BankBranchNameDatalist;
    }
}

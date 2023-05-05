

package org.apache.fineract.cn.reporting.internal.service;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankBranchCboApiRestService {
    private final Logger logger;
    private final BankDetailApiRepository bankDetailApiRepository;
    //  private final BranchDetailApiRepository branchDetailApiRepository;

    @Autowired
    public BankBranchCboApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                       final BankDetailApiRepository bankDetailApiRepository){
        super();
        this.logger = logger;
        this.bankDetailApiRepository = bankDetailApiRepository;
        //    this.branchDetailApiRepository = branchDetailApiRepository;

    }

    public List<ResponseBankApiDeatils> fetchBankDetailsList(RequestBankApiDeatils requestBankApiDeatils) {
        Integer bankId = 50;
        Integer flag;
        if (requestBankApiDeatils.getFlag() == 1 && requestBankApiDeatils.getBankId()==null) {
            flag = requestBankApiDeatils.getFlag();
        }else if (requestBankApiDeatils.getFlag() == 2 && requestBankApiDeatils.getBankId() != null) {
            flag = requestBankApiDeatils.getFlag();

            // if (requestBankApiDeatils.getFlag() == 2 && requestBankApiDeatils.getBankId()!=null) {
            //  flag = requestBankApiDeatils.getFlag();
        }
        else{
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }

        flag = 2;
        if (requestBankApiDeatils.getBankId() == null) {
            requestBankApiDeatils.setBankId(-1);
        } else {
            flag = 2;
        }

        if (requestBankApiDeatils.getStateId() == null) {
            requestBankApiDeatils.setStateId(-1);
        } else {
            flag = 2;
        }
        if (requestBankApiDeatils.getGeographicalFlag() == null) {
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }

        /*else {

            if (requestBankApiDeatils.getFlag() == 2) {
                flag = requestBankApiDeatils.getFlag();
            }

     */
            /*
            flag = 2;
            if (requestBankApiDeatils.getStateId() == null) {
                requestBankApiDeatils.setStateId(-1);
            } else {
                flag = 2;
            }
            */
/*
            flag = 2;
            if (requestBankApiDeatils.getBankId() == null) {
                requestBankApiDeatils.setBankId(-1);
            } else {
                flag = 2;
            }
            if (requestBankApiDeatils.getGeographicalFlag() == null) {
               // requestBankApiDeatils.setGeographicalFlag(-1);
                 throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
            }
        }
*/

        List<ResponseBankApiDeatils> responseBankApiDeatilsList = new ArrayList<ResponseBankApiDeatils>();
        List<BankDetailApiEntity> bankDetailApiEntityList = null;
        //List<BranchDetailApiEntity> bankDetailApiEntityList;
        if (bankId == null) {
            bankDetailApiEntityList = bankDetailApiRepository.
                    fetchBanksList(
                            requestBankApiDeatils.getStateId(),
                            requestBankApiDeatils.getGeographicalFlag()

                    );
        }else {

            if (bankId !=null ) {
                bankDetailApiEntityList = bankDetailApiRepository.
                        fetchBranchList1(
                                requestBankApiDeatils.getBankId(),
                                requestBankApiDeatils.getGeographicalFlag()

                        );
            }

            bankDetailApiEntityList.forEach(bankDetailApiEntity ->
            {
                ResponseBankApiDeatils responseBankApiDeatils = CommonApiMapper.map(bankDetailApiEntity);
                responseBankApiDeatilsList.add(responseBankApiDeatils);
            });
        }
        return responseBankApiDeatilsList;
    }
}







/*

    public List<ResponseBranchApiDeatils> fetchBranchDetailsList(RequestBranchApiDeatils requestBranchApiDeatils) {

        Integer bankId = 50;
        Integer flag;
        if (requestBranchApiDeatils.getFlag() != null) {
            flag = requestBranchApiDeatils.getFlag();
        }

 */

/*
        flag = 2;
        if (requestBranchApiDeatils.getStateId() == null) {
            requestBranchApiDeatils.setStateId(-1);
        } else {
            flag = 2;
        }

 */
    /*
        flag=2;
        if (requestBranchApiDeatils.getBankId() == null) {
            requestBranchApiDeatils.setBankId(-1);
        } else {
            flag = 2;
        }
        if (requestBranchApiDeatils.getGeographicalFlag() == null) {
            requestBranchApiDeatils.setGeographicalFlag(-1);
           // throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }


        List<ResponseBranchApiDeatils> responseBranchApiDeatilsList = new ArrayList<ResponseBranchApiDeatils>();
        List<BranchDetailApiEntity> branchDetailApiEntityList;
        if (bankId != 55 ) {
            branchDetailApiEntityList = branchDetailApiRepository.
                    fetchBranchsList(
                            requestBranchApiDeatils.getBankId(),
                            requestBranchApiDeatils.getGeographicalFlag()

                    );
            branchDetailApiEntityList.forEach(branchDetailApiEntity ->
            {
                ResponseBranchApiDeatils responseBranchApiDeatils = CommonApiMapper.map(branchDetailApiEntity);
                responseBranchApiDeatilsList.add(responseBranchApiDeatils);
            });
        }
        return responseBranchApiDeatilsList;
    }

}

     */




/*
       if(transactionSummaryRequest.getDistrictId() == null){
               transactionSummaryRequest.setDistrictId(-1);
               }else{
               orderBy= " c.yearMonth,districtId ASC";
               }
               
 */
package Creational.Builder.YanMo.ComplexBuilderWithoutConstraint;

/**
 * Created by sahoo on 16/4/18.
 */
public class ProductInsuranceContract {

    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    ProductInsuranceContract(ConcreteBuilder builder){
        this.contractId=builder.getContractId();
        this.personName=builder.getPersonName();
        this.companyName=builder.getCompanyName();
        this.beginDate=builder.getBeginDate();
        this.endDate=builder.getEndDate();
        this.otherData=builder.getOtherData();
    }

    public void someOperation(){
        System.out.println("Now in Insurance Contract someOperation == "+this.contractId);
    }
}

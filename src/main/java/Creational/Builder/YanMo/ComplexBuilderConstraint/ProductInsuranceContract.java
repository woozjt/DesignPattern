package Creational.Builder.YanMo.ComplexBuilderConstraint;


/**
 * Created by sahoo on 16/4/19.
 */
public class ProductInsuranceContract {

    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    private ProductInsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    public static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public String getContractId() {
            return contractId;
        }

        public String getPersonName() {
            return personName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public long getBeginDate() {
            return beginDate;
        }

        public long getEndDate() {
            return endDate;
        }

        public String getOtherData() {
            return otherData;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ProductInsuranceContract build() {

            if (contractId==null || contractId.trim().length()==0){
                throw new IllegalArgumentException("合同编号不能为空");
            }

            boolean signPerson= personName!=null && personName.trim().length()>0;
            boolean signCompany=companyName!=null && companyName.trim().length()>0;
            if (signPerson && signCompany){
                throw new IllegalArgumentException("一份保险合同不能同时与人和公司签订");
            }
            if (signPerson ==false && signCompany==false){
                throw new IllegalArgumentException("一份保险合同不能没有签订对象");
            }

            if (beginDate<=0){
                throw new IllegalArgumentException("合同必须有保险开始生效的日期");
            }

            if (endDate<=0){
                throw new IllegalArgumentException("合同必须有保险失效的日期");
            }

            if (beginDate>=endDate){
                throw new IllegalArgumentException("保险失效的日期必须大于保险生效日期");
            }

            return new ProductInsuranceContract(this);
        }
    }

    public void someOperation() {
        System.out.println("Now in Insurance Contract someOperation == " + this.contractId);
    }
}

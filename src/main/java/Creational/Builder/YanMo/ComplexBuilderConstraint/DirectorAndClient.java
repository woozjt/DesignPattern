package Creational.Builder.YanMo.ComplexBuilderConstraint;

/**
 * Created by sahoo on 16/4/19.
 */
public class DirectorAndClient {

    public static void Start() {
        ProductInsuranceContract.ConcreteBuilder builder = new ProductInsuranceContract.ConcreteBuilder("001", 12345L, 67890L);

        ProductInsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();

        contract.someOperation();
    }
}

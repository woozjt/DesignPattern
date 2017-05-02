package Creational.Builder.YanMo.ComplexBuilderWithoutConstraint;

/**
 * Created by sahoo on 16/4/18.
 */
public class DirecorAndClient {

    public static void Start() {
        ConcreteBuilder builder = new ConcreteBuilder("001", 12345L, 67890L);

        ProductInsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();

        contract.someOperation();
    }
}

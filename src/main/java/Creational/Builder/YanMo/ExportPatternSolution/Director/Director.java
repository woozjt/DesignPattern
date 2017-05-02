package Creational.Builder.YanMo.ExportPatternSolution.Director;

import Creational.Builder.YanMo.ExportPatternSolution.BaseBuilder.Builder;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportDataModel;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportFooterModel;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm,
                          Map<String,Collection<ExportDataModel>> mapData,
                          ExportFooterModel efm){
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(efm);
    }
}

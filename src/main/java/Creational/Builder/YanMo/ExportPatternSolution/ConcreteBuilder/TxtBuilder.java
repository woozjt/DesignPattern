package Creational.Builder.YanMo.ExportPatternSolution.ConcreteBuilder;

import Creational.Builder.YanMo.ExportPatternSolution.BaseBuilder.Builder;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportDataModel;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportFooterModel;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class TxtBuilder implements Builder {
    private StringBuffer buffer=new StringBuffer();

    public void buildHeader(ExportHeaderModel ehm) {

    }

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {

    }

    public void buildFooter(ExportFooterModel efm) {

    }

    public StringBuffer getResult(){
        return buffer;
    }
}

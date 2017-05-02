package Creational.Builder.YanMo.ExportPatternSolution.BaseBuilder;

import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportDataModel;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportFooterModel;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public interface Builder {

    void buildHeader(ExportHeaderModel ehm);
    void buildBody(Map<String,Collection<ExportDataModel>> mapData);
    void buildFooter(ExportFooterModel efm);
}

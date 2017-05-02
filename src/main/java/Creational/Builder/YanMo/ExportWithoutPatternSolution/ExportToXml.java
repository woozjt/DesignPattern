package Creational.Builder.YanMo.ExportWithoutPatternSolution;

import java.util.Collection;
import java.util.Map;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class ExportToXml {

    public void export(ExportHeaderModel ehm
            , Map<String, Collection<ExportDataModel>> mapData
            , ExportFooterModel efm) {
        //用来记录最终输出的文件内容
        //1：先来拼接文件头的内容
        //2：接着来拼接文件体的内容
        //3：接着来拼接文件尾的内容

    }
}

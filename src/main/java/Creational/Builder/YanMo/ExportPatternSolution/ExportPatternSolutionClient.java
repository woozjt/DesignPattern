package Creational.Builder.YanMo.ExportPatternSolution;

import Creational.Builder.YanMo.ExportPatternSolution.ConcreteBuilder.TxtBuilder;
import Creational.Builder.YanMo.ExportPatternSolution.ConcreteBuilder.XmlBuilder;
import Creational.Builder.YanMo.ExportPatternSolution.Director.Director;
import Creational.Builder.YanMo.ExportWithoutPatternSolution.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class ExportPatternSolutionClient {
    public static void Start(){
        ExportHeaderModel ehm = new ExportHeaderModel();

        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");
        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);

        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");
//      测试输出到文本文件
        TxtBuilder txtBuilder=new TxtBuilder();
        Director director=new Director(txtBuilder);
        director.construct(ehm,mapData,efm);
        System.out.println("输出到文本文件的内容：\n" + txtBuilder.getResult());

//      测试输出到xml文件
        XmlBuilder xmlBuilder=new XmlBuilder();
        Director director2=new Director(xmlBuilder);
        director2.construct(ehm,mapData,efm);
        System.out.println("输出到XML文件的内容：\n" + xmlBuilder.getResult());

    }
}

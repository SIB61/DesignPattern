package flyWeightPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MetaInfoFactory  {
  static HashMap<String,MetaInfo> InfoList = new HashMap<>();
    public static MetaInfo getMetaInfo(String writerName, String publisherName) {
        MetaInfo metaInfo;
        if(InfoList.containsKey(writerName)){
            metaInfo = InfoList.get(writerName);
        }else {
            metaInfo = new MetaInfo(writerName,publisherName);
            InfoList.put(writerName,metaInfo);
            System.out.println("metaInfo created");
        }
        return metaInfo;
    }
}

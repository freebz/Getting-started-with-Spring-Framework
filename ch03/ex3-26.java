// 예제 3-26: DataTypesExample 클래스

package sample.spring.chapter03.beans;

import java.beans.ConstructorProperties;
.....
public class DataTypesExample {
    private static Logger logger = Logger.getLogger(DataTypesExample.class);

    @SuppressWarnings("rawtypes")
    @ConstructorProperties({ "byteArrayType", "charType", "charArray",
          "classType", "currencyType", "booleanType", "dateType", "longType",
	  "doubleType", "propertiesType", "listType", "mapType", "setType",
	  "anotherPropertiesType" })
    public DataTypesExample(byte[] byteArrayType, char charType,
          char[] charArray, Class classType, Currency currencyType,
          boolean booleanType, Date dateType, long longType,
          double doubleType, Properties propertiesType, List<Integer> listType,
          Map mapType, Set setType, Properties anotherPropertiesType) {
	.....
	logger.info("classType " + classType.getName());
	logger.info("listType " + listType);
	logger.info("mapType " + mapType);
	logger.info("setType " + setType);
	logger.info("anotherPropertiesType " + anotherPropertiesType);
    }
}

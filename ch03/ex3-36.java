// 예제 3-36: CollectionTypesExample 클래스

package sample.spring.chapter03.beans;

import java.util.List;
import java.util.Set;

public class CollectionTypesExample {
    private Set setType;
    private List listType;
    .....
    //-- 특성의 세터 메서드
    public void setSetType(Set setType) {
	this.setType = setType;
    }
    .....
}

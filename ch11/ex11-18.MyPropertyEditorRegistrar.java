// 예제 11-18: MyPropertyEditorRegistrar 클래스

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

public class MyPropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
	registry.registerCustomEditor(Date.class, new CustomDateEditor(
            new SimpleDateFormat("MM-dd-yyyy"), false));
    }
}

// 예제 13-26: FileUploadController

package sample.string.chapter13.web;

import org.springframework.web.multipart.MultipartFile;
.....
public class FileUploadController {

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public ModelAndView handleFileUpload(
        @RequestParam("myFileField") MultipartFile file) throws IOException {
	ModelMap modelData = new ModelMap();

	if (!file.isEmpty()) {
	    // -- 업로드된 파일을 파일 시스템에 저장
	    String successMessage = "File successfully uploaded";
	    modelData.put("uploadMessage", successMessage);
	    return new ModelAndView("uploadForm", modelData);
	}
	.....
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleException() {
	.....
    }
}

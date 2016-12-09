<!-- 예제 13-24: uploadForm.jsp - 업로드 양식 표시 -->

.....
<form method="post" action="/ch13-commons-file-upload/uploadFile"
      enctype="multipart/form-data">
  <table style="padding-left: 200px;">
    <tr>
      <td colspan="2"><c:out value="${uploadMessage}" /></td>
    </tr>
    <tr>
      <td><b>Select the file to be uploaded: &nbsp;</b></td>
      <td><input type="file" name="myFileField" /></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input type="button"
              value="Upload file" onclick="document.forms[0].submit();" /></td>
    </tr>
  </table>
</form>
.....

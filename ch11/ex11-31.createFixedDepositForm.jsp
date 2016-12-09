<!-- 예제 11-31: createFixedDepositForm.jsp - 스프링 form 태그 라이브러리 사용 -->

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    .....
    <form:form commandName="newFixedDepositDetails"
        name="createFixedDepositForm" method="POST"
	action="${pageContext.request.contextPath}/fixedDeposit?fdAction=create">
	.....
	<tr>
	    <td class="td"><b>Amount (in USD):</b></td>
	    <td class="td"><form:input path="depositAmount" />
	    	<font style="color: #C11B17;"><form:errors path="depositAmount"/></font>
	    </td>
	</tr>
	<tr>
	    <td class="td"><b>Maturity date:</b></td>
	    <td class="td"><form:input path="matuirtyDate" />
	    <font style="color: #C11B17;"><form:errors path="maturityDate"/></font></td>
	</tr>
	.....
	    <td class="td"><input type="submit" value="Save" />
	.....
    </form:form>
</html>

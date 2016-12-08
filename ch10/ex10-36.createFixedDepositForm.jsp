<!-- 예제 10-36: createFixedDepositForm.jsp -->

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form name="createFixedDepositForm" method="POST"
      action="${pageContext.request.contextPath}/fixedDeposit?fdAction=create">
        .....
       <td class="td"><b>Amount (in USD):</b></td>
       <td class="td">
	  <input type="text" name="depositAmount"
	     value="${requestScope.fixedDepositDetails.depositAmount}"/>
	  <font style="color: #C11B17;">
	     <c:out value="${requestScope['error.depositAmount']}"/></font>
       </td>
        .....
  <input type="submit" value="Save" />
</form>

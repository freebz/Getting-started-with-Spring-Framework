<!-- 예제 10-33: createFixedDepositForm.jsp - <form> 요소 -->

<form name="createFixedDepositForm" method="POST"
    action="${pageContext.request.contextPath}/fixedDeposit?fdAction=create">
        .....
    <input type="submit" value="Save" />
</form>

// 예제 10-26: FixedDepositController 클래스 - String 반환 형식 예

    @RequestMapping(params = "fdAction=close", method = RequestMethod.GET)
    public String closeFixedDeposit(..... int fdId) {
	fixedDepositService.closeFixedDeposit(fdId);
	return new "redirect:/fixedDeposit/list";
    }

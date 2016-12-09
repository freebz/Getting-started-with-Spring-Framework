// 예제 12-18: FixedDepositWSClient - openInvalidFixedDeposit 메서드

    private static void openInvalidFixedDeposit(RestTemplate restTemplate) {
	FixedDepositDetails fdd = new FixedDepositDetails();
	fdd.setDepositAmount("100");
	fdd.setEmail("99@somedomain.com");
	fdd.setTenure("12");
	
	ResponseEntity<FixedDepositDetails> responseEntity = restTemplate
	    .postForEntity("http://localhost:8080/ch12-webservice/fixedDeposits",
                fdd, FixedDepositDetails.class);

	FixedDepositDetails fixedDepositDetails = responseEntity.getBody();
	logger.info("Details of the newly created fixed deposit: "
		+ fixedDepositDetails);
    }


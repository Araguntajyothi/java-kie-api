package com.pam.springboot.service;

import java.util.HashMap;
import java.util.Map;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.UserTaskServicesClient;

import com.elt.LoanApproval.LoanApplication;

public class KieServerClient {

	public static long invokeWorkFlowWithLoanApplication() {
		Map<String, Object> map = new HashMap<String, Object>();
		LoanApplication amont = new LoanApplication();
		amont.setAmount(1);
		amont.setLoanApplicationStatus("Approved");
		amont.setAccountType("savings");
		amont.setLoanAmount(600000);
		map.put("amnt", amont);
		KieServerConfiguration serverClient = new KieServerConfiguration();
		KieServicesClient kieServicesClient = null;
		kieServicesClient = serverClient.getKieClient();
		ProcessServicesClient processClient = kieServicesClient.getServicesClient(ProcessServicesClient.class);
		UserTaskServicesClient useTaskClient = kieServicesClient.getServicesClient(UserTaskServicesClient.class);
		//BusinessRuleProvider businessRuleProvider = kieServicesClient.getServicesClient(BusinessRuleProvider.class);
		
		Long processInstanceId = processClient.startProcess("LoanApproval_1.0.0-SNAPSHOT", "LoanApproval.LoanApprovalProcess", map);
		System.out.println("process instance id is ::::::"+processInstanceId);
		
		return processInstanceId;
		
	}

	public static void main(String[] args) {
		invokeWorkFlowWithLoanApplication();
	}

	
}

package com.pam.springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.drools.compiler.compiler.BusinessRuleProvider;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.UserTaskServicesClient;

import com.trainingspace.testempproj.Employee;

public class KieServerClient {

	

	public static long invokeWorkFlowWithEmployee() {
		Map<String, Object> map = new HashMap<String, Object>();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("akshayaJyothi");
		map.put("emp", employee);
		KieServerConfiguration serverClient = new KieServerConfiguration();
		KieServicesClient kieServicesClient = null;
		kieServicesClient = serverClient.getKieClient();
		ProcessServicesClient processClient = kieServicesClient.getServicesClient(ProcessServicesClient.class);
		UserTaskServicesClient useTaskClient = kieServicesClient.getServicesClient(UserTaskServicesClient.class);
		BusinessRuleProvider businessRuleProvider = kieServicesClient.getServicesClient(BusinessRuleProvider.class);
		
		Long processInstanceId = processClient.startProcess("testEmpProj_1.0.0-SNAPSHOT", "testEmpProj.empTest", map);
		System.out.println("process instance id is ::::::"+processInstanceId);
		
		return processInstanceId;
		
	}

	public static void main(String[] args) {
		invokeWorkFlowWithEmployee();
	}
}

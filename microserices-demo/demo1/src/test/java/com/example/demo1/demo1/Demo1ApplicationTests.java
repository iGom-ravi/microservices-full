package com.example.demo1.demo1;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import com.example.demo1.demo1.values.AccountOpenBalance;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo1.demo1.controller.AccountBalanceController;
import com.example.demo1.demo1.service.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class Demo1ApplicationTests {
	 private final ObjectMapper objectMapper = new ObjectMapper();
@Mock
private AccountOpenBalanceService accountOpenBalanceService;
private AccountBalanceController accountBalanceController;


//	@Test
//	void contextLoads() throws Exception {
//AccountOpenBalance ent=objectMapper.readValue(new ClassPathResource("data/brand-company.json").getFile(), AccountOpenBalance.class);
//Optional<AccountOpenBalance> opt = Optional.of(ent);
//when(accountOpenBalanceService.getAccountBalance());
//brandingController.getBrandCompany("TIC");
//verify(brandCompanyService, times(1)).getByCompanyCd("TIC");
//	}

}

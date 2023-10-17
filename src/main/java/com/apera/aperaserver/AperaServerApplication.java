package com.apera.aperaserver;

import com.apera.aperaserver.model.*;
import com.apera.aperaserver.service.CarteiraService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AperaServerApplication{
	public static void main(String[] args) {
			SpringApplication.run(AperaServerApplication.class, args);
	}
}
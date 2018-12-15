package com.himalaya;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistributedLockApp {
	public static void main(String[] args) throws InterruptedException {
		SpringApplication app = new SpringApplication(DistributedLockApp.class);
		// 不启动WEB 环境
		app.setWebEnvironment(false);
		app.run(args);
		CountDownLatch latch = new CountDownLatch(1);
		latch.await();
	}
}

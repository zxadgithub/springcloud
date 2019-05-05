package com.zxa.configserver.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigServerStarter
 * @Description: //TODO
 * @Author: zhangxin_an
 * @CreateDate: 2019/5/5 14:59
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerStarter {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerStarter.class); }

}

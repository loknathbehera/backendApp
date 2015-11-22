package com.bb.controller;

import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilController {

	@RequestMapping("/detect-device")
	public @ResponseBody String detectDevice(Device device){
		
		String deviceType="Unknown";
		
		if(device.isNormal()){
			deviceType="Normal";
		}else if(device.isMobile()){
			deviceType="Mobile";
		}else if(device.isTablet()){
			deviceType="Tablet";
		}
		
		return deviceType+" device";
		
	}
}

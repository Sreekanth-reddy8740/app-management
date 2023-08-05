package org.sreekanth.app_management.Util;

import java.util.Properties;

public class ConnectionPropertiesUtil {

	public static Properties getMysqlDbProperties() {
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class","com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/config_db");
		properties.setProperty("hibernate.connection.username","root");
		properties.setProperty("hibernate.connection.password","password");
		properties.setProperty("hibernate.show_sql", "true");		
		return properties;
		
	}
}

package pe.com.bbva.harec.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
@MapperScan("pe.com.bbva.harec.dao")
@PropertySource("classpath:database.properties")
public class DataBaseConfig {
//	Logger logger = Logger.getLogger(DataBaseConfig.class);
    private static final String PROPERTY_NAME_JNDI 				= "app.jndi";
    private static final String PROPERTY_SCHEMA 				= "app.schema";

    @Resource
    private Environment env;
    
	@Bean
	public DataSource getDataSource() {
		System.out.println("Inicio la aplicacion IFAC SERVER");
		JndiDataSourceLookup lookup = new JndiDataSourceLookup();
		return lookup.getDataSource(env.getRequiredProperty(PROPERTY_NAME_JNDI));
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(getDataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());

		Properties properties = new Properties();
		properties.put("schema", env.getRequiredProperty(PROPERTY_SCHEMA));
		
		sessionFactory.setConfigurationProperties(properties);
		
//		ClassPathResource resource = new ClassPathResource("/database.properties");
//		Properties props = PropertiesLoaderUtils.loadProperties(resource);
//		
//		DatabaseIdProvider provider = new VendorDatabaseIdProvider();
//		provider.setProperties(props);
//		sessionFactory.setDatabaseIdProvider(provider);
		return sessionFactory;
	}
}

package tk.mybatis.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.springboot.mapper.CountryMapper;
import tk.mybatis.springboot.model.Country;

import java.util.List;

@SpringBootApplication
public class MybatisSpringbootApplication implements CommandLineRunner{

	private final static Logger LOGGER = LoggerFactory.getLogger(MybatisSpringbootApplication.class);

	@Autowired
	private CountryMapper countryMapper;

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringbootApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		List<Country> countries = countryMapper.selectAll();
		for (Country country:countries) {
			LOGGER.info(country.toString());
		}
	}
}

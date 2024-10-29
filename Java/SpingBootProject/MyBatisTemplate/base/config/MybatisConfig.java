package re.kaguya.re_service.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("re.kaguya.re_service.*.mapper")
public class MybatisConfig {
}

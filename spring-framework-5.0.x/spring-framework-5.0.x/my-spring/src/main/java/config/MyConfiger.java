package config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@Configurable
@ComponentScan({"bean","processor"})
public class MyConfiger {
}

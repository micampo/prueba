package com.co.konexinnovtion.utils;

import com.co.konexinnovtion.utils.ConstantConf;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {

    @SneakyThrows
    public static Properties loadPropertiesFile(){
        Properties prop = new Properties();
        String filename = ConstantConf.CONFIGURACION_PROPIEDADES;
        InputStream inputStream = new FileInputStream(filename);
        if (inputStream != null)
            prop.load(inputStream);
        return prop;

    }

}

package com.co.konexinnovtion.utils;

import java.util.Optional;

public class ConfigVariables {

    public static String gerUrlYoutube(){
        return Optional.ofNullable(System.getenv(ConstantConf.URL)).orElse((String) ApplicationProperties.loadPropertiesFile().get("urlYoutube"));
    }

    public static String gerUrlWikipedia(){
        return Optional.ofNullable(System.getenv(ConstantConf.URL)).orElse((String) ApplicationProperties.loadPropertiesFile().get("urlWikipedia"));
    }
}
